package CFB_CursoJava.testes_java;
import java.util.Scanner;
import java.util.Arrays;

public class TestArray {

    public static void VeriIgualArray(int[] a, int[] b){
        if(Arrays.equals(a, b)) {
            System.out.println("\nEssas Arrays são idênticas");
        } else {
            System.out.println("\nEssas Arrays são diferentes");
        }
    }

    public static void SequenciaArray(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
    }
    
    //Preenche a Array com um número aleatório de 1 a 10
    public static void PreencheArray (int[] a, int[] b) {
        for (int i = 0; i < 5; i++) {
            if (a[i] == 0) {
                a[i] = (int) (Math.random()*11);
            }

            if (b[i] == 0) {
                b[i] = (int) (Math.random()*11);
            }
        }
    }


    public static void MostrarArray(int[] a, int[] b) {
        for(int i = 0; i<5; i++){
            System.out.printf("\nA primeira Array esta assim: %d", a[i]);
            System.out.printf("\nA segunda Array esta assim: %d", b[i]);
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

        //Mostrando as Arrays antes da alteração
        for(int i = 0; i<tam; i++) {
            System.out.printf("%nMostrando os valores Array 1: %d", num1[i]);
            System.out.printf("\nMostrando os valores Array 2: %d", num2[i]);
        }

        //Funcionalidades da Array
        VeriIgualArray(num1, num2); //Veririca se os Arrays são iguais
        SequenciaArray(num1, num2); //Vai colocar em sequência os valores das Arrays (menor para o maior)

        //funcionalidade para ler se alguma coisa da variável está sem preencher
        PreencheArray(num1, num2);

        //Mostrando o resultado final
        MostrarArray(num1, num2);

        scan.close();
    }

}
