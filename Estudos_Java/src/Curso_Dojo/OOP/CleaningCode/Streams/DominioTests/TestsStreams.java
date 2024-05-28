package Curso_Dojo.OOP.CleaningCode.Streams.DominioTests;

import Curso_Dojo.OOP.CleaningCode.Streams.Dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestsStreams {
    //Lista servindo como banco de dados.
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("그녀가 공작저로 가야 했던 사정", 4.22),
            new LightNovel("Hina to Bambi", 2.99),
            new LightNovel("Renai Daikou", 1.50),
            new LightNovel("Sakurasou no pet na Kanojo", 5)
    ));



    public static void main(String[] args) {
        //Ordenando as Listas pelo título:
        lightNovelList.sort(Comparator.comparing(LightNovel::getTitle));

        //Buscando 3 elementos da Lista que tem o preço menor ou igual a 4:
        List<String> titles = new ArrayList<>();

        for (LightNovel lightNovel : lightNovelList) {
            if(lightNovel.getPrice() <= 4){
                titles.add(lightNovel.getTitle());
            }
            if (titles.size() >= 3){break;}
        }

        //Mostrando o resultado:
        System.out.println(lightNovelList);
        System.out.println("----------------------------------------");
        System.out.println("Light Novels que custam menos de 4 reais: " + titles);
    }
}