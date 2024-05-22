package Curso_Dojo.OOP.Generics.service;

import Curso_Dojo.OOP.Generics.Dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedes")));

    public Carro buscaCarroDisponivel(){
        System.out.println("Buscando Carro disponível.........");
        Carro carro = carrosDisponiveis.removeFirst();
        System.out.println("Alugando Carro: "+ carro);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void retornarCarroAlugado(Carro carro){
        System.out.println("Devolvendo carro: " + carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(carrosDisponiveis);
    }
}