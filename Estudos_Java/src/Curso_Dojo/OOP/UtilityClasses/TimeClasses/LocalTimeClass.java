package Curso_Dojo.OOP.UtilityClasses.TimeClasses;

import java.time.LocalTime;

public class LocalTimeClass {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23,23,11, 1111);

        System.out.println(time);
    }
}