package Curso_Dojo.OOP.CleaningCode.Streams.DominioTests;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class TestsParallelStreams {
    public static void main(String[] args) {
        //Verificando quantidade de Threads disponíveis:
        System.out.println(Runtime.getRuntime().availableProcessors());

        long num = 100_000_000;
        sumFor(num);
        sumStreamIterate(num);
        SumLongStream(num);
        SumLongStreamParallel(num);
    }

    private static void sumFor(long num){
        System.out.println("------------ Sum For -----------------");
        long result = 0;
        long init = System.currentTimeMillis();

        for (long i=1; i<=num; i++){
            result += i;
        }

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumStreamIterate(long num){
        System.out.println("------------ Sum Iterate -----------------");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i-> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    /*
        Para números grandes a Stream em si começa a perder eficiência devido
        ao problema de diversas vezes utilizar o boxing nos elementos, tornando
        assim a aplicação mais lenta, para resolver essa questão podemos utilizar o
        StreamLong para essas necessidades em específico ou utilizar múltiplas Threads
        para trabalhar com a solução, adicionando o .parallel em qualquer lugar da stream.
     */
    private static void sumStreamParallel(long num){
        System.out.println("------------ Sum IterateParallel -----------------");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i-> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void SumLongStream(long num){
        System.out.println("------------ Sum LongStream -----------------");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).sum();
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    //Usando em Conjunto Long e Parallel
    private static void SumLongStreamParallel(long num){
        System.out.println("------------ Sum LongStreamParallel -----------------");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().sum();
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
}