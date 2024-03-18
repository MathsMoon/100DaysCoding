package Topicos_java;
import java.util.Scanner;
import java.util.Arrays;

public class Tests {

    public static void VeriIgualArray(int[] a, int[] b){
        if(Arrays.equals(a, b)) {
            System.out.println("Essas Arrays são idênticas");
        } else {
            System.out.println("Essas Arrays são diferentes");
        }
    }

    public static void SequeArray(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
    }

    public static void PreencheArray (int[] a, int[] b) {
        for (int i = 0; i < 5; i++) {
            if (a[i] == 0) {
                Arrays.fill(a, 10);
            } else if (b[i] == 0) {
                Arrays.fill(b, 10);
            }
        }
    }
    public static void MostrarArray(int[] a, int[] b) {
        for(int i = 0; i<5; i++){
            System.out.printf("A primeira Array esta assim: %s", a);
            System.out.printf("A segunda Array esta assim: %s", b);
        }
    }
    
    public static void main(String[] args) {
        //Criação de variáveis
        final int tam = 5;
        int[] num1 = new int[tam];
        int[] num2 = new int[tam];
        Scanner scan = new Scanner(System.in);

        //Introdução ao sistema e inserção de dados
        for(int i = 0; i<tam; i++){
            System.out.println("Insira a primeira sequência de números aqui: ");
            num1[i] = scan.nextInt();
        }
        for(int i = 0; i<tam; i++){
            System.out.println("Insira a segunda sequência de números aqui: ");
            num2[i] = scan.nextInt();
        }

        //Funcionalidades da Array
        VeriIgualArray(num1, num2); //Veririca se os Arrays são iguais
        SequeArray(num1, num2);
        

    }

}
