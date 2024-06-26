package Curso_Dojo.OOP.CleaningCode.Concurrency.Service;

import Curso_Dojo.OOP.CleaningCode.Concurrency.Dominio.Discount;
import Curso_Dojo.OOP.CleaningCode.Concurrency.Dominio.Quote;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreServiceWithDiscount {
    private static final ExecutorService ex = Executors.newCachedThreadPool();

    //Trabalhando com esta função sincronizada de forma assíncronizada
    public String getPriceSync(String storename) {
        double price = priceGenerator();
        Discount.Code discountCode = Discount.Code.values()
                [ThreadLocalRandom.current().nextInt(Discount.Code.values().length)];

        return String.format("%s:%.2f:%s", storename, price, discountCode);
    }

    public String applyDiscount (Quote quote){
        delay();
        double discountValue = quote.getPrice() * (100 - quote.getDiscountCode().getPercentage()) / 100;
        return String.format("'%s' original price: '%.2f'. Applying discount code '%s'. Final price: '%.2f'",
                quote.getStore(), quote.getPrice(), quote.getDiscountCode(), discountValue);
    }

    private double priceGenerator(){
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    private void delay(){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}