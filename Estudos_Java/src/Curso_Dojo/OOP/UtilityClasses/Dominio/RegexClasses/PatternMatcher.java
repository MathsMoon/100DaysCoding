package Curso_Dojo.OOP.UtilityClasses.Dominio.RegexClasses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    public static void main(String[] args) {
        String regex = "aba";
//        String text = "Abaaaba";
        String text2 = "abababa";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("texto:  "+text2);
        System.out.println("Indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posições encontradas: ");
        while (matcher.find()){
            System.out.println(matcher.start() + " ");
        }
    }
}