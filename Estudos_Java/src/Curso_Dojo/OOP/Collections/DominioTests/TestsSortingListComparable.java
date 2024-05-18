package Curso_Dojo.OOP.Collections.DominioTests;

import Curso_Dojo.OOP.Collections.Dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestsSortingListComparable {
    public static void main(String[] args){
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(2L,"One Piece", "Aventura"));
        mangas.add(new Manga(4L,"Shinigami Bocchan" ,"Fantasia"));
        mangas.add(new Manga(1L,"Tsuki Ga Kirei", "Romance"));
        mangas.add(new Manga(3L,"Nagatoro", "Slice of Life"));
        mangas.add(new Manga(5L,"Jojo", "Bizzarice"));

        //Ordenando a Lista:
        System.out.println("----- SEM SORT -----");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("----- COM SORT -----");
        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}