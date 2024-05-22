package Curso_Dojo.OOP.Generics.DominioTests;

import Curso_Dojo.OOP.Generics.Dominio.Barco;
import Curso_Dojo.OOP.Generics.Dominio.Carro;
import Curso_Dojo.OOP.Generics.service.BarcoRentavelService;
import Curso_Dojo.OOP.Generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class TestsGeneric3 {
    public static void main(String[] args) {
        //Criando a Lista que imita o Banco de Dados com os veículos disponíveis
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("Mercedes"), new Carro("BMW")));
        List<Barco> BarcosDisponiveis = new ArrayList<>(List.of(new Barco("Iate"), new Barco("Lancha")));

        //Como a função recebe um Tipo genérico podemos usar carro e Barcom com a mesma classe que funciona
        RentalService<Carro> rentalServiceCar = new RentalService<>(carrosDisponiveis);
        RentalService<Barco> rentalServiceBoat = new RentalService<>(BarcosDisponiveis);

        //Mostrando a lista antes da maniupalção
        System.out.println("-------------------------");
        System.out.println("Veículos Disponíveis: ");
        System.out.println(carrosDisponiveis);
        System.out.println("----------------");
        System.out.println(BarcosDisponiveis);
        System.out.println("-------------------------");

        //Usando e Retornando o Carro
        Carro carro = rentalServiceCar.buscaObjetoDisponivel();
        System.out.println("Retornando Carro...");
        rentalServiceCar.retornarObjetoAlugado(carro);

        //Usando e retornando o Barco
        Barco barco = rentalServiceBoat.buscaObjetoDisponivel();
        System.out.println("Retornando Barco...");
        rentalServiceBoat.retornarObjetoAlugado(barco);
    }
}