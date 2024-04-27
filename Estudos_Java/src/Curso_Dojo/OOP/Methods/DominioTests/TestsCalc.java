package Curso_Dojo.OOP.Methods.DominioTests;
import Curso_Dojo.OOP.Methods.Dominio.Functions.Calculadora;

public class TestsCalc {
    public static void main(String[] args) {
        //Instanciando o Objeto a classe calculadora
        Calculadora calc = new Calculadora();

        //Utilizando o método de multiplicação:
        calc.MultiplyNumbs(10,20);

        //Chamando método de divisão
        System.out.println(calc.DividedNumbs(88.2,3.111));

        //Chamando método de soma
        System.out.println(calc.Soma(22.3f, 11.32f));

        //Ao passar os valores primitivos pela função, se passa uma cópia destes valores
        calc.SubNums(- 10, 20); // Caso A ou B sejam menores que 0, retorna o primeiro print e não os dois juntos

        //Passando valores a uma função pelo Varargs:
        int[] a = {1, 2, 3, 4};
         calc.SomaArrays(a); //Retorna 10

    }
}
