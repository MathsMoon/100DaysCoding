package Curso_Dojo.OOP.CleaningCode.Streams.DominioTests;

import Curso_Dojo.OOP.CleaningCode.Streams.Dominio.Category;
import Curso_Dojo.OOP.CleaningCode.Streams.Dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestsCollectors4 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("그녀가 공작저로 가야 했던 사정", 20, Category.FANTASY),
            new LightNovel("Hina to Bambi", 29.9, Category.ROMANCE),
            new LightNovel("Renai Daikou", 1.50, Category.ROMANCE),
            new LightNovel("Sakurasou no pet na Kanojo", 5, Category.DRAMA),
            new LightNovel("Your lie in April", 22.22, Category.DRAMA),
            new LightNovel("Youjo Senki", 12.1, Category.FANTASY),
            new LightNovel("Girls Und Pazer", 5.99, Category.ROMANCE)
    ));

    public static void main(String[] args) {
       /*
            A função abaixo ela realiza uma contagem de quantos itens da Stream possuem em cada categoria
            desta forma é organizada a uma contagem junto com o Collect que agrupa por Categoria e Countagem,
            retornando então um Map de Long que passa a quantidade de cada Categoria mapeada da Stream.
        */
        Map<Category, Long> collect = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        //Agrupando por categoria e maior preço:
//        lightNovelList.stream().collect(Collectors)

    }
}