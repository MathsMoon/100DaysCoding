package Curso_Dojo.OOP.CleaningCode.Concurrency.DominioTest;

import Curso_Dojo.OOP.CleaningCode.Concurrency.Service.StoreServiceDeprecated;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    242 Rever aula.

    Essa aula serve para sabermos como usar uma função sincronizada para realizar
    tarefas de forma assíncronizada, como também criar um Executor próprio da classe
    para termos mais autonomia ao criarmos Threads e a utilizarmos.
*/

public class TestsCompletableFuture3 {
    public static void main(String[] args) {
        //Reorganizando agora com Streams:
        StoreServiceDeprecated storeService = new StoreServiceDeprecated();
        searchPricesAsyncCompletableFuture(storeService);
    }

    private static void searchPricesAsyncCompletableFuture(StoreServiceDeprecated storeService) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("store 1","store 2","store 3","store 4","store 5");
        ExecutorService executor = Executors.newFixedThreadPool(10, r -> {
            Thread thread = new Thread(r);
            thread.setDaemon(true);
            return thread;
        });

        List<CompletableFuture<Double>> collect = stores.stream().map(s -> CompletableFuture.supplyAsync(() -> storeService.getPriceSync(s), executor)).toList();
        List<Double> prices = collect.stream().map(CompletableFuture::join).toList();

        System.out.println(prices);
        //Mostrando o tempo que terminou o processo todo:
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n",(end - start));
    }
}