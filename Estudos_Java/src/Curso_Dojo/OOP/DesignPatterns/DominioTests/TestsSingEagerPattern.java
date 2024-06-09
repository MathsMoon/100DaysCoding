package Curso_Dojo.OOP.DesignPatterns.DominioTests;

import Curso_Dojo.OOP.DesignPatterns.Dominio.AircraftSingEager;

/*
    Buscando resolver o problema de múltiplas
    instâncias e de acesso a objetos, o patterns
    Singleton busca padronizar o acesso a instânciação
    por meio de 2 meios que fecham ao objeto um caminho
    em comum que será executado, fazendo assim que
    as informações que passem pelo sistema se canalizem
    em apenas uma instância do objeto por você
    trabalhando melhor então com as informações
    daquele objeto.
*/

public class TestsSingEagerPattern {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        AircraftSingEager aircraft = AircraftSingEager.getInstance();
        System.out.println(aircraft.bookSeat(seat));
    }
}