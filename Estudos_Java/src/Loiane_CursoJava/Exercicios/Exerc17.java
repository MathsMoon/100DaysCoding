package Loiane_CursoJava.Exercicios;
import java.util.Scanner;

public class Exerc17 {
    public static void main(String[] args) {
        //4. Cálculo populacional
        Scanner scan = new Scanner(System.in);
        String CityAName = "";
        String CityBName = "";
        float cA, cB;
        int cityApop;
        int cityBpop;
        float anos = 0;


        //Inserção dos valores:
        System.out.println("Insira abaixo os valores pedidos");
        System.out.println("Nome da cidade A(Maior População): ");
        CityAName = scan.nextLine(); 
        System.out.println("Nome da cidade B(Menor População): ");
        CityBName = scan.nextLine(); 
        System.out.println("Insira o valor da população da cidade A: ");
        cityApop = Integer.parseInt(scan.nextLine());
        System.out.println("Insira o valor da população da cidade B: ");
        cityBpop = Integer.parseInt(scan.nextLine());
        System.out.println("Insira o valor da taxa de aumento da população da cidade A: ");
        cA = Float.parseFloat(scan.nextLine());
        System.out.println("Insira o valor da taxa de aumento da população da cidade B: ");
        cB = Float.parseFloat(scan.nextLine());

        //OBS: O USO DO (TIPO).parse(tipo) soluciona o problema de pular a linha que o nextInt ou nextFloat possuia na leitura de várias strings


        //Loop para o cálculo
        while(cityApop > cityBpop) { //Rever cálculo de crescimento pela taxa:
            cityApop = (int) ((int) cityApop + (cityApop * cA/100));
            cityBpop = (int) ((int) cityBpop + (cityBpop * cB/100));
            anos += 1;
        }

        //Mostrando o resultado
        System.out.printf("São necessários %d anos para a cidade %s superar a cidade %s", anos, CityAName, CityBName);
        scan.close();
    }
}