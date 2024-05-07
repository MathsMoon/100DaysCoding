package Curso_Dojo.OOP.UtilityClasses.Dominio;

import java.text.DateFormat;
import java.util.Calendar;

public class dateformat {
    public static void main(String[] args) {
        //Criando objetos para Calendar e DateFormat
        Calendar calendar = Calendar.getInstance();

        //Como DateFormat é uma classe abstrata, não pode ser instanciada com um new da classe
        //Por tanto foi criado um Array do tipo DateFormat para tal
        DateFormat[] df = new DateFormat[7];
        df[0] = DateFormat.getInstance(); //Retorna: 06/05/2024 23:43
        df[1] = DateFormat.getDateInstance(); //Retorna: 6 de mai. de 2024
        df[2] = DateFormat.getDateTimeInstance(); //Retorna: 6 de mai. de 2024 23:43:21
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT); //Retorna: 06/05/2024
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM); //Retorna: 6 de mai. de 2024 (mesma coisa do getDateInstance())
        df[5] = DateFormat.getDateInstance(DateFormat.LONG); //Retorna: 6 de maio de 2024
        df[6] = DateFormat.getDateInstance(DateFormat.FULL); //Retorna: segunda-feira, 6 de maio de 2024


        for(DateFormat dataformat: df) {
            System.out.println(dataformat.format(calendar.getTime()));
        }
    }
}