package Curso_Dojo.OOP.UtilityClasses.Dominio.TimeClasses;


import java.time.Instant;
import java.time.LocalDateTime;

public class InstantClass {
    public static void main(String[] args) {
        Instant instant = Instant.now();

        System.out.println(instant); //Retorna o Horário Zulu
        System.out.println(LocalDateTime.now()); //Horário Local atual
    }
}