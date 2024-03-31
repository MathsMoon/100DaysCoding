package Atividades_avulso;
import java.util.Scanner;

public class formasgeo {
    
    public static void Hexagon(float a) {//Área do Hexágono
        double b = Math.pow(a, 2);
        double res = (6 * b)/(4 * Math.tan(Math.PI/6));
        System.out.println("\n----------------------------------");
        System.out.printf("A área do Hexágono é de: %.2f", res);
    }

    public static void Rectangle(float a, float b) {//Área e perímetro do retângulo
        float area = a * b;
        float pter = 2 * (a + b);
        System.out.println("\n----------------------------------");
        System.out.printf("O perímetro do Retângulo é de: %.2f", pter);
        System.out.printf("\nA Área do Retângulo é de: %.2f", area);
        System.out.println("\n----------------------------------");
    }

    public static void Circle (float radius) {//Área e perímetro do Círculo
        double area = Math.PI * Math.pow(radius, 2);
        double pter = 2 * Math.PI *radius;
        System.out.println("----------------------------------");
        System.out.printf("O perímetro do círculo é de: %.2f", pter);
        System.out.printf("\nA área do círculo é de: %.2f", area);
    }

    public static void main(String[] args) {
        //Definindo o Scanner
        Scanner scan = new Scanner(System.in);

        //Introdução do sistema
        System.out.println("Preguiça de fazer várias perguntas, só escreve valores para um:\n1 - Hexágono. \n2 - Retângulo \n3 - Círculo");
        System.out.println("Héxagono: ");
        float valorHexa = scan.nextFloat();
        System.out.println("Círculo: ");
        float valorCir = scan.nextFloat();
        System.out.println("Retângulo Largura: ");
        float valorLR = scan.nextFloat();
        System.out.println("Retângulo Comprimento: ");
        float valorCR = scan.nextFloat();

        //Métodos
        Circle(valorCir);
        Hexagon(valorHexa);
        Rectangle(valorLR, valorCR);

        scan.close();
    }
}
