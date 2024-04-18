package Loiane_CursoJava.Exercicios;
// import java.util.Scanner;
import java.util.Random;

public class Exerc19 {
    public static void main(String[] args) {
        //Definindo os parâmetros para os exercícios
        final int TAM = 5;
        int[] A = new int[TAM];
        int[] B = new int[TAM];
        // Scanner scan = new Scanner(System.in);
        Random rd = new Random(); //Para gerar números aleatórios

        //1. Inserindo os dados de A para B
        for(int i = 0; i<TAM; i++) {
            A[i] = rd.nextInt(100); //gerando números aleatórios de 0 a 100
            if(A[i] == 0) {
                A[i] += 1;
            }
            B[i] = A[i];
            System.out.println(A[i]);
        }

        //2. Multiplicando o valor de B em 2.
        System.out.println("-------1---------");
        for(int C:B) {
            System.out.println(C * 2); //Mostrando o dobro
        }

        //3. Recebe o quadrado de A
        System.out.println("--------2--------");
        for(int C:B) {
            System.out.println(C * C);
        }

        //4. os valores de B são a raiz de A
        System.out.println("--------3--------");
        for(int i = 0; i<TAM; i++) {
           B[i] = (int) Math.sqrt(A[i]);   
           System.out.println(B[i]);
        }

        //5. Multiplicação pelo índice
        System.out.println("--------4--------");
        for(int i = 0; i<TAM; i++) {
            B[i] = A[i] * i;
            System.out.println(B[i]);
        }

        //6. Adicionando a soma dos Arrays para C
        System.out.println("---------5-------");
        for(int i = 0; i<TAM; i++) {
            int[] C = new int[TAM]; 
            C[i] = B[i] + A[i];
            System.out.println(C[i]);
        }

        //7. Adicionando ao C a Subtração dos Arrays
        System.out.println("--------6--------");
        for(int i = 0; i<TAM; i++) {
            int[] C = new int[TAM]; 
            C[i] = B[i] - A[i];
            System.out.println(C[i]);
        }

        //8. Adicionando ao C A multiplicação dos Arrays
        System.out.println("--------7--------");
        for(int i = 0; i<TAM; i++) {
            int[] C = new int[TAM]; 
            C[i] = B[i] * A[i];
            System.out.println(C[i]);
        }

        //9. Adicionando ao C a divisão dos Arrays
        System.out.println("--------8--------");
        for(int i = 0; i<TAM; i++) {
            int[] C = new int[TAM]; 
            C[i] = B[i] / A[i];
            System.out.println(C[i]);
        }

        //10. B recebe modulo de A
        System.out.println("--------9--------");
        for(int i = 0; i<TAM; i++) {
            B[i] = A[i] %2;
            System.out.println(B[i]);
        }

        //11. Vendo os números pares:
        System.out.println("-------10--------");
        for(int i = 0; i<TAM; i++) {
            if(A[i] %2 == 0) {
                System.out.printf("%d é par%n", A[i]);
            }
        }

        //12. Somando todos os elementos da Array:
        // System.out.println("-------11--------");
        // for(int i = 0; i<TAM; i++) {
        //     int c =  A[i] 
        // }

        //13. 
        System.out.println("-------12--------");








    }
}
