package Curso_Dojo.OOP.Generics.service;

import Curso_Dojo.OOP.Generics.Dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Iate")));

    public Barco buscaBarcoDisponivel(){
        System.out.println("Buscando Barco disponível.........");
        Barco barco = barcosDisponiveis.removeFirst();
        System.out.println("Alugando Barco: "+ barco);
        System.out.println("Barcos disponíveis para alugar: ");
        System.out.println(barcosDisponiveis);
        return barco;
    }

    public void retornarBarcoAlugado(Barco barco){
        System.out.println("Devolvendo barco: " + barco);
        barcosDisponiveis.add(barco);
        System.out.println("Barcos disponíveis para alugar: ");
        System.out.println(barcosDisponiveis);
    }
}