package Curso_Dojo.Atividades;
import java.util.Scanner;

public class JogoAdivinho {
    public static void main(String[] args) {
        //Atributos do jogo
        Scanner scan = new Scanner(System.in);
        int vidas = 3;
        boolean count = true;
        boolean count2 = true;
        int SecretNumber = (int) (Math.random() * 10); //O método Math.random sempre retorna um double

        //Jogo em si
        while (true){
            //Introdução
            System.out.println("Seja Bem-vindo ao Jogo de adivinhação, tente acertar o número");
            System.out.println("Você tem 3 vidas, boa sorte!");
            System.out.println("--------------------------");

            //Recebendo número
            System.out.println("Digite um número de 1 a 10: ");
            int UserGuessing = Integer.parseInt(scan.nextLine());

            //Loop para verificar a condição do número
            while (count) {
                if (UserGuessing > 10 || UserGuessing < 0) {
                    System.out.println("Número inválido, por favor digite um número de 0 a 10: ");
                    UserGuessing = Integer.parseInt(scan.nextLine());
                } else {
                    count = false;
                }
            }

            //Verificando Condição de jogo
            while (count2) {
                if (UserGuessing > SecretNumber) {
                    System.out.println("Quase, digite um número menor: ");
                    UserGuessing = Integer.parseInt(scan.nextLine());
                    vidas -= 1;
                } else if (UserGuessing < SecretNumber) {
                    System.out.println("Quase, digite um número maior: ");
                    UserGuessing = Integer.parseInt(scan.nextLine());
                    vidas -= 1;
                } else {
                    count2 = false;
                    System.out.println("--------------------------");
                    System.out.printf("%nParabéns o número certo era %d. Você venceu!", UserGuessing);
                    System.out.println("Deseja Jogar denovo? S/N");
                    String opc = String.valueOf(scan.next().charAt(0));
                    System.out.println("--------------------------");

                    if (opc.equalsIgnoreCase("S")) {
                        main(args);
                    } else {
                        System.out.println("--------------------------");
                        System.out.println("Agradecemos por Jogar!");
                        System.exit(0);
                    }
                }

                //Verificando condição da vida
                if(vidas == 0) {
                    System.out.println("--------------------------");
                    System.out.println("Infelizmente você não tem mais vidas.");
                    System.out.println("Deseja Jogar denovo? S/N");
                    String opc = String.valueOf(scan.next().charAt(0));

                    //Verificação para caso o jogo continue mesmo após a derrota
                    if (opc.equalsIgnoreCase("S")) {
                        main(args);
                    } else {
                        System.out.println("--------------------------");
                        System.out.println(" GAME OVER ");
                        System.out.println("Agradecemos por Jogar!");
                        System.exit(0);
                    }
                }
            }
        }
    }
}

/* Análisar depois:

import java.util.Scanner;

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
*/