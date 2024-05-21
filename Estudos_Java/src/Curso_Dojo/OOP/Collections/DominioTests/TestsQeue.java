package Curso_Dojo.OOP.Collections.DominioTests;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestsQeue {
    public static void main(String[] args) {
        /*
            A Qeue funciona como uma fila que o primeiro ao entrar é o
            primeiro a sair, desta forma enquanto a utilizarmos será importante
            a sequência dos dados colocados, abaixo tem uma fila com letras
            que ao serem impressas retornam o valor conforme declarado
            mas ao utilizar uma das funções da Qeue podemos ordena-la de outras
            formas assim desfazendo a fila ou reorganizando ela.

            Comandos:
            poll -> Mostra e retira o primeiro elemento da fila
            peek -> mostra o primeiro elemento da fila
            remove -> remove os elementos da fila.
         */

        Queue<String> fila = new PriorityQueue<>();
        fila.add("C");
        fila.add("B");
        fila.add("A");

        //Fila na sua forma padrão
        for (String s:fila){
            System.out.println(s);
        }

        System.out.println("---------------------");

        //Removendo a Fila mostrará ela organizada de forma alfabética:
        while (!fila.isEmpty()){
            System.out.println(fila.poll()); //Comando para mostrar o elemento da fila e remove-lo
        }
    }
}