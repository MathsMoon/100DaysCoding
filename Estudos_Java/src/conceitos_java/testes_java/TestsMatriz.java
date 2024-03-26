package conceitos_java.testes_java;
import java.security.SecureRandom;
import java.util.Scanner;

public class TestsMatriz {
    public static void main(String[] args) {
    //Pensei em criar um joguinho básico com números aleatórios, uma versão pobre de um Jokenpo.

        //Criação de variáveis:
        String Player1, Player2;
        int winsp1 = 0, winsp2 = 0;
        int[] p1jogadas = new int[3];
        int[] p2jogadas = new int[3];
        Scanner scan = new Scanner(System.in);
    

        //ínicio da estrutura:
        System.out.println("Seja bem-vindo declare a baixo os nomes dos Players.");
        System.out.println("Nome do Player 1: ");
        Player1 = scan.nextLine();
        System.out.println("Nome do Player 2: ");
        Player2 = scan.nextLine();

        //Explicação do Jogo:
        System.out.println("Será uma melhor de 3, o jogador que conseguir ganhar 2 jogos é o campeão da rodada.");
        
        //Gerando o número aleatório de 1 a 3
        for(int l = 0; l<3; l++) {
            p1jogadas[l] = new SecureRandom().nextInt(3);
            p2jogadas[l] = new SecureRandom().nextInt(3);

            /*System.out.printf("%2d", p1jogadas[l]);
            System.out.printf("%2d", p2jogadas[l]);
            System.out.printf("%n");*/

        }

        //Estrutura de comparação entre os Arrays

        /* 
         
        Preciso Rever a parte a seguir do código, a intenção é fazer o seguinte:
        O jogo vai ser disputado em uma md3 em que o maior número ganha, o jogo só acaba depois que o player 1 ou 2 
        obtiver 2 vítorias no total, assim saindo o resultado que seria a vitória da md3 do P1 ou P2.

        
        for(int l = 0; l<3; l++) {
            while (winsp1 !=2 || winsp2 !=2) {
                if(p1jogadas[l] < p2jogadas[l]) {
                    System.out.printf("|%d", p1jogadas[l]);
                    System.out.printf("|%d|", p2jogadas[l]);
                    System.out.printf(" Vitória do %s", Player2);
                    winsp2++;
                } else if (p1jogadas[l] > p2jogadas[l]) {
                    System.out.printf("|%d", p1jogadas[l]);
                    System.out.printf("|%d|", p2jogadas[l]);
                    System.out.printf(" Vitória do %s", Player1);
                    winsp1++;
                } else {
                    System.out.printf("|%d", p1jogadas[l]);
                    System.out.printf("|%d|", p2jogadas[l]);
                    System.out.printf("Empate");
                }
                System.out.printf("%n");
            }
        }
        */

        
    }
}