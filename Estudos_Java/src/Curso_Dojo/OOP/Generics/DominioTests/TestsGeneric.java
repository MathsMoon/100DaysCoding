package Curso_Dojo.OOP.Generics.DominioTests;

import Curso_Dojo.OOP.Generics.Dominio.Carro;
import Curso_Dojo.OOP.Generics.service.CarroRentavelService;

public class TestsGeneric {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscaCarroDisponivel();
        System.out.println("Usando carro por um mês...");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}