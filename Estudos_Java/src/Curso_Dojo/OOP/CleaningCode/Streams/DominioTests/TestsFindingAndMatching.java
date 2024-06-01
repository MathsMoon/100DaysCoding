package Curso_Dojo.OOP.CleaningCode.Streams.DominioTests;

import Curso_Dojo.OOP.CleaningCode.Streams.Dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestsFindingAndMatching {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Hina to Bambi", 2.99),
            new LightNovel("Renai Daikou", 1.50),
            new LightNovel("Sakurasou no pet na Kanojo", 5.0),
            new LightNovel("그녀가 공작저로 가야 했던 사정", 4.22)
    ));

    public static void main(String[] args) {
        //Realizando Buscas na lista com as funções de Matching:
        System.out.println("Existe alguma Light Novel mais cara que 8 reais na lista? "+
                lightNovelList.stream().anyMatch(ln -> ln.getPrice() > 8));

        System.out.println("Existe algum valor na lista sem preço? "
                +lightNovelList.stream().allMatch(ln -> ln.getPrice() < 0));

        System.out.println("Não existe na lista uma Light novel que seja 2.98? "+
                lightNovelList.stream().noneMatch(lightNovel -> lightNovel.getPrice() == 2.98));



        /*
            O problema da função FindAny é que ela retorna o primeiro elemento que vier que satisfaça as características
            designadas e ignora todo o resto.
         */
        lightNovelList.stream().filter(ln -> ln.getPrice() > 3).findAny().ifPresent(System.out::println);

        System.out.println("---------------------------------------");

        //Filtrando todos os elementos da lista, organizando por preço do maior para o menor e pegando o primeiro.
        lightNovelList.stream().
                filter(ln -> ln.getPrice() > 3).
                max(Comparator.comparing(LightNovel::getPrice).reversed()). //o reversed é necessário, caso contrário mostraria do 3.1 pra cima, e não do maior
                ifPresent(System.out::println);
    }
}