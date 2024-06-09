package Curso_Dojo.OOP.DesignPatterns.DominioTests;

import Curso_Dojo.OOP.DesignPatterns.Dominio.AircraftSingletonEnum;

public class TestsSingEnum {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());
        AircraftSingletonEnum instance = AircraftSingletonEnum.INSTANCE;
        System.out.println(instance.bookSeat(seat));
    }
}