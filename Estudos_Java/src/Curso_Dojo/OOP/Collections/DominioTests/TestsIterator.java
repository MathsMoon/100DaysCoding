package Curso_Dojo.OOP.Collections.DominioTests;

import Curso_Dojo.OOP.Collections.Dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestsIterator {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(2L,"One Piece", "Aventura", 1000));
        mangas.add(new Manga(4L,"Shinigami Bocchan" ,"Fantasia", 200));
        mangas.add(new Manga(1L,"Tsuki Ga Kirei", "Romance", 30));
        mangas.add(new Manga(3L,"Nagatoro", "Slice of Life", 500));
        mangas.add(new Manga(5L,"Jojo", "Bizzarice", 600));

        System.out.println("Lista Pré-Remoção: "+mangas);
        System.out.println("------------------------------------");

        //Removendo itens da lista:
        Iterator<Manga> mangainterator = mangas.iterator();

        //Loop vai interar por cada manga e pegar o Objeto dentro da lista, enquanto possuir itens o while não para
        while (mangainterator.hasNext()){
            if (mangainterator.next().getQuantidade() < 600) mangainterator.remove();
        }

        /*
            Versão reduzida do código acima: (Programação Funcional)
            mangas.removeIf(mang -> mang.getQuantidade() < 600);
         */

        System.out.println("Lista Pós-Remoção: "+ mangas);
    }
}