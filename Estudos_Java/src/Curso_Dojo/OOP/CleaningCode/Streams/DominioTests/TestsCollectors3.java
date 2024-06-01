package Curso_Dojo.OOP.CleaningCode.Streams.DominioTests;

import Curso_Dojo.OOP.CleaningCode.Streams.Dominio.Category;
import Curso_Dojo.OOP.CleaningCode.Streams.Dominio.LightNovel;
import Curso_Dojo.OOP.CleaningCode.Streams.Dominio.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestsCollectors3 {
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
        //Buscando Lns para promoção:
        Map<Promotion, List<LightNovel>> promotionListMap = lightNovelList.stream().
                collect(Collectors.groupingBy(ln ->
                        ln.getPrice() < 6 ? Promotion.UNDERPROMOTION : Promotion.NORMAL_PRICE
                ));

        //Mostrando a Lista com as Novels menores
        System.out.println(promotionListMap);

        //Realizando um Mapping de um outro Mapping para organizar o preço e a categoria.
        Map<Category, Map<Promotion, List<LightNovel>>> collect = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.groupingBy(ln ->
                ln.getPrice() < 6 ? Promotion.UNDERPROMOTION : Promotion.NORMAL_PRICE
        )));

        //Mostrando o resultado dos Mappings:
        System.out.println(collect);
    }
}