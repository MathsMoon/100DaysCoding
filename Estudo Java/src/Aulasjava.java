import java.util.Scanner;

public class Aulasjava {
    public static void main(String[] args) { 
    //Declaração de variáveis
        String[] paises; 
        String nome;

    //Declaração de objeto
        Scanner scan = new Scanner(System.in);

    //Introdução ao sistema
        System.out.print("Seja bem vindo, por favor diga seu nome:");
        nome = scan.nextLine();
        System.out.printf("Olá %s! pode nos descrever os seus gostos por carros?", nome);
        
    //Recebimento de dados
        System.out.println("\nDigite aqui: ");
        //paises = scan.nextLine();

        //Aprender agora os conceitos de Array e tentar fazer listas de gostos e fazer comparativos entre as arrays multidimensionais
        //scan.close();
        
    }
}
