package Curso_Dojo.Atividades;
import java.util.Scanner;

public class ParcelasCarro_Continue {

    public static void main(String[] args) {
        //Definindo Objeto Scanner
        Scanner scan = new Scanner(System.in);

        //Inserção do valor Bruto:
        System.out.println("Insira o valor do Carro: ");
        float ValorTotal = scan.nextFloat();

        //Descobrindo a quantidade de vezes capazes de parcelar: Começando do valor inserido
        for (int parcela = (int) ValorTotal; parcela >= 1; parcela--) {
            double valor_parcela = ValorTotal / parcela;
            if(valor_parcela < 1000) {
                continue;
                //O continue nesse caso mantém o funcionamento do For e só permite o caso posterior do If a menos de 1000
                //desta forma o continue serve para dar prosseguimento a uma operação e satisfazendo a condição permitir
                // o avanço do código.
            }
            System.out.println("Parcela " + parcela + " R$ " + valor_parcela);
        }
        //Fechando o Objeto Scan
        scan.close();
    }
}