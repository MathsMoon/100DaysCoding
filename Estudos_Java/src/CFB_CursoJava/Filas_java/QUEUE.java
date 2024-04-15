package CFB_CursoJava.Filas_java;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QUEUE {
    public static void main(String[] args) {
        /* A fila funciona como: Primeiro a entrar é também ao sair  */ 
        
        //Criando a Fila (para a fila é necessário também o LinkedList)
        Queue<String> cars_q = new LinkedList<>();
        int TamFila = 5;
        Scanner scan = new Scanner(System.in);

        //Inserindo informações na Fila
        for(int i = 1; i<=TamFila; i++) {
            System.out.println("------------------");
            System.out.printf("%nEscreva o %d carro da fila: ", i);
            cars_q.add(scan.nextLine());
        }

        /* Comandos para a Queue  */
        // cars_q.poll(); mesma coisa do Pop do Stack
        //cars_q.peek(); Pega o primeiro valor da fila.

        //Realizando a leitura da lista:
        System.out.println("------------------");
        System.out.println(cars_q);

        // for(String qeue:cars_q) {
        //     System.out.println(qeue);
        // }
        
        scan.close();

    }
}