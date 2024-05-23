package Curso_Dojo.OOP.CleaningCode.Parameterized.DominioTests;

import Curso_Dojo.OOP.CleaningCode.Parameterized.Dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestsComportamentoClasses3 {
    private static final List<Car> listaCarros = new ArrayList<>(
            List.of(new Car("Blue", 2020),
                    new Car("White", 2017),
                    new Car("All Black", 2024)
            ));

    /*
        Para as próximas aulas devo pesquisar mais sobre generalização
        reforçando esses tópicos e criação de listas e pesquisas
        genéricas posso construir mais fácil interfaces para conter
        diferentes tipos de busca sem precisar ficar criando para
        cada um em específico.
     */

    //Método geral de Filtragem usando o generics <T>
    private static <T> List<T> genericFilter(List<T> list, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for (T e:list){
            if (predicate.test(e)){
                filteredList.add(e);
            }
        }
        return filteredList;
    }

    public static void main(String[] args) {
        //Pesquisa sobre A cor:
        List<Car> byColor = genericFilter(listaCarros, car -> car.getColor().equalsIgnoreCase("white"));

        //Resultado da pesquisa
        System.out.println("------------------------------------");
        System.out.println("Carros pela cor (branca): ");
        System.out.println(byColor);

        //Pesquisa sobre o Ano:
        List<Car> byYear = genericFilter(listaCarros, car -> car.getYear()<2022);

        System.out.println("------------------------------------");
        System.out.println("Carros pelo ano (antes de 2022): ");
        System.out.println(byYear);

        //Pesquisa de números pares:
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println("------------------------------------");
        System.out.println("Números pares: ");
        System.out.println(genericFilter(nums, num -> num % 2 == 0));
    }
}