package Curso_Dojo.OOP.Collections.DominioTests;

import java.util.ArrayList;
import java.util.List;

public class TestsLists {
    public static void main(String[] args) {
        /*
            Usando o <> eu forço a Lista a receber um tipo específico
            Para limitar os tipos de informações que podem ser guardadas
            Nesta lista.
        */
        List<String> nomes = new ArrayList<>(2);
        nomes.add("Aba");
        nomes.add("UwU");
        // nomes.remove(0); removendo o Aba, posso também utilizar o RemoveFirst().
        /*
            Ele pode remover tanto por Index quanto por Objeto
            O problema é que depedendo do Objeto ele pode não reconhecer os valores
            Como iguais, ex: para o Java Aba != aba, por tanto se eu usasse o remove
            escrevendo "aba" ele me retornaria false e não removeria nada, devido a diferença
            dos Objetos. Portanto ao usar o remove utilize meios de tornar os valores
            iguais para remoção correta.
        */

        System.out.println("------------- LOOP EACH -------------");
        //O Loop mais usado para mexer com coleções é o ForEach
        for (String nome: nomes){
            System.out.println(nome);
        }

        System.out.println("------------- LOOP I ----------------");

        //Utilizando o loop com interator
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        System.out.println("------------- LOOP II ---------------");

        List<String> nomes2 = new ArrayList<>(2);
        nomes2.add("aba");
        nomes2.add("Womp Womp");

        for (String nome: nomes2){
            System.out.println(nome);
        }

        System.out.println("------------- ADDING ALL ------------");


        //Adicionando os valores de mesmo tipo em 1 tabela só.
        nomes.addAll(nomes2);
        System.out.println(nomes);
    }
}