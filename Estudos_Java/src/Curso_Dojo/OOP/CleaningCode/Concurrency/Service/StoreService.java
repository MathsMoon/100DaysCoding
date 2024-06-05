package Curso_Dojo.OOP.CleaningCode.Concurrency.Service;

import java.util.concurrent.*;

public class StoreService {
    private static final ExecutorService ex = Executors.newCachedThreadPool();

    /*
        Abaixo estão três métodos que mexem com Threads que buscam
        gerar valores aleatórios para um conjunto de lojas.
        Cada método adota uma bordagem diferente devido a necessidade
        de adaptar o tipo usado para executar uma função, de forma
        sincrona ou assíncrona, as threads podem ganhar ou perder
        a eficiêndia de acordo com o tipo de estresse de trabalho
        que é colocado, portanto, reveja abaixo as diferentes
        formas de execução de uma mesma função para trabalhar com
        Threads.
    */


    public double getPrinceSync(String storename){
        System.out.printf("Getting prices for store %s%n", storename);
        return priceGenerator();
    }

    public Future<Double> getPricesAsyncFuture(String storename){
        System.out.printf("Getting prices for store %s%n", storename);
        return ex.submit(this::priceGenerator);
    }

    public CompletableFuture<Double> getPricesAsyncCompletableFuture(String storename){
        System.out.printf("Getting prices for store %s%n", storename);
        return CompletableFuture.supplyAsync(this::priceGenerator);
    }

    public static void shutdown(){
        ex.shutdown();
    }

    private double priceGenerator(){
        System.out.printf("%s generating price %n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    private void delay(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}