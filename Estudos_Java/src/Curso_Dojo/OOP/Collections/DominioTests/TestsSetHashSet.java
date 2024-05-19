package Curso_Dojo.OOP.Collections.DominioTests;

import Curso_Dojo.OOP.Collections.Dominio.Manga;
import java.util.HashSet;
import java.util.Set;

public class TestsSetHashSet {
    public static void main(String[] args) {
        //Set é uma coleção que não permite repetições dentro da lista:
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(2L,"One Piece", "Aventura", 1000));
        mangas.add(new Manga(4L,"Shinigami Bocchan" ,"Fantasia", 200));
        mangas.add(new Manga(1L,"Tsuki Ga Kirei", "Romance", 30));
        mangas.add(new Manga(3L,"Nagatoro", "Slice of Life", 500));
        mangas.add(new Manga(5L,"Jojo", "Bizzarice", 600));

        for (Manga manga: mangas){
            System.out.println(manga);
        }
    }
}