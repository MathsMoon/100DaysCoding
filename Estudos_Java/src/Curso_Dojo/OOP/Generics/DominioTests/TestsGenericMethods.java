package Curso_Dojo.OOP.Generics.DominioTests;

import Curso_Dojo.OOP.Generics.Dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class TestsGenericMethods {
    public static void main(String[] args) {
        //Criando um array dentro da Função:
        criarArrayComUmObjeto(new Barco("Canoa poggers"));

        //Usando uma lista já criada para retornar
        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Canoa braba")));
        System.out.println(retornandoListaGenerica(barcoList));
    }

    //Criando um método genérico para manipular diversos elementos sem precisar de uma classe própria
    private static <T> void criarArrayComUmObjeto(T t){
        List<T> list = List.of(t); //Criando uma possível lista com elementos genéricos
        System.out.println(list);
    }

    //Retornando uma Lista de itens genéricos:
    private static <T> List<T> retornandoListaGenerica(T t){
        return List.of(t);
    }
}