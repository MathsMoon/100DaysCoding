package Curso_Dojo.OOP.Methods.DominioTests;
import Curso_Dojo.OOP.Methods.Dominio.Functions.EstudanteParametros;
import Curso_Dojo.OOP.Methods.Dominio.Functions.ImpressoraEstudante;

public class TestsParametros {
    public static void main(String[] args) {
        //Criando os Objetos para manipular o Estudante e a Impressora
        EstudanteParametros objEstudante = new EstudanteParametros();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        //Definindo valores do estudante
        objEstudante.setNome("ABC");
        objEstudante.setIdade(17);
        objEstudante.setSexo('M');

        //Imprimindo com uma classe própria para a função
        impressora.Imprime(objEstudante);
    }
}