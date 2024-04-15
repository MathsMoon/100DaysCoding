package CFB_CursoJava.Filas_java;
import java.util.Scanner;
import java.util.Stack;

public class STACKs {
    public static void main(String[] args) {
        /* Stack funciona em pilha, ou seja: Primeiro a entrar é o último a sair */


        //Criando uma Pilha e definindo parâmetros
        Stack<String> car = new Stack<>();
        int TamPilha = 10;
        Scanner scan = new Scanner(System.in);

        //Inserindo dados a Fila
        for(int i = 1; i<=TamPilha ; i++) {
            System.out.println("-----------------");
            System.out.printf("%nDigite o nome do carro da posição %d: ", i);
            car.push(scan.nextLine());
        }


        /* Funções da STACK */
        // car.peek(); Retorna o elemento do topo da Pilha
        //car.pop(); Retorna o elemento do topo da pilha e o retira da pilha
        //car.empty(); Retorna um valor booleano para saber se a Pilha está vazia
        //car.clear(); Limpa a pilha inteira.

        //Realizando a leitura da Fila        
        System.out.println(car); //Sequência

        for(String fila:car) { //mostra em colunas
            System.out.println("-----------------");
            System.out.println(fila);
        }

        //fechando objeto Scanner
        scan.close();
    }
}
