package Curso_Dojo.OOP.UtilityClasses.Dominio.TimeClasses;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleClass {
    public static void main(String[] args) {
       //Criando instâncias para locais determiandos, neste caso o italiano da itália e Suiça
        Locale localIT = new Locale("it", "IT");
        Locale localCH = new Locale("it", "CH");
        Locale localInd = new Locale("hi", "IN");
        Locale localJp = new Locale("ja", "JP");

        //Criando os parâmetros de Tempo
        Calendar calendar = Calendar.getInstance();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localCH);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localIT);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localInd);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localJp);

        System.out.println("Itália: " + df2.format(calendar.getTime()));
        System.out.println("Suíça: " + df.format(calendar.getTime()));
        System.out.println("Indía: " + df3.format(calendar.getTime()));
        System.out.println("Japão: " + df4.format(calendar.getTime()));

        //Mostrando os países determinados do japão:
        System.out.println(localIT.getDisplayCountry(localJp)); //Retorna o nome do país do LocalIt no idioma do pais localjp
    }
}