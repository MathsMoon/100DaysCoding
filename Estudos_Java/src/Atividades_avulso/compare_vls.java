package Atividades_avulso;
import java.util.Scanner;

public class compare_vls {
    public static void main(String[] args) {
        //Definição de variáveis e Objetos
        Scanner scan = new Scanner(System.in);
        float v1, v2;

        //Inserção dos dados:
        System.out.println("Vamos comparar dois números, escreva abaixo os valores.");

        System.out.printf("Primeiro valor: %n");
        v1 = scan.nextFloat();
        System.out.printf("Segundo valor: %n");
        v2 = scan.nextFloat();


        //Método de comparação
        if (v1 == v2) {
            System.out.println("São valores idênticos.");            
        } else if (v1 > v2) {
            System.out.printf("São números diferentes, na qual v1: %.2f é maior que v2:%.2f", v1, v2);
        } else {
            System.out.printf("São números diferentes, na qual v2:%.2f é maior que v1:%.2f", v2, v1);
        }
        
        /*O método abaixo ensina como verificar classes utilizando a função
        do getClass(); que retorna a classe que provém o objeto analisado.
        
        Class <?> veriftypevar = scan.getClass();
        System.out.println(veriftypevar); R: 
        */

        scan.close();

    }
}
