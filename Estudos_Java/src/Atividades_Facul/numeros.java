package Atividades_Facul;
import java.util.Scanner;

public class numeros {
    public static void main(String[] args) {
        //Criação de variáveis:
        int NumeroRecebido = 0;
        Scanner scan = new Scanner(System.in);

        //Introdução do sistema:
        System.out.println("Escreva abaixo um Número, para sabermos seu sucessor e anterior.");
        System.out.print("Número escolhido: ");
        NumeroRecebido = scan.nextInt();

        System.out.printf("%nNúmero recebido: %d", NumeroRecebido);
        System.out.printf("%nNúmero anterior: %d", NumeroRecebido - 1);
        System.out.printf("%nNúmero Sucessor: %d", NumeroRecebido + 1);

        scan.close();
    }
}
