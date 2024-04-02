package Atividades_Facul.POO_atividade;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        //Definindo os objetos
        Pessoa p1Pessoa = new Pessoa();
        Scanner scan = new Scanner(System.in);

        //Introdução ao sistema:
        System.out.println("Digite seu nome: ");
        p1Pessoa.setNome(scan.nextLine());
        System.out.println("Digite seu sobrenome: ");
        p1Pessoa.setSobrenome(scan.nextLine());
        System.out.println("Digite seu ano de nascimento: ");
        p1Pessoa.setAno_nasc(scan.nextInt());

        //Utilizando os métodos da classe Pessoa:
        p1Pessoa.info();
        scan.close();
    }   
}
