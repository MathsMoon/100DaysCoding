package Curso_Dojo.OOP.CleaningCode.Streams.DominioTests;

import java.util.stream.IntStream;

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

    }
}