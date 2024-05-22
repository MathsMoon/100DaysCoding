package Curso_Dojo.OOP.Generics.DominioTests;

import java.util.ArrayList;
import java.util.List;

public class TestsWildCard2 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());

        /*
            Diferente dos Arrays que reconhecem seu tipo durante o tempo
            de execução, a Lista em si retorna um erro devido a falta
            de uma especificação melhor do objeto utilizado, podemos usar
            o Animal para o polimorfismos, mas usando a lista no seu estado
            atual ela não reconhecerá a capacidade da classe mãe de receber
            os objetos das classes filhas, desta forma usando o WildCard
            para tornar possível uma lista genérica que receberá uma classe
            mãe geral que agregará dentro dela objetos de diferentes classes
            através do polimorfismo, usando o exemplo abaixo de como funciona:
         */

        PrintConsulta(cachorros);
        PrintConsulta(gatos);

        List<Animal> animals = new ArrayList<>();
        printConsultaAnimal(animals);
        printConsultaAnimal(cachorros);
    }

    /*
        WildCard é um símbolo que representa a generalização de qualquer classe que extenda Animal
        usando este elemento utilizamos apenas para leitura a função devido ao abstratismo de apenas
        reconhecer a classe utilizada, e não criar elementos da mesma.

        Extends lê as funções filho, apenas pegando seus elementos.
        Super já chama a capacidade da classe pai de adicionar objetos
        a uma classe mais especifíca através do polimorfismo.
    */

    private static void PrintConsulta(List<? extends Animal> animals){
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    //Adicionando uma funçõa específica para Adicionar elementos a Lista
    private static void printConsultaAnimal(List<? super Cachorro> animals){
        /* Object -> Animal -> Cachorro
            A hierarquia acima demonstra o motivo da necessidade de utilizar-mos o Object
            como não sabemos qual membro da hierarquia pode aparecer, declaramos o pai de todo
            o polimorfismo que é o Próprio Object em si, desta forma quaisquer classes que existam
            por mais descendentes que tenham, sempre poderão ser acessadas e manipuladas
            através da Object.

            Por conta desta lista receber Animals, podemos criar objetos específicos das classes
            que herdam animal, por estarem abaixo, pegamos este poder devido ao Super que pega
            qualquer classe superior ao Cachorro, ou seja, todas que extendem Animal.
         */
        for (Object o: animals){
            System.out.println("Classe do Objeto: "+o.getClass().getName());
        }
    }
}