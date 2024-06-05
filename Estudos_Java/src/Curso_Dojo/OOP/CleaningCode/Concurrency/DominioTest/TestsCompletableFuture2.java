package Curso_Dojo.OOP.CleaningCode.Concurrency.DominioTest;

import Curso_Dojo.OOP.CleaningCode.Concurrency.Service.StoreService;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

    /*
        Revisar aula 241 para melhor entender o motivo da separação:
    */

public class TestsCompletableFuture2 {
    public static void main(String[] args) {
        //Reorganizando agora com Streams:
        StoreService storeService = new StoreService();
        searchPricesAsyncCompletableFuture(storeService);
    }

    private static void searchPricesAsyncCompletableFuture(StoreService storeService) {
        long start = System.currentTimeMillis();

        List<String> stores = List.of("store 1","store 2","store 3","store 4","store 5");

        List<CompletableFuture<Double>> completableFutures = stores.stream().
                map(storeService::getPricesAsyncCompletableFuture).collect(Collectors.toList());

        List<Double> prices = completableFutures.stream().map(CompletableFuture::join).collect(Collectors.toList());

        System.out.println(prices);

        //Mostrando o tempo que terminou o processo todo:
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n",(end - start));
    }
}