package Curso_Dojo.OOP.Methods.DominioTests;
import Curso_Dojo.OOP.Methods.Dominio.Pessoa;

public class TestsPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        //Inserção de valores:
        p1.setNome("Matheus");
        p1.setIdade(19);

        //mostrando valores:
        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());
    }
}
