package Curso_Dojo.Atividades;
import java.util.Scanner;

public class ParcelasCarro {

    public static void main(String[] args) {
        //Definindo Objeto Scanner
        Scanner scan = new Scanner(System.in);

        //Inserção do valor Bruto:
        System.out.println("Insira o valor do Carro: ");
        float ValorTotal = scan.nextFloat();

        //Descobrindo a quantidade de vezes capazes de parcelar:
        for (int parcela = 1; parcela < ValorTotal; parcela++) {
            float valorparcela = ValorTotal/parcela;
            if(valorparcela < 1000) {
                break; //quebrando a sequência Loop
            }
        }
        //Fechando o Objeto Scan
        scan.close();
    }
}