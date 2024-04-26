package Curso_Dojo;
import java.util.Scanner;

public class tests {

    //Métodos podem ter o mesmo número contanto que recebem diferentes valores ou tipos de variáveis, assim não entram em conflito

    //Método chamado Recursion: ele chama a si próprio dentro da função para realizar alguma atividade, nesse caso ele serve como segundo valor de um fatorial
    public static int sum(int k) {//Função que Soma o valor de K com todos números abaixo dele até 0
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            System.out.println("Número menor que 0");
            return 0;
        }
    }

    //Halting Condition:
    public static int sum(int start, int end) {
        /*
          O código quebra devido a função do Sum, ele vai reduzindo até chegar em um ponto que o
          if(end > star) se tornaria false e executaria o else, e não é o resultado que eu queria levando em consideração
          que o código só deve mostrar esse processo caso o end seja maior que o Start, logo criando a variável
          booleana, ela troca a execução lógica mantendo nela a condição, logo independente se o end se torne menor que o Start
          ele não vai executar o else da condição.
        */

        boolean checking = end > start;

        if (checking) {
            return end + sum(start, end - 1);
        } else {
            System.out.println("Número de fim menor que o de começo");
            return end;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Inserindo valores ao Sum
        System.out.println("Digite um número:");
        int k = scan.nextInt();
        System.out.println(sum(k));


        System.out.println("-------------------------------------");


        //Inserção dos dados para começar e terminar
        System.out.println("Digite um Número para começar: ");
        int start = scan.nextInt();
        System.out.println("Digite um Número para terminar: ");
        int end = scan.nextInt();

        //Mostrando o resultado
        System.out.println(sum(start, end));
    }
}