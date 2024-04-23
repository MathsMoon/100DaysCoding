package Loiane_CursoJava.Exercicios;

import java.util.Scanner;

public class Fibo {

    public static void main(String[] args) {
        //Definindo Objeto Scanner
        Scanner scan = new Scanner(System.in);

        //Inserindo o n-égesimo termo da sequência
        System.out.println("Digite o número da sequência: ");
        int n = scan.nextInt();

        //Criando o Array
        int[] fibonnaci = new int[n];
        fibonnaci[0] = 0;
        fibonnaci[1] = 1;

        //Loop for que executa a fibonnaci
        for (int i = 2; i < n; i++) {
            fibonnaci[i] = fibonnaci[i - 1] + fibonnaci[i - 2];
            System.out.println(fibonnaci[i]);
        }
    }
}
