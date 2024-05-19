package Curso_Dojo.OOP.Collections.DominioTests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestsBinarySearch {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(4);
        numeros.add(7);
        numeros.add(3);
        numeros.add(1);

        //Utilizando a Binary Search (-(ponto de inserção) -1);
        Collections.sort(numeros); //Para usar a Binary Search é necessário primeiro ordena-la
        System.out.println(Collections.binarySearch(numeros,2));
    }
}