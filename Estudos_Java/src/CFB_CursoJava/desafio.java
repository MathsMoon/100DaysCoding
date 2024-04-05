package CFB_CursoJava;
import java.util.Arrays;
import java.util.Scanner;

public class desafio {

    static String Nome;
    static Scanner scan = new Scanner(System.in);
    final static int TAM = 5;
    static int[] respostas = new int[TAM];
    static int[] gabarito = {2, 4, 3, 1, 5};
    
    public static void Prova() {
        System.out.printf("\nSeja bem-vindo a prova %s.\nAbaixo temos 5 perguntas, cada questão vale 2 pontos, Boa Sorte.", Nome);
        System.out.println("\n--------------------------------");

        System.out.println("A - Quanto é 2 + 2 ?\n1) 2\n2) 4\n3) 5\n4) 8\n5)10");
        respostas[0] = scan.nextInt();
        System.out.println("\n--------------------------------");
        System.out.println("B - Quanto é 2 + 2 ?\n1) 2\n2) 4\n3) 5\n4) 8\n5)10");
        respostas[1] = scan.nextInt();
        System.out.println("\n--------------------------------");
        System.out.println("C - Quanto é 2 + 2 ?\n1) 2\n2) 4\n3) 5\n4) 8\n5)10");
        respostas[2] = scan.nextInt();
        System.out.println("\n--------------------------------");
        System.out.println("D - Quanto é 2 + 2 ?\n1) 2\n2) 4\n3) 5\n4) 8\n5)10");
        respostas[3] = scan.nextInt();
        System.out.println("\n--------------------------------");
        System.out.println("E - Quanto é 2 + 2 ?\n1) 2\n2) 4\n3) 5\n4) 8\n5)10");
        respostas[4] = scan.nextInt();
        System.out.println("\n--------------------------------");

        Correcao(respostas);
    }


    public static void Correcao(int[] a) {
        int[] b = a;
        int nota = 0;

        for (int i = 0; i<TAM; i++) {
            if(b[i] == respostas[i]){
            nota++;
            }
        }

        System.out.println(nota);
        System.exit(0);

        switch (nota) {
            case 0, 1, 2:
                System.out.printf("%s você tirou menos que 6, você foi reprovado", Nome);
            break;

            case 3:
                System.out.printf("%s você tirou 6, você está de recuperação.", Nome);
            break;

            default:
                System.out.printf("Parabéns %s você passou.", Nome);
            break;
        }
    }

    public static void main(String[] args) {
        //Inserção do Nome
        System.out.print("Digite seu Nome:");
        Nome = scan.nextInt();

        //Começo da prova
        Prova();
    }
}
