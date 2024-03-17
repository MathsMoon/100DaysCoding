package Projeto_SistemaAluno;
import java.util.Scanner;
import java.util.Arrays;

public class Correcaoprova {
    public static void main(String[] args) { 
        //Criação de Variáveis e objetos
        final int tam = 10;
        int nota=0;
        char[] gabarito = {'a', 'b', 'e', 'e', 'c', 'a', 'd', 'b', 'c', 'd'};
        char[] respostas = new char[tam];
        Scanner scan = new Scanner(System.in);
        
        //Introdução ao processo
        System.out.println("Descreva abaixo suas respostas em ordem como descrito no gabarito.");

        //Entrada de informações
        for(int i=0; i<tam; i++) {
            System.out.println("Digite sua resposta");
            respostas[i] = scan.nextLine().charAt(0);
        }

        //Cálculo da nota
        if(Arrays.equals(respostas, gabarito)) {
            nota = 10;
        } else {
            for(int i = 0; i<tam; i++) {
                if (respostas[i] == gabarito[i]) {
                    nota++;
                }
            }
        }
        
        //Saída do resultado
        System.out.printf("Sua nota final é: %d", nota);
        scan.close();
        System.exit(0); 
    }
}