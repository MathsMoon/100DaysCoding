package Atividades_Facul.POO;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        //Definição de Objetos
        Scanner scan = new Scanner(System.in);
        Pessoa p = new Pessoa(); //Criando um Objeto para manipular a classe Pessoa.

        //inserção dos dados
        System.out.print("Escreva seu Nome: ");
        p.Nome = scan.nextLine(); 
        System.out.print("%nEscreva seu Sobrenome: ");
        p.Sobrenome = scan.nextLine();
        
        //Fechando a funcionalidade do Scanner
        scan.close();
    }
}
