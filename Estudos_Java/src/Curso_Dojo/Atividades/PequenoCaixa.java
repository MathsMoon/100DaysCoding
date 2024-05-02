package Curso_Dojo.Atividades;
import java.util.Scanner;

public class PequenoCaixa {
    //Atributos da Classe Caixa:
    static Scanner scan = new Scanner(System.in);
    static  int qtdProduto;


    //Função que verifica a quantidade em estoque:
    public static void VerifyQtdProd(int qtdp) {
        while (qtdp > 100) {
            System.out.println("Quantidade inválido de produtos");
            System.out.println("Quantidade Atual: " + qtdp);
            System.out.println("Digite quantos itens vai retirar: ");
            int retirada = scan.nextInt();
            qtdp -= retirada;
        }

        if(qtdp == 0) {
            System.out.println("Você não possui itens no carrinho, deseja continuar assim (S/N)?");
            String QuerCompra = String.valueOf(scan.next().charAt(0));
            if(QuerCompra.equalsIgnoreCase("s")) {
                System.out.println("Certo então, obrigado pela visita!");
                System.exit(0);
            } else {
                Compra();
            }
        }

        qtdProduto = qtdp;
    }

    public static void Compra() {
        //Introdução a Compra
        System.out.println("Digite a quantidade de produtos: ");
        qtdProduto = Integer.parseInt(scan.next());

        //Verificando se Pode prosseguir
        VerifyQtdProd(qtdProduto);

        //Verificando se adiciona mais itens ou não
        System.out.println("Deseja Comprar algo mais? (S/N)");
        String QuerCompra = String.valueOf(scan.next().charAt(0));

        if(QuerCompra.equalsIgnoreCase("s")) {
            AddCompra();
        } else {
            FinalizacaoCompra();
        }
    }

    public static void AddCompra() {
        //Paramêtos para AddCompra
        boolean keepbuying = false;

        do {
            //Introdução a Compra
            System.out.println("Digite a quantidade adicional de produtos: ");
            int addicional = Integer.parseInt(scan.next());

            //Cálculo Adicional e verificação
            qtdProduto += addicional;
            VerifyQtdProd(qtdProduto);

            System.out.println("Deseja Comprar algo mais? (S/N)");
            String QuerCompra = String.valueOf(scan.next().charAt(0));

            if(QuerCompra.equalsIgnoreCase("n")) {
                keepbuying = true;
                FinalizacaoCompra();
            }
        }while (!keepbuying);
    }

    public static void FinalizacaoCompra() {
        //Cálculo do preço e mostrando resultados
        final float valorProd = 1.99f;
        float resultado;

        //Cálculo da Compra
        resultado = qtdProduto * valorProd;
        System.out.println("A quantidade total de Itens: " + qtdProduto);
        System.out.printf("%nO valor total da Compra é: %.2f", resultado);
    }


    public static void main(String[] args) {
        //Sistema de caixa:
        boolean keepBuying = false;

        //Introdução a Loja
        System.out.println("Bem vindo ao 1,99. Onde tudo é literalmente 1,99");
        System.out.println("Nossa única regra é comprar 100 itens no máximo");
        System.out.println("Deseja Comprar algo? (S/N)");
        String QuerCompra = String.valueOf(scan.next().charAt(0));

        if(QuerCompra.equalsIgnoreCase("s")) {
            //Comprando na Loja
            Compra();
        } else {
            System.out.println("Agradeços a Visita!");
            System.exit(0);
        }
    }
}