package Atividades_Facul;
import java.util.Scanner;

public class Prestacoes {
    public static void main(String[] args) {
        //Criação de variáveis e Objetos
        float x = 0;
        float result;
        Scanner scan = new Scanner(System.in);


        //Inserção dos dados
        System.out.println("Cálculo de prestaçãop, coloque abaixo o valor");
        System.out.println("Insira aqui o valor: ");
        x = scan.nextFloat();

        //Cálculo
        result = x/5;

        //Mostrando o resultado.
        scan.close();
        System.out.printf("Do valor de R$%.2f, você pagará R$%.2f por prestação.",x,result);
        //o %.2f é uma maneira mais breve de dizer que eu só quero 2 decimais para o print mostrar. 
    }
}
