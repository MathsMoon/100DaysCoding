package Curso_Dojo.OOP.Polymorphism.DominioTests;

import Curso_Dojo.OOP.Polymorphism.Dominio.Computador;
import Curso_Dojo.OOP.Polymorphism.Dominio.Televisao;
import Curso_Dojo.OOP.Polymorphism.Dominio.Tomate;
import Curso_Dojo.OOP.Polymorphism.Service.ServCalculoImposto;

public class TestsProdutoPoly {
    public static void main(String[] args) {
        Computador computador = new Computador("Acer 5 i7-750H", 6000);
        Tomate tomate = new Tomate("Tomate A", 10);
        Televisao tv = new Televisao("Samsung 80p", 14000);

        /*
            Como as funções deste serviço são static, posso acessar pela classe
            Logo não sendo necessário a criação de um Objeto para manipular
            Como a função também é genérica ela identifica o tipo do Objeto
            e passa corretamente o valor de cada classe utilizando a mesma função
        */
        ServCalculoImposto.CalculoImposto(computador);
        System.out.println("-------------------------");
        ServCalculoImposto.CalculoImposto(tomate);
        System.out.println("-------------------------");
        ServCalculoImposto.CalculoImposto(tv);
    }
}
