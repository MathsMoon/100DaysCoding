package Curso_Dojo.OOP.CleaningCode.Streams.DominioTests;

import java.util.List;

public class TestsReduce {
    public static void main(String[] args) {
        /*
            A função reduce do Stream é como se fosse recursão que
            a cada elemento aplica uma certa funcionalidade, a exemplo
            da soma dos números:
         */

        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);

        /* Métodos diferentes para somar os elementos:
            O primeiro recebe os valores e realiza  a soma, caso esteja
            presente ele realiza a impressão do resultado final, o meio
            correto de fazer essa função é com Integer::sum, como o próprio
            Intellij recomenda, devido a função Sum poder conter os elementos
            da stream e realizar o mesmo processo descrito. (O processo se chama
            Method references).

            o último método usa o 0 como identificador caso a lista esteja
            vazia, retornando no lugar de um possível erro de runTime.
         */
        nums.stream().reduce((x, y) -> x + y).ifPresent(System.out::println);
        nums.stream().reduce(Integer::sum).ifPresent(System.out::println);
        System.out.println(nums.stream().reduce(0, Integer::sum));
        System.out.println("-------------------------------------");

        //Conferindo o maior valor da stream:
        System.out.println(nums.stream().reduce(0, Integer::max));
    }
}