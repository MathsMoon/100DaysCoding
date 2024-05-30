package Curso_Dojo.OOP.CleaningCode.Streams.DominioTests;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestsGenerateStream {
    public static void main(String[] args) {
        /* Criando Streams sem utilizar listas já existentes:
            Abaixo estou criando uma stream de valores que pega de 1 a 50
            e mostra todos os números pares da lista.

            Primeiro usa o rangeClosed que inclui o número final também para a conta
            filtra o valor para descobrir se é par e por fim mostra na tela cada elemento
            que corresponde ao filtro.
         */

        IntStream.rangeClosed(1,50).
                filter(n -> n % 2 == 0).
                forEach(n -> System.out.println(n + " "));

        //Diferente do RangeClosed, ele chama do número até o fim - 1.
//        IntStream.range(1, 50).
//                filter(n -> n % 2 == 0).
//                forEach(System.out::println);

        //Streams of recebe uma lista de valores stream e especifica o tipo posteriormente
        Stream.of("Elevando", "os valores", "para UperCase").
                map(String::toUpperCase).
                forEach(System.out::println);

        //Realizando o cálculo da média do Array:
        int[] array = {1,2,3,4,5};
        Arrays.stream(array).
                average().
                ifPresent(System.out::println);

        System.out.println("------------- LEITURA ARQUIVO --------------");


        //Utilizando a Stream para ler os textos
        try(Stream<String> lines = Files.lines(Paths.get("Estudos_Java/src/Curso_Dojo/OOP/CleaningCode/Streams/Dominio/ParaLer"))){
            //lines.forEach(System.out::println); Imprimindo tudo que está escrito no arquiv
            lines.filter(l -> l.contains("Stream")) //Realizando uma leitura de um parágrafo que contenha Stream
            .forEach(System.out::println);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}