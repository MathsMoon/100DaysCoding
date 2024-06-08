package Curso_Dojo.OOP.DesignPatterns.DominioTests;

/*
    A padronização do factory funciona através da separação
    dos tipos de dados e métodos usados em diferentes propriedades do java
    para que vc possa trabalhar com cada uma sem que ela altere o código
    todo, por conta desta funcionalidade é importante rever como utilizar
    de forma eficaz as regras de negócios utilizadas no sistema, separando-os
    e fazendo apenas as associações por meios intermediários, sem que comprometa
    a estrutura como um todo.
*/

import Curso_Dojo.OOP.DesignPatterns.Dominio.Country;
import Curso_Dojo.OOP.DesignPatterns.Dominio.Currency;
import Curso_Dojo.OOP.DesignPatterns.Dominio.CurrencyFactory;

public class TestsFactoryPattern {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.JAPAN);
        System.out.println(currency.getSymbol());
    }
}