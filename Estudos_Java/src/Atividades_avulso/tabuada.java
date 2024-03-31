package Atividades_avulso;
import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        //Definindo Objetos e variáveis
        Scanner scan = new Scanner(System.in);
        int recebevalor = 0;

        //Introdução do sistema
        System.out.print("Escreva um valor:");
        recebevalor = scan.nextInt();

        //Processo da tabuada
        for(int i = 1; i<=10; i++) {
            System.out.printf("%n" + recebevalor + " * " + i + " = " + (recebevalor * i));
        }
        
        scan.close();
    }
}