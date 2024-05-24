package Curso_Dojo.OOP.UtilityClasses.RegexClasses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher2 {
    /*
        O Pattern Matcher é utilizado como um match de informações dentro de um texto
        é usado para encontrar dentro de algum parâmetro valores colocados na regex,
        desta forma o padrão é compilado e o Matcher encontra este padrão dentro de
        uma estrutura designada
     */
    public static void main(String[] args) {
        /*Meta Caracteres:
            \d => Todos os dígitos;
            \D => Tudo que não for dígito;
            \s => Espaços em branco (\t \n \f \r);
            \S => Todos os caracteres exceto os brancos;
            \w => A-Z e a-z, dígitos e _ (sem espaço em branco)
            \W => Retorna todos os caracteres especiais e espaços em branco
            [] => Usado para retornar letras ou caracteres específicados;
         */

        String regex = "\\w"; //estou pedindo para retornar todos os caracteres especias
//        String text = "Abaaaba";
        String text2 = "dnup9dhq9 wyrnc rm3ry9s$ AAA";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("texto:  "+text2);
        System.out.println("Indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas: ");
        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group() + " ");
        }
    }
}