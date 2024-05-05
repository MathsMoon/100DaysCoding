package Curso_Dojo.OOP.UtilityClasses.Dominio;

public class Wrappers01 {

    /*
    Wrapper é um objeto que vai encapsular os tipos primitivos:
            Byte
            short
            int
            long
            float
            double
            char
            boolean
    */

    public static void main(String[] args) {
        //transformando os tipos primitivos em Objetos, nome do processo é Boxing/AutoBoxing
        Byte bytew = 1;
        Short shortw = 1;
        Integer intw = 1;
        Long longw = 1L;
        Float floatw = 1f;
        Double doublew = 1d;
        Character charw = 'a';
        Boolean booleanw = false;

        //Mexendo com Unboxing
        int i = intw;
        Integer intw2 = Integer.parseInt("1");


    }
}