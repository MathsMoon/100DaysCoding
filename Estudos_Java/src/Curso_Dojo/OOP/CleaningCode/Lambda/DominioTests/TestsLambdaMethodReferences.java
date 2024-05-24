package Curso_Dojo.OOP.CleaningCode.Lambda.DominioTests;
/*
    Para os casos em que a lambda é usada para retornar
    apenas uma função ou método no seu uso, podemos simplifica-la
    utilizando o method references, que vai referenciar um tipo de
    ação no código, deixando ele mais limpo e menos espaçoso.
*/

import Curso_Dojo.OOP.CleaningCode.Lambda.Dominio.Anime;
import Curso_Dojo.OOP.CleaningCode.Lambda.Service.AnimeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestsLambdaMethodReferences {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Youjo Senki", 50),
                new Anime("Nagatoro", 30),
                new Anime("Tsuki ga kirei", 12),
                new Anime("Tonikaku Kawaii", 20)
        ));

        //Duas formas de usar o mesmo princípio de comparar pelo Título, usando Lambda de function e a de method references
        //animeList.sort((anime1,anime2) -> anime1.getTitle().compareTo(anime2.getTitle()));
        //animeList.sort(AnimeComparator::compareByTitle);
        animeList.sort(AnimeComparator::compareByEpisodes);

        System.out.println(animeList);
    }
}