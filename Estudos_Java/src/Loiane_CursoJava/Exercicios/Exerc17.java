package Loiane_CursoJava.Exercicios;
import java.util.Scanner;

public class Exerc17 {
    public static void main(String[] args) {
          //29. Consulta de preço fixo
        Scanner scan = new Scanner(System.in);
//
//        //Inserindo valores padrão:
//        float[] valores = new float[50];
//        valores[0] = 1.99f;
//
//        System.out.println("Digite a quantidade de produtos: ");
//        int qtdProduto = Integer.parseInt(scan.nextLine());
//
//        for(int i = 1; i<50; i++) {
//            valores[i] = valores[0] * i;
//
//            if(qtdProduto == i){
//                System.out.printf("%nO valor a ser pago é de R$ %.2f reais", valores[i]);
//            } else if (qtdProduto > 50) {
//                System.out.println("Valor fora da tabela");
//                System.exit(0);
//            }
//        }
//        scan.close();

        //32. Calculando fatorial:
        System.out.println("Digite o Número para fatorial:");
        int n = scan.nextInt();

        //criando o atributo que guardará o fatorial
        long result = 1;

        if(n > 63) {
            System.out.println("Número maior que o permitido (63), por favor escolha outro: ");
            n = scan.nextInt();
            if(n > 63) {
                System.out.println("Novamente número maior que o permitido, seguiremos com 62");
                n = 62;
            }
        }

        //Loop que vai fatorando os elementos do Array
        for (int i = n; i > 0; i--) {
            result *= i;
            System.out.printf("%nFatorial de %d * %d = %d", n, i, result);
        }
        System.out.printf("%nO fatorial Total de %d é %d", n, result);
    }
}