package Atividades_Facul;
import java.util.Scanner;

public class conversorTemp {
    public static void main(String[] args) {
        //Criação de variáveis
        float Celsius;
        float fahrenheit;
        Scanner scan = new Scanner(System.in);

        //Inserção das informações
        System.out.println("Insira a informação de temperatura em fahrenheit: ");
        fahrenheit = scan.nextFloat();
       
        //Cálculo de conversão
        Celsius = (5 * (fahrenheit - 32) /9);

        //Saída do resultado
        System.out.printf("A temperatura em Celsius é: %.2f º", Celsius);
        scan.close();
    }
}
