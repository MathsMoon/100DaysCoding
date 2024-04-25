package Atividades_avulso;
import java.util.Scanner;

public class calculadora {
    
    public static void Soma(float n1, float n2) {//Soma básica
        float res = n1+n2;
        System.out.printf("O valor da soma de %.2f e %.2f é: %.2f", n1, n2, res);
    }

    public static void Multi (float n1, float n2) {//Multiplicação básica
        float res = n1*n2;
        System.out.printf("O valor da multiplicação de %.2f e %.2f é: %.2f", n1, n2, res);
    }

    public static void Div (float n1, float n2) {//Divisão básica
        float res = n1/n2;
        System.out.printf("O valor da divisão de %.2f e %.2f é: %.2f", n1, n2, res);
    }

    public static void Sub (float n1, float n2) {//Subtração básica
        float res = n1-n2;
        System.out.printf("O valor da subtração de %.2f e %.2f é: %.2f", n1, n2, res);
    }

    public static void main(String[] args) {
        //Definição de variáveis:
        Scanner scan = new Scanner(System.in);
        int escolha;
        float v1, v2;

        //Introdução e inserção dos dados
        System.out.println("Escreva dois valores para calcularmos.");
        
        System.out.printf("Primeiro valor:%n");
        v1 = scan.nextFloat();
        System.out.println("Segundo valor:");
        v2 = scan.nextFloat();

        //Escolha do método para os cálculos
        System.out.println("O que deseja fazer?");
        System.out.printf("1 - Multiplicação %n2 - Divisão %n3 - Adição %n4 - Subtração %n");
        escolha = scan.nextInt();

        switch (escolha) {
            case 1:
                Multi(v1, v2);
                break;
            case 2:
                Div(v1, v2);
                break;
            case 3:
                Soma(v1, v2);
                break;
            case 4:
                Sub(v1, v2);
                break;
        }
    
        //Repetindo a calculadora para mais cálculos
        System.out.printf("%nDeseja fazer outra operação?%n 1 - Sim %n 2 - Não%n");
        int escolha2 = scan.nextInt();

        //Retornando o Main() ou fechando o sistema  
        if(escolha2 == 1) { 
            System.out.println("--------------------------");
            main(args);
        } else {
            System.out.println("Até mais!");
            System.exit(0);
        }

        //fechando o objeto.
        scan.close();
    }
}
