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

        //Alterei para classe tomate para adicionar o set data validade
        Tomate produto2 = new Tomate("a", 7);
        //setando a data de validade para o cast manual
        produto2.setDataValidade("11/12/2025");

        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.CalculoImposto());

    }
}