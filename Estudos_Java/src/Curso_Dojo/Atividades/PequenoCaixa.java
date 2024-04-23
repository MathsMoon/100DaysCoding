package Curso_Dojo.Atividades;
import java.util.Scanner;

/* REVER O CÓDIGO PARA PROSSEGUIR APENAS COM NÚMERO DE PRODUTOS ACEITO NO SISTEMA*/


public class PequenoCaixa {
    public static void main(String[] args) {
        //Sistema de caixa:
        int qtdProduto;
        final float valorProd = 1.99f;
        float resultado;
        Scanner scan = new Scanner(System.in);
        boolean keepBuying = false;

        //Inserção dos pedidos
        System.out.println("Digite a quantidade de produtos: ");
        qtdProduto = Integer.parseInt(scan.next());

        if(qtdProduto > 100) {
            System.out.println("Valor inválido de Compra");
            qtdProduto =  0;
        }

        //Loop para acréscimo ou continuação do sistema
        do {
            System.out.println("Deseja adicionar algo mais ao carrinho?");
            String ContinuaCompra = scan.next();

            //Teste de condição para continuar compra
            if(ContinuaCompra.equalsIgnoreCase("s")) {
                System.out.println("Digite a quantidade a mais: ");
                int acresProd = Integer.parseInt(scan.next());
                qtdProduto = acresProd + qtdProduto;
                    if(qtdProduto > 100) {
                        System.out.println("Valor inválido de Compra");
                    }
            } else {
                keepBuying = true;
            }
        } while (!keepBuying);

        //Cálculo do preço e mostrando resultados
        resultado = qtdProduto * valorProd;
        System.out.println("A quantidade total de Itens: " + qtdProduto);
        System.out.printf("%nO valor total da Compra é: %.2f", resultado);
    }
}