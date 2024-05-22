package Curso_Dojo.OOP.Generics.DominioTests;

import Curso_Dojo.OOP.Generics.Dominio.Barco;
import Curso_Dojo.OOP.Generics.service.BarcoRentavelService;

public class TestsGeneric2 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscaBarcoDisponivel();
        System.out.println("Usando barco por um mês...");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}