package Curso_Dojo.OOP.CleaningCode.Concurrency.DominioTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Printer implements Runnable{
    private final int num;

    public Printer(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.printf("%s início: %s%n", Thread.currentThread().getName(), num);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s finalizou: %s%n", Thread.currentThread().getName(), num);
    }
}


public class TestsExecutors {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

        /*
            O número de execuções não é influenciado pelo número de
            Threads, desta forma podemos limitar o número de Threads
            e ainda assim trabalhar com várias execuções, elas são
            acionadas apartir da disponibilidade de uma Thread de
            assumir uma das execuções.
         */

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        executorService.execute(new Printer(1));
        executorService.execute(new Printer(2));
        executorService.execute(new Printer(3));
        executorService.execute(new Printer(4));
        executorService.execute(new Printer(5));
        executorService.execute(new Printer(6));
        executorService.execute(new Printer(7));

        while (!executorService.isTerminated()) {
            System.out.println("Finalizando o Programa");
        }
    }
}