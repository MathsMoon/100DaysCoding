package Curso_Dojo.Atividades.ExercPOO.MainClasses;

import Curso_Dojo.Atividades.ExercPOO.Domain.Players;
import java.util.Random;
import java.util.Scanner;

public class GuessNumbGame {

    /*
        Se possível realizar um método que crie quantos players o usuário quiser para cada um poder jogar.
    */

    //Class atributtes
    static boolean GameOver = false;
    static Players player1 = new Players();
    static Players player2 = new Players();
    static Random randomNumb = new Random();
    static int SecretNumber = randomNumb.nextInt(1,21);
    static Scanner scan = new Scanner(System.in);


    public static void Jogadores() {
        System.out.println("----------------------------");
        System.out.println("Digite o Nome do Player 1: ");
        player1.setName(scan.nextLine());
        System.out.println("----------------------------");
        System.out.println("Digite o Nome do Player 2: ");
        player2.setName(scan.nextLine());

        //Inciando o Jogo:
        Game();
    }

    public static void Player1WinCondition(int p1Num) {
        if(p1Num == SecretNumber) {
            System.out.println("----------------------------");
            System.out.printf("%n%s Ganhou!", player1.getName());
        } else {
            System.out.println("----------------------------");
            System.out.printf("%n%s está próximo de acertar!", player1.getName());
            player1.Lifes -= 1;
        }
    }

    public static void Player2WinCondition(int p2Num) {
        if(p2Num == SecretNumber) {
            System.out.println("\n----------------------------\n");
            System.out.printf("%s Ganhou!", player2.getName());
        } else {
            System.out.println("\n----------------------------\n");
            System.out.printf("%s está próximo de acertar!", player2.getName());
            player2.Lifes -= 1;
        }
    }

    private static void PlayersLifeVerify() {
        if(player1.getLifes() == 0 || player2.getLifes() == 0) {


            if(player1)

            System.out.printf("%n%s perdeu sua última vida o player %s Ganhou!", player1.getName(), player2.getName());
            System.out.printf("%n%s perdeu sua última vida o player %s Ganhou!", player2.getName(), player1.getName());

            System.exit(0);
        }
    }

    /* Fazer um último jogo em que o menor número próximo ao secreto ganhe */

    public static void PlayersLastChance() {
        System.out.println("Está é sua última Chance, o lance mais próximo do Número Secreto vence");

        System.out.println("\nLance do Player1, vidas: " + player1.getLifes());
        int p1Num = scan.nextInt();
        System.out.println("Lance do Player2, vidas: " + player2.getLifes());
        int p2Num = scan.nextInt();
    }


    public static void Game() {
        while (!GameOver) {
            System.out.println("\nLance do Player1, vidas: " + player1.getLifes());
            int p1Num = scan.nextInt();
            System.out.println("Lance do Player2, vidas: " + player2.getLifes());
            int p2Num = scan.nextInt();

            //Mostrando resultado:
            Player1WinCondition(p1Num);
            Player2WinCondition(p2Num);
            PlayersLifeVerify();
        }
    }

    public static void main(String[] args) {
        //Introdução ao Jogo:
        System.out.println("Bem vindo ao jogo de Adivinhação de 1 a 20, as Regras são simples:");
        System.out.println("1 - Você tem apenas 3 vidas");
        System.out.println("2 - Cada Jogador só tem 1 oportunidade por rodada");
        System.out.println("3 - Para Ganhar ou acerte o número ou termine com o último lance mais próximo");

        //Cadastrando player
        Jogadores();
    }
}