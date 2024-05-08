package Curso_Dojo.OOP.UtilityClasses.Dominio.StringClasses;

public class UtilizingStringBuilder {
    public static void main(String[] args) {
        //UtilizingStringBuilder é uma classe que trabalha com Strings, e não são imutáveis como String
        //Tendo capacidade padrão para 16 caracteres e vai aumentando a cada adição.
        StringBuilder text = new StringBuilder(" ");

        text.append("UwU");
        text.trimToSize();
        System.out.println(text);

        /* Comandos para o StringBuilder

        text.reverse(); retorna o inverso de toda a StringBuilder
        text.delete(); retorna a String sem uma margem de caracteres que você apagou




        */
    }
}