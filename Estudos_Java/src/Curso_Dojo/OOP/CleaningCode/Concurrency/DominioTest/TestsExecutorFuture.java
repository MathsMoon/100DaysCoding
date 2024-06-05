package Curso_Dojo.OOP.CleaningCode.Concurrency.DominioTest;

import java.util.concurrent.*;

public class TestsExecutorFuture {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> dollarRequest = executorService.submit(() -> {
            TimeUnit.SECONDS.sleep(2);
            return 4.350;
        });

        System.out.println(doSomething());
        Double dollarResponse = null;
        try {
            dollarResponse = dollarRequest.get(3, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new RuntimeException(e);
        } finally {
            executorService.shutdown();
        }
        System.out.println("Dollar: "+ dollarResponse);
    }

    /*
       O método abaixo serve para mostrar como as Threads podem ser controladas
       e utilizadas de forma a organizar, podendo utilizar as Threads de forma
       Assíncrona para trabalhar com diversas ações sem que elas interfiram
       nas ações das demais.
     */
    private static long doSomething(){
        System.out.println(Thread.currentThread().getName());
        int sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum += i;
        }
        return sum;
    }

}