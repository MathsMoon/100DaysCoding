package Curso_Dojo.OOP.Collections.DominioTests;

import Curso_Dojo.OOP.Collections.Dominio.Manga;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class SortMangaByGenre implements Comparator<Manga>{
/*
    Para melhor utilizar o Comparator, substuindo o Comparable em algumas partes do projeto
    podemos através de uma classe declarar o Comparator usando o Implements e da mesma forma
    trabalhar o Compare para ser nossa Lista organizadora de acordo com a nova forma de organiza-la

 */
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getGenero().compareTo(manga2.getGenero());
    }
}

public class TestsSortingListComparator {
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
        //Ambos abaixo funcionam da mesma forma, já que o sort do mangas aceita o Comparator.
        //Collections.sort(mangas, new SortMangaByGenre());
        mangas.sort(new SortMangaByGenre());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}