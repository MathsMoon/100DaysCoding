package Curso_Dojo.Atividades;
import java.util.Scanner;

/* Versão melhorada do meu código antigo, depois fazer uma análise do que melhorou da minha versão pra essa*/

public class JogoAdivinho {

    private static final int NUM_LIVES = 3;
    private static final int MIN_GUESS = 1;
    private static final int MAX_GUESS = 10;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Generate a random number between 1 and 10
        int secretNumber = (int) (Math.random() * (MAX_GUESS - MIN_GUESS + 1)) + MIN_GUESS;

        // Initialize game state
        int lives = NUM_LIVES;
        boolean gameOver = false;

        // Game loop
        while (!gameOver) {
            // Get user input
            System.out.println("Digite um número de " + MIN_GUESS + " a " + MAX_GUESS + ": ");
            int guess = Integer.parseInt(scan.nextLine());

            // Validate input
            if (guess < MIN_GUESS || guess > MAX_GUESS) {
                System.out.println("Número inválido. Digite um número entre " + MIN_GUESS + " e " + MAX_GUESS);
                continue;
            }

            // Check guess
            if (guess == secretNumber) {
                System.out.println("Parabéns! Você acertou o número.");
                gameOver = true;
            } else if (guess > secretNumber) {
                System.out.println("Seu chute é muito alto. Tente um número menor.");
                lives--;
            } else {
                System.out.println("Seu chute é muito baixo. Tente um número maior.");
                lives--;
            }

            // Check if game is over
            if (lives == 0) {
                System.out.println("Você perdeu! O número secreto era " + secretNumber);
                gameOver = true;
            }
        }

        // Ask to play again
        System.out.println("Deseja jogar novamente? (S/N)");
        String answer = scan.nextLine();
        if (answer.equalsIgnoreCase("S")) {
            main(args);
        } else {
            System.out.println("Obrigado por jogar!");
        }
    }
}