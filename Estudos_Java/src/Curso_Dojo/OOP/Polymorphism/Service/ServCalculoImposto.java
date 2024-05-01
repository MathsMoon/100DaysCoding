package Curso_Dojo.OOP.Polymorphism.Service;
import Curso_Dojo.OOP.Polymorphism.Dominio.Produto;
import Curso_Dojo.OOP.Polymorphism.Dominio.Tomate;

public class ServCalculoImposto {

    //Criando uma função Genérica para receber qualquer tipo de Objeto que seja
    //produto ou herdeiro da classe produto.
    public static void CalculoImposto(Produto produto) {
        System.out.println("Relatório de Imposto:");
        double imposto = produto.CalculoImposto();
        double total = imposto + produto.getValor();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser Pago: " + imposto);
        System.out.println("Valor Total: " + total);

        /*
            Dentro da função genérica eu posso adicionar funcionalidades através do InstaceOf
            Ele permite que rode o código dentro do if caso o produto passado seja de uma classe
            específica.
        */
        if (produto instanceof Tomate tomate) {
            System.out.println("Data de validade: " + tomate.getDataValidade());
        }
    }
}