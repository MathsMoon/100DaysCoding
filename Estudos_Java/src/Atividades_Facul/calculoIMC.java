package Atividades_Facul;
import java.util.Scanner;

public class calculoIMC {
    public static void main(String[] args) {
    //Criação de variáveis e Objeto
    float altura, peso, imc;
    Scanner scan = new Scanner(System.in);

    //Inserção dos dados
    System.out.print("Informe sua Altura:");
    altura = scan.nextFloat();
    System.out.print("Informe sua Peso:");
    peso = scan.nextFloat();
    
    //Cálculo IMC
    imc = peso / (float) Math.pow(altura, 2); //Usa o Math.pow para potênciação e o converte para uma variável float.
    
    System.out.printf("Seu IMC é de: %.2f", imc);
    scan.close();
    }
}
