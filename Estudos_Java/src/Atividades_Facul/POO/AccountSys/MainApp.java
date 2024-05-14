package Atividades_Facul.POO.AccountSys;

import Atividades_Facul.POO.AccountSys.BankAccount.Conta;
import Atividades_Facul.POO.AccountSys.BankAccount.ContaCorrente;
import Atividades_Facul.POO.AccountSys.BankAccount.ExtratoBancario;
import Atividades_Facul.POO.AccountSys.BankAccount.Poupanca;

import java.util.Scanner;

public class MainApp {
    private static final Scanner scan = new Scanner(System.in);
    private static final ExtratoBancario ex = new ExtratoBancario();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option = -1;

        while(option != 3){
            System.out.println("Seja Bem-Vindo ao Banco UwU");
            System.out.println("Escolha uma das opções abaixo para acesar nossos serviços: ");
            System.out.println("1-Criar Conta Poupança\n2-Criar Conta Corrente\n3-Sair do Sistema");
            option = Integer.parseInt(scan.nextLine());

            if(option > 3 || option < 1){
                System.out.println("Valor inserido inválido, por favor digite um valor válido: ");
                option = Integer.parseInt(scan.nextLine());
            }

            switch (option){
                case 1:
                    Conta account = new Poupanca();
                    CriaContaPoupanca(account);
                    break;
                case 2:
                    Conta account2 = new ContaCorrente();
                    CriaContaCorrente(account2);
                    break;
            }
        }
        System.out.println("Agradecemos por estar Conosco!");
        System.exit(0);
    }

    private static void CriaContaCorrente(Conta conta) {
        System.out.println("Digite seu nome: ");
        conta.setUserName(scan.nextLine());
        System.out.println("Digite seu Saldo: ");
        conta.setSaldo(Double.parseDouble(scan.nextLine()));

        conta.UserInfo();
    }

    private static void CriaContaPoupanca(Conta conta) {
        System.out.println("Digite seu nome: ");
        conta.setUserName(scan.nextLine());
        System.out.println("Digite seu Saldo: ");
        conta.setSaldo(Double.parseDouble(scan.nextLine()));
        String data = scan.nextLine();
        new Poupanca(data);

        conta.UserInfo();
    }
}