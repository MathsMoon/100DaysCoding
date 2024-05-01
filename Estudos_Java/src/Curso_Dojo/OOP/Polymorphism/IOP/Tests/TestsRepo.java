package Curso_Dojo.OOP.Polymorphism.IOP.Tests;

import Curso_Dojo.OOP.Polymorphism.IOP.Repositories.Repository;
import Curso_Dojo.OOP.Polymorphism.IOP.Services.RepoDB;

public class TestsRepo {
    public static void main(String[] args) {

        /*
            A programação orientada a interface funciona como o polimorfismo
            podemos pegar o conceito genérico do Repositório que é uma interface
            e assim salvar um produto que tem acesso a uma subinterface que implementa
            a genérica, como no exemplo abaixo:
         */
        Repository repodb = new RepoDB();
        repodb.Salvar();
    }
}