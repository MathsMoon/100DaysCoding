package Curso_Dojo.OOP.Methods.DominioTests;
import Curso_Dojo.OOP.Methods.Dominio.Constants.Carro;
import Curso_Dojo.OOP.Methods.Dominio.Constants.Comprador;

public class TestsCompradorFinal {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador = new Comprador();

        carro.DONO.setNome("Luis");

        System.out.println(carro.DONO.getNome());
    }
}