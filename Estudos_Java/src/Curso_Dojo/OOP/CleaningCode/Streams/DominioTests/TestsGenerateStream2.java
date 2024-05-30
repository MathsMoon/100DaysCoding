package Curso_Dojo.OOP.CleaningCode.Streams.DominioTests;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class TestsGenerateStream2 {
    public static void main(String[] args) {
        //Gerando Streams "Infinitos"
//        Stream.iterate(1, n -> n + 2).limit(200)
//        .forEach(System.out::println);

        System.out.println("------------------------------------------");

        //Fibonnaci pelo Stream
        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]}).
                limit(10).
                forEach(a -> System.out.println(Arrays.toString(a)));

        /* Realizando Fibonnaci com o map
            A diferença utilizando o map é justamente de organizar o array
            para mostrar o primeiro elemento que retorna após o cálculo
            n[0] + n[1] da sequência, já que a posição zero guarda o valor
            da soma do resultado anterior.
         */
        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]}).
                limit(10).map(a -> a[0]).forEach(System.out::println);

        System.out.println("------------------------------------------");

        /* Usando o Stream generate
            Para utilizar o stream generate é necessário de um supplier,
            ou seja, necessita de uma classse que é capaz de trabalhar
            da mesma forma que o iterate trabalha. Como no exemplo abaixo
            que a ThreadLocalRandom cria aleatoriamente valores para
            a Stream:
         */

        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(1,500)).
                limit(90).
                forEach(System.out::println);

    }
}