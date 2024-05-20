package Curso_Dojo.OOP.Collections.DominioTests;

import Curso_Dojo.OOP.Collections.Dominio.Manga;
import Curso_Dojo.OOP.Collections.Dominio.Smartphone;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class TestsNavigableSetClass {
    public static void main(String[] args) {
        /*
            Utilizando o set de navegação para smartphone:
            a necessidade de utilizar o Comparator é extrema devido a própria classe
            do NavigableSet que utiliza a interface do Comparator, desta forma para usar
            este set é preciso ou ter esta implementação declarada na classe ou fazer uma
            classe própria apenas para utilizar o Comparator na implementação.
         */
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);

        /*
            Utilizando o NavigableSet do manga, como ele na classe está sendo organizado por ID,
            as melhores situações para usar o NavigableSet é quando temos já definido na nossa classe
            uma implemetação Comparator e utilizamos ela para reorganizar a nossa lista. Lembrando que
            ele não aceita repetições de objetos com mesma informação, então caso seja necessário a
            edição ou atualização, ela deve ser feita alterando o objeto da lista e não sobreescrevendo.
            Ele usa o CompareTo para realizar sua pesquisa, diferente do simples search com equals comum do
           comparable.
         */

        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(2L,"One Piece", "Aventura", 1000));
        mangas.add(new Manga(4L,"Shinigami Bocchan" ,"Fantasia", 200));
        mangas.add(new Manga(1L,"Tsuki Ga Kirei", "Romance", 30));
        mangas.add(new Manga(3L,"Nagatoro", "Slice of Life", 500));
        mangas.add(new Manga(5L,"Jojo", "Bizzarice", 600));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}