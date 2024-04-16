package Loiane_CursoJava.Exercicios;
import java.util.Scanner;

public class Exerc19 {
    public static void main(String[] args) {
        //Definindo os parâmetros para os exercícios
        final int TAM = 5;
        int[] A = new int[TAM];
        int[] B = new int[TAM];
        Scanner scan = new Scanner(System.in);

        //Inserindo os dados
        for(int i = 0; i<TAM; i++) {
            System.out.println("Digite um número:");
            A[i] = scan.nextInt();
            B[i] = A[i];
        }

        //Manipulando o Array B
        for(int C:B) {
            System.out.println(C * 2); //Mostrando o dobro
        }

        for(int C:B) {
            System.out.println(C );
        }

        //Fechando o objeto 
        scan.close();
    }
}
