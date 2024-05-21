package Curso_Dojo.OOP.Collections.DominioTests;

import Curso_Dojo.OOP.Collections.Dominio.Manga;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class MangaQtdComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga o1, Manga o2) {
        return Integer.compare(o1.getQuantidade(), o2.getQuantidade());
    }
}

public class TestsQeue2 {
    public static void main(String[] args) {
        /*
            Neste caso do Manga estou dando Prioridade usando o PriorityQeue
            comparando entre os Mangas sua quantidade, como não tinha esta
            informação na classe, eu criei uma própria neste arquivo para
            realizar a comparação.
         */

        Queue<Manga> mangas = new PriorityQueue<>(new MangaQtdComparator());
        mangas.add(new Manga(2L,"One Piece", "Aventura", 2));
        mangas.add(new Manga(4L,"Shinigami Bocchan" ,"Fantasia", 10));
        mangas.add(new Manga(1L,"Tsuki Ga Kirei", "Romance", 30));
        mangas.add(new Manga(3L,"Nagatoro", "Slice of Life", 100));
        mangas.add(new Manga(5L,"Jojo", "Bizzarice", 80));

        //Revisar código, após 2 objetos ele retorna o terceiro como Nulo e termina o While.
        while (!mangas.isEmpty()){
            System.out.println("Manga: "+mangas.poll().getNome() + " Qtd: "+ mangas.poll());
        }
    }
}