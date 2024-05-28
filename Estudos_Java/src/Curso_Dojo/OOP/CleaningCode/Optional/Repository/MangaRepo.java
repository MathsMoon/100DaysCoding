package Curso_Dojo.OOP.CleaningCode.Optional.Repository;

import Curso_Dojo.OOP.CleaningCode.Optional.Dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepo {
    private static List<Manga> mangaList = List.of(
            new Manga("Boku no Hero",1, 300),
            new Manga("Hellsing", 2, 200),
            new Manga("Mirai Nikki", 3, 150),
            new Manga("그녀가 공작저로 가야 했던 사정", 4, 158)
    );

    /*
        O maior problema do código abaixo é a necessidade de repetir por 2 ou
        mais vezes a mesma estrutura de código dependendo do tipo de pesquisa
        feita, logo para não ocorrer esta repetição desnecessária
        é de bom uso a função Predicate para melhor organizar a estrutura
        do código em apenas 1 função, seguindo a forma posterior.

    private static Optional<Manga> findByTitleWithOp(String title){
        Manga found = null;
        for (Manga manga: mangaList){
            if (manga.getTitle().equals(title)){
                found = manga;
            }
        }
        return Optional.empty();
    }
     */


    /*
        Usando o Predicate podemos construir funções por tópico enquanto apenas o
        FindBy de fato executa o código via Lambda:
     */

    public static Optional<Manga> findByID(Integer ID){
        return findBy(manga -> manga.getID().equals(ID));
    }

    public static Optional<Manga> findByTitle(String title){
        return findBy(manga -> manga.getTitle().equalsIgnoreCase(title));
    }


    private static Optional<Manga> findBy(Predicate<Manga> predicate){
        Manga found = null;
        for (Manga manga: mangaList){
            if (predicate.test(manga)) found = manga;
        }
        return Optional.ofNullable(found);
    }
}