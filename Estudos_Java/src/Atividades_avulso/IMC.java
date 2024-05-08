package Atividades_avulso;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        //Definindo atributos para trabalhar:
        int peso;
        double altura;
        Scanner scan = new Scanner(System.in);

        //Inserindo dados do peso
        System.out.println("Qual é seu peso atual?");
        peso = scan.nextInt();
        System.out.println("Qual sua altura?");
        altura = scan.nextDouble();

        //Cálculo IMC:
        double imc = (double) peso / Math.pow(altura, 2);

        if(imc >= 35) {
            System.out.printf("Seu imc foi de: %.2f - Obesidade mórbida", imc);
        } else if(imc >=30) {
            System.out.printf("Seu imc foi de: %.2f - Obesidade", imc);
        } else if(imc >= 25) {
            System.out.printf("Seu imc foi de: %.2f - Sobrepeso", imc);
        } else if(imc >= 18.5) {
            System.out.printf("Seu imc foi de: %.2f - Normal", imc);
        } else {
            System.out.printf("Seu imc foi de: %.2f - Magro", imc);
        }

        //Fechando Objeto Scanner
        scan.close();
    }   
}