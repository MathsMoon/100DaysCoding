package Curso_Dojo.OOP.CleaningCode.Streams.DominioTests;

import Curso_Dojo.OOP.CleaningCode.Streams.Dominio.Category;
import Curso_Dojo.OOP.CleaningCode.Streams.Dominio.LightNovel;
import Curso_Dojo.OOP.CleaningCode.Streams.Dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class TestsCollectors5 {
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
        //Pegando as estatíticas por categoria:
        Map<Category, DoubleSummaryStatistics> collectStatistics = lightNovelList.stream().
                collect(groupingBy(LightNovel::getCategory, summarizingDouble(LightNovel::getPrice)));

        System.out.println(collectStatistics);

        //Organizando a lista para classificar os itens que estão em promoção:
        Map<Category, List<Promotion>> categoryListMap = lightNovelList.stream().
                collect(groupingBy
                        (LightNovel::getCategory, mapping
                                (TestsCollectors5::getPromotio, toList())));

        System.out.println(categoryListMap);

        //Organizando a lista para classificar os itens que estão em promoção: Usando o Set para evitar repetições.
        Map<Category, Set<Promotion>> collectWithSet = lightNovelList.stream().
                collect(groupingBy
                        (LightNovel::getCategory, mapping
                                (TestsCollectors5::getPromotio, toSet())));
        System.out.println(collectWithSet);

        //Organizando a lista para classificar os itens que estão em promoção: Usando o HashSet para linkar através do HashList.
        Map<Category, LinkedHashSet<Promotion>> linkedHashSetMap = lightNovelList.stream().
                collect(groupingBy
                        (LightNovel::getCategory, mapping
                                (TestsCollectors5::getPromotio,
                                        toCollection(LinkedHashSet::new))));

        System.out.println(linkedHashSetMap);
    }

    private static Promotion getPromotio(LightNovel ln){
        return ln.getPrice() > 15 ? Promotion.UNDERPROMOTION : Promotion.NORMAL_PRICE;
    }
}