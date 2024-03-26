package conceitos_java;
import java.util.Scanner;

public class metodos {
    /*
      
     A aula de métodos foi uma revisão em maior parte, o conceito novo do (int... variavel)
     é muito interessante, como também a possibilidade de repetição do resultado do método
     colocando como um argumento dentro do parenteses. exemplo: Linha 38

     
     */
    public static int Soma2 (int... numeros) {
    //Métodos para Soma de n valores.
        int res = 0;

        for(int n:numeros) {
            res += n;
        }
        return res;
    }

    public static void main(String[] args) {
        //Criação de variáveis
        int a = 0, b = 0, c = 0;
        Scanner scan = new Scanner(System.in);


        System.out.println("Insira um número");
        a = scan.nextInt();
        System.out.println("Insira um número");
        b = scan.nextInt();
        System.out.println("Insira um número");
        c = scan.nextInt();

        System.out.println(Soma2(a, b, c));  //Colocando o número após o paranteses posso denotar quantas vezes vai repetir o método.
        scan.close();
    }
}
