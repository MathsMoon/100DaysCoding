package Curso_Dojo.OOP.DesignPatterns.Dominio;

public class CurrencyFactory {
    public static Currency newCurrency(Country country){
        switch (country){
            case USA -> {
                return new UsDollar();
            }
            case JAPAN -> {
                return new Yen();
            }

            case BRAZIL -> {
                return new Real();
            }
            default -> throw new IllegalArgumentException("No currency found for this country");
        }
    }
}