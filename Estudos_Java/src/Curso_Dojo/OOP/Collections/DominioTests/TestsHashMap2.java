package Curso_Dojo.OOP.Collections.DominioTests;

import Curso_Dojo.OOP.Collections.Dominio.Consumidor;
import Curso_Dojo.OOP.Collections.Dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestsHashMap2 {
    public static void main(String[] args) {
        //Fazendo uma associação entre Comprador e Manga comprado:
        Consumidor c1 = new Consumidor("Marcos");
        Consumidor c2 = new Consumidor("Jonas");
        Consumidor c3 = new Consumidor("Matheus");
        Consumidor c4 = new Consumidor("Luis");
        Consumidor c5 = new Consumidor("Jão");

        Manga manga1 = new Manga(2L, "One Piece", "Aventura");
        Manga manga2 = new Manga(4L,"Shinigami Bocchan" ,"Fantasia");
        Manga manga3 = new Manga(1L,"Tsuki Ga Kirei", "Romance");
        Manga manga4 = new Manga(3L,"Nagatoro", "Slice of Life");
        Manga manga5 = new Manga(5L,"Jojo", "Bizzarice");

        /*
            Para fazer a Associação de um Consumidor com mais produtos
            é necessário criar uma lista que receba os produtos e realizar uma associação
            como map, assim ele consegue organizar Dentro de uma só lista os clientes
            e produtos comprados.
        */

        List<Manga> consumidor1list = List.of(manga1, manga3);
        List<Manga> consumidor2list = List.of(manga2, manga4);
        List<Manga> consumidor3list = List.of(manga5, manga1);
        List<Manga> consumidor4list = List.of(manga1, manga2);
        List<Manga> consumidor5list = List.of(manga5, manga3);

        Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>();
        consumidorManga.put(c1, consumidor1list);
        consumidorManga.put(c3, consumidor2list);
        consumidorManga.put(c2, consumidor3list);
        consumidorManga.put(c4, consumidor4list);
        consumidorManga.put(c5, consumidor5list);


        for (Map.Entry<Consumidor, List<Manga>> entry: consumidorManga.entrySet()){
            System.out.println("----- Comprador: "+ entry.getKey().getNome());
                for (Manga manga: entry.getValue()){
                    System.out.println("- "+manga.getNome());
                }
        }
    }
}