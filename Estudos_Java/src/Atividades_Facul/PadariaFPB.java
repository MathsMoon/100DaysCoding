package Atividades_Facul;
import java.util.Scanner;

public class PadariaFPB {
    public static void main(String[] args) {
        //Criação de variáveis e Objetos
        int VendasPao = 0; 
        int VendasBroa = 0;
        Scanner scan = new Scanner(System.in);
        
        //Coleta de informações
        System.out.println("Quantos Pães foram vendidos?");
        VendasPao = scan.nextInt();
        System.out.println("Quantas Broas foram vendidas?");
        VendasBroa = scan.nextInt();

        //Cálculos
        float GanhoPao = (float) (VendasPao * 0.12);
        Float GanhoBroa = (float) (VendasBroa * 1.50);
        float ValorVenda = (GanhoPao + GanhoBroa);
        float ValorPoupa = (float) (ValorVenda * 0.10);

        //Mostrando resultados
        System.out.printf("Foram vendidos %d pães e %d broas.", VendasPao, VendasBroa);
        System.out.printf("\nO valor total arrecado foi de R$ %.2f", ValorVenda);
        System.out.printf("\nSerá guardado R$ %.2f na poupança", ValorPoupa);
        
        //Fechando o Scanner
        scan.close();
    }   
}