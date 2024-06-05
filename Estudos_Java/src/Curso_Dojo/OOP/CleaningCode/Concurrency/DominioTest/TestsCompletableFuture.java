package Curso_Dojo.OOP.CleaningCode.Concurrency.DominioTest;

import Curso_Dojo.OOP.CleaningCode.Concurrency.Service.StoreService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class TestsCompletableFuture {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        searchPricesAsyncCompletableFuture(storeService);
    }

    //Utilizando a forma Síncrona de pesquisa
    private static void searchPricesSync(StoreService storeService){
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPrinceSync("store 1"));
        System.out.println(storeService.getPrinceSync("store 2"));
        System.out.println(storeService.getPrinceSync("store 3"));
        System.out.println(storeService.getPrinceSync("store 4"));
        System.out.println(storeService.getPrinceSync("store 5"));
        long end = System.currentTimeMillis();

        System.out.printf("Time passed to searchPricesSync %dms%n",(end - start));
    }

    //Utilizando a forma Assíncrona com o Future:
    private static void searchPricesAsyncFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        Future<Double> pricesAsyncFuture1 = storeService.getPricesAsyncFuture("store 1");
        Future<Double> pricesAsyncFuture2 = storeService.getPricesAsyncFuture("store 2");
        Future<Double> pricesAsyncFuture3 = storeService.getPricesAsyncFuture("store 3");
        Future<Double> pricesAsyncFuture4 = storeService.getPricesAsyncFuture("store 4");
        Future<Double> pricesAsyncFuture5 = storeService.getPricesAsyncFuture("store 5");

        try { //Ao usar o get ele chama Exceptions, por isso é necessário usar envelopando com Try
            System.out.println(pricesAsyncFuture1.get());
            System.out.println(pricesAsyncFuture2.get());
            System.out.println(pricesAsyncFuture3.get());
            System.out.println(pricesAsyncFuture4.get());
            System.out.println(pricesAsyncFuture5.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n",(end - start));
        StoreService.shutdown();
    }

    //Utilizando a forma Assíncrona com o CompletableFuture:
    private static void searchPricesAsyncCompletableFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        CompletableFuture<Double> pricesAsyncFuture1 = storeService.getPricesAsyncCompletableFuture("store 1");
        CompletableFuture<Double> pricesAsyncFuture2 = storeService.getPricesAsyncCompletableFuture("store 2");
        CompletableFuture<Double> pricesAsyncFuture3 = storeService.getPricesAsyncCompletableFuture("store 3");
        CompletableFuture<Double> pricesAsyncFuture4 = storeService.getPricesAsyncCompletableFuture("store 4");
        CompletableFuture<Double> pricesAsyncFuture5 = storeService.getPricesAsyncCompletableFuture("store 5");

        //Mostrando o resultado do CompletableFuture
        System.out.println(pricesAsyncFuture1.join());
        System.out.println(pricesAsyncFuture2.join());
        System.out.println(pricesAsyncFuture3.join());
        System.out.println(pricesAsyncFuture4.join());
        System.out.println(pricesAsyncFuture5.join());

        //Mostrando o tempo que terminou o processo todo:
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n",(end - start));
    }
}