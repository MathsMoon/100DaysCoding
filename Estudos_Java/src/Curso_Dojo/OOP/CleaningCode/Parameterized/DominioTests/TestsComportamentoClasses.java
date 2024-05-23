package Curso_Dojo.OOP.CleaningCode.Parameterized.DominioTests;

import Curso_Dojo.OOP.CleaningCode.Parameterized.Dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class TestsComportamentoClasses {
    /*
        Como demonstrado abaixo criando um método para busca de cores
        temos que lidar com a lista nesta filtragem de acordo com o que foi
        buscado, o problema é que cada vez mais a lista pode crescer
        e acrescentar atributos para serem pegos em uma pesquisa irá
        tornar gigante esse código que é específico. então da mesma
        forma que organizamos com o Generics, vamos usar um método
        genérico de pesquisa para que os parâmetros passados sejam
        a linha de raciocínio que definirá a pesquisa.
     */

    //Pesquisa apenas para carros pretos.
    private static List<Car> filterAllBlackCars(List<Car> cars){
        List<Car> blackCars = new ArrayList<>();
        for (Car car : cars) {
            if(car.getColor().equalsIgnoreCase("all black")) {
                blackCars.add(car);
            }
        }
        return blackCars;
    }

    //Pesquisa genérica:
    private static List<Car> filterAllCarsByColor(List<Car> cars, String color){
        List<Car> GenericCars = new ArrayList<>();
        for (Car car : cars) {
            if(car.getColor().equalsIgnoreCase(color)) {
                GenericCars.add(car);
            }
        }
        return GenericCars;
    }

    //Pesquisa por Data:
    private static List<Car> filterAllCarsByYearBefore(List<Car> cars, int year){
        List<Car> OldCars = new ArrayList<>();
        for (Car car : cars) {
            if(car.getYear() < year) {
                OldCars.add(car);
            }
        }
        return OldCars;
    }

    public static void main(String[] args) {
        List<Car> listaCarros = new ArrayList<>(List.of(new Car("Blue", 2020), new Car("White", 2017), new Car("All Black", 2024)));

        //Pesquisa específica
        System.out.println(filterAllBlackCars(listaCarros));
        System.out.println("---------------------");
        //Pesquisa com parâmetros
        System.out.println(filterAllCarsByColor(listaCarros, "blue"));
        System.out.println("---------------------");
        //Pesquisa por idade
        System.out.println(filterAllCarsByYearBefore(listaCarros, 2024));
    }
}