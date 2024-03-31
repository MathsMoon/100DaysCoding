package Atividades_Facul;
import java.util.Scanner;

public class MaioreMenor {
    public static void main(String[] args) {
        //Definição de variáveis e Objetos:
        Scanner scan = new Scanner(System.in);
        int idade;

        //Introdução do sistema
        System.out.print("Escreva sua idade para saber sua faixa etária: ");
        idade = scan.nextInt();

        //cálculo da faixa etária
        if (idade >=65) {
            System.out.println("Idoso");
        } else if (idade >=18) {
            System.out.println("Adulto");
        } else if (idade >=12) {
            System.out.println("Adolescente");
        } else {
            System.out.println("Criança");
        }

        scan.close();
    }
}
