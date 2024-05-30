package Curso_Dojo.OOP.CleaningCode.Streams.DominioTests;

import Curso_Dojo.OOP.CleaningCode.Streams.Dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class TestsCollectors {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("그녀가 공작저로 가야 했던 사정", 4.22),
            new LightNovel("Hina to Bambi", 2.99),
            new LightNovel("Renai Daikou", 1.50),
            new LightNovel("Sakurasou no pet na Kanojo", 5)
    ));

    public static void main(String[] args) {
        /*
            Comandos básicos com Stream:
            count -> mostra o tamanho da Stream, como a quantidade da lista.
            max -> mostra o valor máximo de algum elemento da Stream que passamos pelo
            Comparator.
            sum -> realiza a soma de todos os valores de algo específico da Stream (Como preço da LN).
            average -> Pega a média de todos os valores especificados de uma Stream.
         */

        //Utilizando o Collectors counting para saber o tamanho da Stream.
        System.out.println(lightNovelList.stream().collect(Collectors.counting()));

        //Mostrando o Item mais caro da Stream.
        lightNovelList.stream().
                max(Comparator.comparing(LightNovel::getPrice)).
                ifPresent(System.out::println);


        System.out.println("-------------------------------------------");

        //Organizando o Sumário de Preços de uma Stream:
        DoubleSummaryStatistics statistics = lightNovelList.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println("Estatísticas das Ln: "+statistics);

        //Organizando o Sumário de Todas as Strings das LN:
        String titles = lightNovelList.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println("Nome das LN disponíveis: "+ titles);
    }
}