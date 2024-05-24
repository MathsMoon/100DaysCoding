package Curso_Dojo.OOP.CleaningCode.Lambda.DominioTests;

import Curso_Dojo.OOP.CleaningCode.Lambda.Dominio.Anime;
import Curso_Dojo.OOP.CleaningCode.Lambda.Service.AnimeComparator;

//Imports Java
import java.util.ArrayList;
import java.util.List;

/*
    Utilizando agora métodos não estáticos para mexer com a Lambda.
*/
public class TestsLambdaMethodReferences2 {
    public static void main(String[] args) {
        //Mexendo em métodos não estáticas é necessário usar uma referência
        AnimeComparator AC = new AnimeComparator();

        //Criando a Lista
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Youjo Senki", 50),
                new Anime("Nagatoro", 30),
                new Anime("Tsuki ga kirei", 12),
                new Anime("Tonikaku Kawaii", 20)
        ));

        //Desta forma você consegue usar os métodos não estáticos de uma classe com a Lambda
        animeList.sort(AC::compareByEpisodesNonStatic);
        System.out.println(animeList);
    }
}