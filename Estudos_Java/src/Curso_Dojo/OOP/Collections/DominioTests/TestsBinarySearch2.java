package Curso_Dojo.OOP.Collections.DominioTests;

import Curso_Dojo.OOP.Collections.Dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestsBinarySearch2 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(2L,"One Piece", "Aventura"));
        mangas.add(new Manga(4L,"Shinigami Bocchan" ,"Fantasia"));
        mangas.add(new Manga(1L,"Tsuki Ga Kirei", "Romance"));
        mangas.add(new Manga(3L,"Nagatoro", "Slice of Life"));
        mangas.add(new Manga(5L,"Jojo", "Bizzarice"));

        //Para Realizar a ordenação de forma personalizada como antes devemos mudar a sintaxe tanto aqui quanto no sout abaixo.
        //Collections.sort(mangas);
        SortMangaByGenre SortMangaByGenre = new SortMangaByGenre();
        mangas.sort(SortMangaByGenre);


        for (Manga manga:mangas){
            System.out.println(manga);
        }

        Manga MangaToSearch = new Manga(3L,"Nagatoro", "Slice of Life");
        System.out.println("O manga de Nagatoro está no Index: "+ (Collections.binarySearch(mangas, MangaToSearch, SortMangaByGenre) + 1) + " da Lista");
    }
}