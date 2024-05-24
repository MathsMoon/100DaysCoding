package Curso_Dojo.OOP.CleaningCode.Lambda.DominioTests;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

/*
    Utilizando agora uma Instância de um método genérico para um objeto particular
*/

public class TestsLambdaMethodReferences3 {
    public static void main(String[] args) {
        //Criando a Lista
        List<String> genshinElements = new ArrayList<>(List.of("Pyro", "Hydro", "Cryo", "Electro", "Dendro", "Geo", "Anemo"));
        genshinElements.sort(String::compareTo); //Usando a Lambda para retornar um CompareTo organizando alfabeticamente.
        System.out.println("Elementos em ordem Alfabética: "+ genshinElements);

        //Usando o Function para transformar uma String em um número int:
        Function<String, Integer> numStringToInteger = Integer::parseInt;
        System.out.println("Transformando de String para Int: "+ numStringToInteger.apply("20"));

        //Usando o Predicate para verificar se eu possuo um elemento em uma Lista
        BiPredicate<List<String>, String> verifyElements = List::contains;
        System.out.println("Possuo o Elemento Pyro na lista? "+ verifyElements.test(genshinElements, "Pyro"));
    }
}