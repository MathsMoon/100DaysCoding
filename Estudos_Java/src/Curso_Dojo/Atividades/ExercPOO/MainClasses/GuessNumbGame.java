package Curso_Dojo.Atividades.ExercPOO.MainClasses;
import Curso_Dojo.Atividades.ExercPOO.Domain.Players;
import java.util.Scanner;

public class GuessNumbGame {

    /*
        Se possível realizar um método que crie quantos players o usuário quiser para cada um poder jogar.
     */

    //Class atributtes
    static Players player1 = new Players();
    static Players player2 = new Players();
    static Scanner scan = new Scanner(System.in);

    public static void Game() {
        boolean GameOver = true;

        while (!GameOver) {

        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to guess number game, to play write down the numbers of players and their names.");

    }
}
