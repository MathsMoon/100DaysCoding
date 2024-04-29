package Curso_Dojo.OOP.Polymorphism.Service;
import Curso_Dojo.OOP.Polymorphism.Dominio.Produto;

public class ServCalculoImposto {

    //Criando uma função Genérica para receber qualquer tipo de Objeto que seja
    //produto ou herdeiro da classe produto.
    public static void CalculoImposto(Produto produto) {
        System.out.println("Relatório de Imposto:");
        double imposto = produto.CalculoImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser Pago: " + imposto);
    }
}