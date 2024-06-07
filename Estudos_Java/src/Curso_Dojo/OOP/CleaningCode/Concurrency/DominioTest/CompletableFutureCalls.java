package Curso_Dojo.OOP.CleaningCode.Concurrency.DominioTest;

import Curso_Dojo.OOP.CleaningCode.Concurrency.Dominio.Quote;
import Curso_Dojo.OOP.CleaningCode.Concurrency.Service.StoreServiceWithDiscount;

import java.util.List;

public class CompletableFutureCalls {
    public static void main(String[] args) {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
        searchPricesWithDiscount(service);
    }

    private static void searchPricesWithDiscount(StoreServiceWithDiscount service){
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        stores.stream().
                map(service::getPriceSync).
                map(Quote::newQuote).
                map(service::applyDiscount).
                forEach(System.out::println);
    }
}