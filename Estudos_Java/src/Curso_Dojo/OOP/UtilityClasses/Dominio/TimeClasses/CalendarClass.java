package Curso_Dojo.OOP.UtilityClasses.Dominio.TimeClasses;

import java.util.Calendar;
import java.util.Date;

public class CalendarClass {
    public static void main(String[] args) {
        //Maneira de instanciar um Objeto da classe Calendário:
       Calendar calendar = Calendar.getInstance();

        //Para pegar as informações de calendário, é necessário formatar as datas
        //Contornando esta situação podemos fazer:
        Date data = new Date(calendar.getTimeInMillis());
        System.out.println(data);

        //Utilizando atributos do Calendar
        System.out.println(Calendar.DAY_OF_WEEK);
        System.out.println(Calendar.DAY_OF_WEEK_IN_MONTH);
        System.out.println(Calendar.MONTH);
        System.out.println(Calendar.DAY_OF_YEAR);
    }
}