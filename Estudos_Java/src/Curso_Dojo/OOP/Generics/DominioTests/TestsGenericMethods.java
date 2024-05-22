package Curso_Dojo.OOP.Generics.DominioTests;

import Curso_Dojo.OOP.Generics.Dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class TestsGenericMethods {
    public static void main(String[] args) {
        criarArrayComUmObjeto(new Barco("Canoa poggers"));
    }

    //Criando um método genérico para manipular diversos elementos sem precisar de uma classe própria
    private static <T> void criarArrayComUmObjeto(T t){
        List<T> list = List.of(t); //Criando uma possível lista com elementos genéricos
    }

    //Retornando uma Lista de itens genéricos:
    private static <T> List<T> retornandoListaGenerica(T t){
        return List.of(t);
    }
}