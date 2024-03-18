package Projeto_SistemaAluno;
import java.util.Arrays;
import java.util.Scanner;

public class correcao2 {
    public static void main(String[] args) {
    
    //Criação de Variáveis e Objetos
    final int tam = 5;
    int nota=0;
    char[] gabarito = {'a', 'c', 'e', 'c', 'b'};
    char[] respostas = new char[5];
    Scanner scan = new Scanner(System.in);

    //Introdução do sistema
    System.out.println("Insira em forma sequencial os resultados de seu gabarito.");

    /*Inserção dos dados pelo usuário (Original)
        for(int i = 0; i<tam; i++) {
            System.out.println("Descreva sua nota: ")
            respostas[i] = scan.nextLine().charAt(0);
        }
        */

    /* fiz uma alteração como descrito na aula para deixar como parâmetros. 
    n:respostas. 
    Funciona, mas não sei dizer se é a melhor decisão:
    */

    for(int n:respostas){ 
        System.out.println("Digite sua resposta abaixo: ");
        n = scan.nextLine().charAt(0);
    }

    //Cáluco da nota do Aluno
   if (Arrays.equals(gabarito, respostas)) {
        nota = 10;
   } else {
    for(int i = 0; i<tam ; i++) { 
        if (respostas[i] == gabarito[i]) {
            nota++;
        }
    }
   }

   //Mostrando resultado final
   System.out.printf("Sua nota final foi: %s", nota);

    scan.close();
    }
}
