package Curso_Dojo.OOP.CleaningCode.Streams.DominioTests;

import Curso_Dojo.OOP.CleaningCode.Streams.Dominio.Category;
import Curso_Dojo.OOP.CleaningCode.Streams.Dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class TestsCollectors2 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("그녀가 공작저로 가야 했던 사정", 4.22, Category.FANTASY),
            new LightNovel("Hina to Bambi", 2.99, Category.ROMANCE),
            new LightNovel("Renai Daikou", 1.50, Category.ROMANCE),
            new LightNovel("Sakurasou no pet na Kanojo", 5, Category.DRAMA)
    ));

    public static void main(String[] args) {
        //Utilizando o Stream para Agrupar por Grupo:
        Map<Category, List<LightNovel>> LnCategoryGroups = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(LnCategoryGroups);
    }
}