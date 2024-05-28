package Curso_Dojo.OOP.CleaningCode.Streams.DominioTests;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestsFlatMap {
    public static void main(String[] args) {
        List<List<String>> LolLeagues = new ArrayList<>();
        List<String> MajorLeaguesLol = List.of("LEC", "LCS", "LPL", "LCK");
        List<String> MinorLeaguesLol = List.of("CBLOL", "LLA", "VCS", "PCS");
        List<String> MajorTeamsLol = List.of("T1", "GENG", "G2", "FNATIC", "BLG", "TES", "FLY QUEST", "TEAM LIQUID");

        LolLeagues.add(MajorLeaguesLol);
        LolLeagues.add(MinorLeaguesLol);
        LolLeagues.add(MajorTeamsLol);

        //Utilizando o FlatMap para ler todos os atributos dentro das coleções:
        LolLeagues.stream().flatMap(Collection::stream).forEach(System.out::println);

        /*
            O processo do FlatMap consiste em transformar o grupo de Coleções de Coleções
            em apenas uma única lista, usando o Collection para cada coleção e alinhando
            todas com Stream, assim ela pode iterar sobre cada elemento com o ForEach e
            retornar o valor System.out::println que mostra todos os elementos da lista
            como se fosse um for dentro de um outro for lendo matrizes.
         */
    }
}