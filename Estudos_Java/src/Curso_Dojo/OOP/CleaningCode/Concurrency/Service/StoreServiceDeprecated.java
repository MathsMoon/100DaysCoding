package Curso_Dojo.OOP.CleaningCode.Concurrency.Service;

import java.util.concurrent.*;

public class StoreServiceDeprecated {
    private static final ExecutorService ex = Executors.newCachedThreadPool();

    //Trabalhando com esta função sincronizada de forma assíncronizada
    public Double getPriceSync(String storename) {
        System.out.printf("Getting prices sync for store %s%n", storename);
        return priceGenerator();
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