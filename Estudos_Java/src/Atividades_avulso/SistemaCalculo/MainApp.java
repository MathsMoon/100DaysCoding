package Atividades_avulso.SistemaCalculo;

import java.util.Scanner;

public class MainApp {

    static DadosUsuario DU = new DadosUsuario();
    static Scanner scan = new Scanner(System.in);

    public static void Login() {
        boolean verify = false;
        do {
            System.out.println("Insira seu Login: ");
            String nome = scan.nextLine();
            System.out.println("Insira Sua Senha: ");
            int senha = Integer.parseInt(scan.nextLine());

            verify = DU.Login(nome, senha);
        } while (!verify);

        Calculo();
    }

    public static void Calculo() {
        System.out.println("-----------------------------------");
        System.out.println("Digite o primeiro número: ");
        double n1 = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        double n2 = scan.nextDouble();

        double result = n1/n2;
        System.out.println("-----------------------------------");
        System.out.println("Resultado da divisão de: " + n1 + " / " + n2 + " é: " + result);
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        Login();
    }
}