package Curso_Dojo.Atividades.ExercPOO.MainClasses;

import Curso_Dojo.Atividades.ExercPOO.Domain.CalcFatorial;

import java.util.Scanner;

public class TestsCalcFatorial {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);

        System.out.println("Insira um valor para Fatorarmos: ");
        int k = scan.nextInt();

        //Ele só pode ser usado pela classe se pertencer a classe ou seja, ser static
        CalcFatorial.CalculosFatorialRecursivo(k);

    }
}