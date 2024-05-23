package Curso_Dojo.OOP.CleaningCode.Parameterized.Interfaces;

import Curso_Dojo.OOP.CleaningCode.Parameterized.Dominio.Car;

@FunctionalInterface
public interface CarPredicate {
    boolean test(Car car);
}