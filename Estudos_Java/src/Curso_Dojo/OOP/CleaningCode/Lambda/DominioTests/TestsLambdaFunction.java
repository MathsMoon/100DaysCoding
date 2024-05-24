package Curso_Dojo.OOP.CleaningCode.Lambda.DominioTests;

/*
   A function como próprio nome indica é uma função que retorna
   um valor, servindo como um método, mas diferente dos convencionais
   que são atrelados a classe, a functions são construídas e usadas
   em qualquer parte do código e não participam de uma classe em específico.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TestsLambdaFunction {
    public static void main(String[] args) {
        List<String> names = List.of("Heizou", "Kazuha", "Aether");
        List<Integer> lenghts = map(names, s -> s.length());

        System.out.println(lenghts);
    }

    /*
        A lista abaixo recebe um tipo genérico para retornar uma resposta genérica
        então quando passamos a lista e a função que vem na forma de uma Lambda
        passamos informações necessárias para que a implementação da Function ocorra
        que é esta interface que trabalha recebendo os tipos e retornos genéricos como
        void.
     */
    private static <T, R> List<R> map(List<T> list, Function<T, R> function){
        //Criando uma lista de resultado que vai retornar como resposta
        List<R> result = new ArrayList<>();

        //Interação entre cada elemento da lista
        for (T e:list){
            R r = function.apply(e); //cada elemento é passado e a função é realizada de acordo com os parâmetros
            result.add(r); //o resultado é salvo na lista resul
        }
        return result;
    }
}