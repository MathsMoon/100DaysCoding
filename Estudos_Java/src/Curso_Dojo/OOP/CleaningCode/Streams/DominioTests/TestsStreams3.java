package Curso_Dojo.OOP.CleaningCode.Streams.DominioTests;

import Curso_Dojo.OOP.CleaningCode.Streams.Dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;


public class TestsStreams3 {
    //Lista servindo como banco de dados.
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("그녀가 공작저로 가야 했던 사정", 4.22),
            new LightNovel("Hina to Bambi", 2.99),
            new LightNovel("Renai Daikou", 1.50),
            new LightNovel("Renai Daikou", 1.50),
            new LightNovel("Sakurasou no pet na Kanojo", 5)
    ));

    public static void main(String[] args) {
        //Imprimindo todos os objetos da Lista
        lightNovelList.forEach(System.out::println);

        System.out.println("-----------------------------------------");
        //Lista que mostra valores menores que 5
        lightNovelList.stream().filter(ln -> ln.getPrice() < 5).forEach(System.out::println);

        //Mostrando quanto elementos da Stream são diferentes e menores que 5
        long count = lightNovelList.stream().distinct().filter(ln -> ln.getPrice() < 5).count();
        System.out.println("Quantos elementos tem na lista menores que 5? " + count);

        /*
            A resposta de ambos acima diferem pela função Distinct que pega elementos distintos
            sem repetição, ele faz comparação pelo título usando o HashMap da própria classe Light Novel
            portanto, para usar este comando é necessário de antemão construir o método Equals e Hash.
         */
    }
}