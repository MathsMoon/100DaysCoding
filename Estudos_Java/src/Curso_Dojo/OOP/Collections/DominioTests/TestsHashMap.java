package Curso_Dojo.OOP.Collections.DominioTests;

import Curso_Dojo.OOP.Collections.Dominio.Consumidor;
import Curso_Dojo.OOP.Collections.Dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class TestsHashMap {
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

        //Associação pelo Map entre Consumidor e produto comprado (Manga)
        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(c1, manga2);
        consumidorManga.put(c2, manga4);
        consumidorManga.put(c3, manga1);
        consumidorManga.put(c4, manga3);
        consumidorManga.put(c5, manga5);

        //Fazendo a lei tura do nome
        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey().getNome() + " comprou o manga de: "+ entry.getValue().getNome());
        }
    }
}