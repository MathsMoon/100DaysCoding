package Loiane_CursoJava.Exercicios;
import java.util.Scanner;

public class Exerc17 {
    public static void main(String[] args) {
        //29. Consulta de preço fixo
        Scanner scan = new Scanner(System.in);

        //Inserindo valores padrão:
        float[] valores = new float[50];
        valores[0] = 1.99f;

        System.out.println("Digite a quantidade de produtos: ");
        int qtdProduto = Integer.parseInt(scan.nextLine());

        for(int i = 1; i<50; i++) {
            valores[i] = valores[0] * i;

            if(qtdProduto == i){
                System.out.printf("%nO valor a ser pago é de R$ %.2f reais", valores[i]);
            } else if (qtdProduto > 50) {
                System.out.println("Valor fora da tabela");
                System.exit(0);
            }
        }
        scan.close();
    }
}