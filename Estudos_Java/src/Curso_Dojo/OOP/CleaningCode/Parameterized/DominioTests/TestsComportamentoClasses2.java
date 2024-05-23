package Curso_Dojo.OOP.CleaningCode.Parameterized.DominioTests;

import Curso_Dojo.OOP.CleaningCode.Parameterized.Dominio.Car;
import Curso_Dojo.OOP.CleaningCode.Parameterized.Interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class TestsComportamentoClasses2 {
    private static final List<Car> listaCarros = new ArrayList<>(
            List.of(new Car("Blue", 2020),
                    new Car("White", 2017),
                    new Car("All Black", 2024)
            ));

    /*
        Apesar de ter melhorado o código a generalização, ainda temos o trabalho
        de alterar as condições especificadas para cada tipo de busca que pode
        existir dentro daquele método, portanto visando limpar o código de
        redundâncias como aquela, podemos trabalhar com uma inteface para
        criar um método de Test padrão em que apenas os parâmetros serão levados
        em consideração, assim diminuindo a necessidade de construir um método para
        todo tipo de pesquisa.
     */

    //Método geral de Filtragem:
    private static List<Car> carsListFilter(List<Car> cars, CarPredicate carPredicate){
        List<Car> carListFilter = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)){
                carListFilter.add(car);
            }
        }
        return carListFilter;
    }

    public static void main(String[] args) {

        //Com esta subclasse podemos organizar no próprio atributo o que buscamos com a pesquisa
        List<Car> filteredCarsByColor = carsListFilter(listaCarros, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("White");
            }
        });

        //Resultado da Subclasse
        System.out.println("------------------------------------");
        System.out.println("CARROS PELA COR (BRANCA): ");
        System.out.println(filteredCarsByColor);

        //Pesquisa com ano usando Lambda, assunto da próxima aula:
        List<Car> filteredCarsByYear = carsListFilter(listaCarros, car -> car.getYear()<2022);

        System.out.println("------------------------------------");
        System.out.println("CARROS PELO ANO antes de 2022: ");
        System.out.println(filteredCarsByYear);
    }
}