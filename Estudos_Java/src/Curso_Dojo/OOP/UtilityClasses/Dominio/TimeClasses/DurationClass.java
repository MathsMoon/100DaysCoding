package Curso_Dojo.OOP.UtilityClasses.Dominio.TimeClasses;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationClass {

    /*
        Duration é uma classe que realiza cálculos relativos a períodos de tempo contando os segundos
        por conta disso não recebe parâmetros do LocalDate, e sim do LocalTime
     */

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now(); //Pega horário local atual
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2); //Adiciona 2 anos ao horário atual local
        LocalTime timenow = LocalTime.now();
        LocalTime timeminus7hours = LocalTime.now().minusHours(7);

        Duration d2 = Duration.of(3, ChronoUnit.HOURS);

        Duration duration = Duration.between(now,nowAfterTwoYears);
        Duration duration1 = Duration.between(timenow,timeminus7hours);
        System.out.println(duration);
        System.out.println(duration1);
        System.out.println(d2);
    }
}