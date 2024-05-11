package Curso_Dojo.OOP.UtilityClasses.Dominio.TimeClasses;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersClass {

    /*
    Retorne a Aula 127 para fazer o exercício de data!.
    */

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.withDayOfMonth(20);

        //Contando com a data de agora, o TemporalAdjusters me mostra quando será a próxima quarta
        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.WEDNESDAY));
        System.out.println(now);



    }
}