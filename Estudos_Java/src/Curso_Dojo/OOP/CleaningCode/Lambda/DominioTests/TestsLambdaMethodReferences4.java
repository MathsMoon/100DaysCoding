package Curso_Dojo.OOP.CleaningCode.Lambda.DominioTests;

import Curso_Dojo.OOP.CleaningCode.Lambda.Dominio.Anime;
import Curso_Dojo.OOP.CleaningCode.Lambda.Service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class TestsLambdaMethodReferences4 {
    public static void main(String[] args) {
        //Criando a referência que irá receber o get do Supplier.
        Supplier<AnimeComparator> comparatorSupplier = AnimeComparator::new;

        //Comparator recebe o get do supplier que retornará o que for chamado.
        AnimeComparator comparator = comparatorSupplier.get();

        //Criando a Lista de Animes
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Youjo Senki", 50),
                new Anime("Nagatoro", 30),
                new Anime("Tsuki ga kirei", 12),
                new Anime("Tonikaku Kawaii", 20)
        ));

        //Organizando a Lista por quantidade de Episódios
        animeList.sort(comparator::compareByEpisodesNonStatic);

        //Resultado
        System.out.println(animeList);

        /*
            Para podermos organizar nosso código para que uma função utilize 3 termos
            é necessário vermos até então o que já usamos, para criar um objeto anime
            devemos responder ao Construtor definindo as informações que ele pede para
            criar o objeto anime, portanto, devemos da mesma forma utilizar um método
            que possa comportar estes elementos, usando o BiFunction podemos
         */
        BiFunction<String,Integer,Anime> animeBiFunction = (title,episodes) -> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFunction1 = Anime::new;

        //Adicionando a Lista
        animeList.add(animeBiFunction.apply("One Piece", 1190));
        animeList.add(animeBiFunction1.apply("Naruto", 500));

        System.out.println(animeList);
    }
}