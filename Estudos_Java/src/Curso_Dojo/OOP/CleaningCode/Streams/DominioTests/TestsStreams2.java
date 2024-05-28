package Curso_Dojo.OOP.CleaningCode.Streams.DominioTests;

import Curso_Dojo.OOP.CleaningCode.Streams.Dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class TestsStreams2 {
    //Lista servindo como banco de dados.
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("그녀가 공작저로 가야 했던 사정", 4.22),
            new LightNovel("Hina to Bambi", 2.99),
            new LightNovel("Renai Daikou", 1.50),
            new LightNovel("Sakurasou no pet na Kanojo", 5)
    ));

    public static void main(String[] args) {
        /*
            O código inteiro abaixo utiliza funções em cima de funções
            para criar uma estrutura de código que substitui a necessi
            -dade de utilizar uma leitura externa para cada um dos ele
            -mentos como foi no TestsStreams, sendo assim o Streams
            é útil para colocar estas funções dentro da Stream especifi
            -cando cada etapa conforme abaixo:

            Sorted -> Comparing -> Filter -> Limit -> Map -> Collect

            A stream precisa passar pelos blocos intermediários que
            definem suas funções e ações até chegar ao fim que é
            o resultado em si, desta forma se organiza:

            Sorted = método das listas e coleções que ordena a lista de
            acordo com o pedido.

            Comparing = para organizar a lista é necessário utilizar uma
            função que compara entre os elementos em si, o Comparing abre
            essa possibilidade de comparar dois objetos por um tipo em es-
            pecífico. (no caso abaixo é pelo título).

            Filter = Filtra toda a lista de elementos utilizando um Predicate
            ou seja, uma função para organizar a estrutura de pesquisa. Muito
            comum se utilizar Lambda no processo.

            Limit = define quantos elementos máximos queremos daquela pesquisa

            map = Organiza os novos elementos agora pelo título após serem fil-
            trados.

            collect = parte final da Stream onde se concentra o resultado que
            retorna como uma Lista.
         */
        List<String> list = lightNovelList.stream().sorted(
                        Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 4).
                limit(3).map(LightNovel::getTitle).
                collect(Collectors.toList());

        System.out.println(list);
    }
}