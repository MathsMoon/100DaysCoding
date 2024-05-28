package Curso_Dojo.OOP.CleaningCode.Streams.DominioTests;

import java.util.Arrays;
import java.util.List;

public class TestsFlatMap2 {
    public static void main(String[] args) {
        List<String> words = List.of("Separando", "a", "frase", "em", "diversos", "elementos");

        //Estou pegando cada elemento e dividindo ele letra por letra.
        List<String> wordsStream = words.stream().
                map(w -> w.split("")).
                flatMap(Arrays::stream).
                toList();

        System.out.println(wordsStream);
    }
}