package Curso_Dojo.OOP.DesignPatterns.DominioTests;

import Curso_Dojo.OOP.DesignPatterns.Dominio.AircraftSingLazy;

public class TestsSingLazyPattern {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        AircraftSingLazy aircraft = AircraftSingLazy.getInstance();
        System.out.println(aircraft.bookSeat(seat));
    }
}