package Curso_Dojo.OOP.UtilityClasses.Dominio.TimeClasses;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateClass {
    public static void main(String[] args) {
        //O localDate tem o mesmo princípio de imutabilidade da String, para alterar basta referenciar a mesma variável
        LocalDate localDate = LocalDate.of(2023, Month.JANUARY, 19);


        /* Comandos para o LocalDate */
        System.out.println(localDate); //Retorna na formatação YYYY/MM/DD

    }
}