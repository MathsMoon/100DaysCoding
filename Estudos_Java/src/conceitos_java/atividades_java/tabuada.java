package conceitos_java.atividades_java;
import java.util.Scanner;

public class tabuada {
      public static void main(String[] args) {
        int v1 = 0;
        Scanner scan = new Scanner(System.in);

        //Introdução do valor 1:
        System.out.print("Escreva um valor: ");
        v1 = scan.nextInt();

        //Cálculo
        for(int i = 1; i<=10; i++) {
            System.out.printf(v1 + "*" + i + " = " + (v1 * i)); //A cada loop o i aumenta em 1, devido ao i++ que nós mesmos decretamos no FOR.
        }
        scan.close();
    }
}
