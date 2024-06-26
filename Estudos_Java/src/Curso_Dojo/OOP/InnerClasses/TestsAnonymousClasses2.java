package Curso_Dojo.OOP.InnerClasses;

import Curso_Dojo.OOP.Generics.Dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestsAnonymousClasses2 {
    public static void main(String[] args) {
        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

        //Criando uma subclasse da collections para organizar a lista de barcos:
        barcoList.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        //Mostrando o resultado da Lista
        System.out.println(barcoList);
    }
}