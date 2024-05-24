package Curso_Dojo.OOP.UtilityClasses.TimeClasses;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
    Estudar depois o site: https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
    para rever e estudar mais sobre formatação simples de datas.
 */


public class SimpleDateFormatClass {
    public static void main(String[] args) {
        String pattern = "'Brasil - 'dd 'de' MMMM 'do ano da graça do Senhor de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
    }
}