package Atividades_Facul.Encapsulamento_Java;

import java.util.Scanner;

public class MainPessoa {
    public static void main(String[] args) {
        //Criando um Objeto da classe pessoa
        Pessoa p1 = new Pessoa();
        Scanner scan = new Scanner(System.in);
        //Inserindo valores a classe pessoa
        System.out.println("Insira seu nome");
        p1.setNome(scan.nextLine());
        System.out.println("Insira sua idade");
        p1.setIdade(Integer.parseInt((scan.nextLine())));
        System.out.println("Crie uma Senha");
        p1.setSenha(scan.nextLine());

        //Mostrando as informações da Pessoa
        p1.info();
    }
}
