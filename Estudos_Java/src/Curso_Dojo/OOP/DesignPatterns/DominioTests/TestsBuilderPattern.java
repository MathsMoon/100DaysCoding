package Curso_Dojo.OOP.DesignPatterns.DominioTests;

import Curso_Dojo.OOP.DesignPatterns.Dominio.Person;

/*
    O padrão builder nasce de uma necessidade de constituir uma forma
    única de definir os tipos de dados passados para que não ocorra
    confusões perante aos tipos de dados que podem ser passados.

    No exemplo abaixo utilizamos o PersonBuilder para destacar
    exatamente a informação a ser passada, assim garantindo os
    tipos de dados corretos a cada método.
 */

public class TestsBuilderPattern {
    public static void main(String[] args) {
        //Instanciândo um objeto e fazendo auto-referência
        Person person = new Person.PersonBuilder().
                firstName("Mariane").
                lastName("Alves").
                email("marianealves@gmail.com").
                username("MariMoon").
                builder();

        System.out.println(person);
    }
}