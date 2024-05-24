package Curso_Dojo.OOP.CleaningCode.Lambda.DominioTests;

import java.util.List;
import java.util.function.Consumer;

public class TestsLambdaConsumer {

    /*
       Diferente da expressão da Lambda com Predicate que retorna algo
       o Consumer foca em uma função void.
     */

    public static void main(String[] args) {
        List<String> names = List.of("Hu Tao", "Ganyu", "Navia", "Furina");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        forEach(names, name -> System.out.println(name));
        forEach(numbers, num -> System.out.println(num));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T e:list){
            consumer.accept(e);
        }
    }
}