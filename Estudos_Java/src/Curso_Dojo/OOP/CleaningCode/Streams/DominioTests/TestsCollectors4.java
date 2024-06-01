package Curso_Dojo.OOP.CleaningCode.Streams.DominioTests;

import Curso_Dojo.OOP.CleaningCode.Streams.Dominio.Category;
import Curso_Dojo.OOP.CleaningCode.Streams.Dominio.LightNovel;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

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
        Map<Category, Long> collect = lightNovelList.stream().collect(groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        //Agrupando por categoria e maior preço:
        Map<Category, Optional<LightNovel>> MaxPrice = lightNovelList.stream().
                collect(groupingBy
                        (LightNovel::getCategory, Collectors.maxBy //Collector de grupo recebe mais de 1 parâmetro.
                                (Comparator.comparing //Caso a classe não tenha um comparator próprio, usa o padrão para ver o maior preço.
                                        (LightNovel::getPrice))));

        System.out.println(MaxPrice);


        //Formatando o código acima para retornar uma Stream e não um Optional:
        Map<Category, LightNovel> RetirandoOpt = lightNovelList.stream().
                collect(groupingBy
                        (LightNovel::getCategory,
                                Collectors.collectingAndThen
                                        (Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));

        System.out.println(RetirandoOpt);

    }
}