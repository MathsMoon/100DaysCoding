package Curso_Dojo.OOP.Polymorphism.DominioTests;
import Curso_Dojo.OOP.Polymorphism.Dominio.Computador;
import Curso_Dojo.OOP.Polymorphism.Dominio.Produto;
import Curso_Dojo.OOP.Polymorphism.Dominio.Tomate;

public class TestsProduto02 {
    public static void main(String[] args) {
        /*
            Polimorfismo é a capacidade de uma variável de referência poder ir além
            da referência a um objeto de mesmo tipo, ele pode alternar entre tipos diferentes
            No exemplo abaixo a variável produto é de uma classe mas consegue manipular as subclasses
            devido a herança que possibilita o Polimorfismo.
        */

        //Criando o objeto da classe produto e associando ao computador
        Produto produto = new Computador("a", 100);

        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.CalculoImposto());

        System.out.println("----------------------------------------");

        Produto produto2 = new Tomate("a", 7);

        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        //Irei adicionar depois mais um parâmetro que não existe em produto (Mostrando a Validade do Tomate):

        System.out.println(produto2.CalculoImposto());

    }
}