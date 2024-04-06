package CFB_CursoJava;
import java.util.Arrays;
import java.util.Scanner;

public class desafio {

    //Definindo atributos para a prova
    static String Nome; //Nome Aluno
    static Scanner scan = new Scanner(System.in); //Objeto de Scanner
    final static int TAM = 5; //Quantidade de questões na prova
    static int[] respostas = new int[TAM];  //Respostas das questões
    static int[] gabarito = {1, 3, 1, 2, 4}; //Gabarito da prova
    
    public static void Prova() { //Método para a prova em si
        //Introdução:
        System.out.printf("\nSeja bem-vindo a prova %s.\nAbaixo temos 5 perguntas, cada questão vale 2 pontos, Boa Sorte.", Nome);

        //Criando as Perguntas e Alternativas
        String[] perguntas = {
            "Qual a Maior estrela do Sistema Solar?",
            "Qual a Primeira Letra do Nosso Alfabeto?",
            "Qual é a linguagem usada para criar este Programa?",
            "No combate quem ganharia? Dante Will (Modo Aranha) ou Toshi modo demônio?",
            "Qual melhor Cantor da Atualidade?"
        };
        
        String[] alternativas = {
            "1)Sol   |   2) Lua   |   3) Marte",
            "1)C   | 2)   L   |   3) A",
            "1)Java   | 2)   Lua   | 3)   C++",
            "1)Chat no Prime   |   2) Loud Tetracampeã CBLOL",
            "1) MC VV\n2) Yun Li\n3) O de óculos do JogandoFoddaci\n4) Todas acima"
        };


        //Realizando um Loop para as Perguntas
        for(int i = 0; i<TAM; i++) {
            System.out.println("\n--------------------------------");
            System.out.printf("Pergunta %d%n", i+1);
            System.out.printf("%s%n", perguntas[i]);
            System.out.printf("%s%n", alternativas[i]);
            respostas[i] = scan.nextInt();
        }

       //Correção da prova 
        Correcao();
    }


    public static void Correcao() {//Método de correção com peso 2
        int acertos = 0;

        if(Arrays.equals(respostas, gabarito)) {//Se a resposta é igual ao gabarito, acertou tudo
            acertos = 5;
        } else {
            for(int i = 0; i<TAM; i++) {//Se não, passe por cada membro da Array dos dois e compare 1 por 1.
                if (respostas[i] == gabarito[i]) {
                    acertos++;
                }
            }
        }
        
        //Criando a varíavel que recebe resultado com o peso devido
        int total = acertos * 2;

        if (total > 6) {
            System.out.printf("Parabéns %s sua nota foi: %d, você passou.", Nome, total );
        } else if(total == 6 ) {
            System.out.printf("%s sua nota foi: %d, você está de recuperação.", Nome, total);
        } else {
            System.out.printf("%s sua nota foi de: %d, você foi reprovado", Nome, total);
        }
    }

    public static void main(String[] args) {
        //Inserção do Nome
        System.out.print("Digite seu Nome: ");
        Nome = scan.nextLine();

        //Começo da prova
        Prova();
    }
}
