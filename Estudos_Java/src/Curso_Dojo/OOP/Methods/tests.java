package Curso_Dojo.OOP.Methods;
import Curso_Dojo.OOP.Methods.Dominio.Calculadora;

public class tests {
    public static void main(String[] args) {
        //Instanciando o Objeto a classe calculadora
        Calculadora calc = new Calculadora();

        //Utilizando o método de multiplicação:
        calc.MultiplyNumbs(10,20);

        //Chamando método de divisão
        System.out.println(calc.DividedNumbs(88.2,3.111));

        //Chamando método de soma
        System.out.println(calc.Soma(22.3f, 11.32f));

    }
}
