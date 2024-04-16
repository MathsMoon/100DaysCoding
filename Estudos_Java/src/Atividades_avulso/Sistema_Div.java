package Atividades_avulso;
import java.util.Scanner;

public class Sistema_Div {

    //Definindo padrão para a Classe de cadastro
    private static Scanner scan = new Scanner(System.in);
    private static String NomeUsuario = "";
    private static String SenhaUsuario = "";

    static void CadUsuario() {
        //Inserindo as informações de cadastro
        System.out.println("-------------------------");
        System.out.printf("%nDigite seu nome: ");
        setNomeUsuario(scan.nextLine());
        System.out.printf("%nDigite uma senha: ");
        setSenhaUsuario(scan.nextLine());        

        //Confirmação dos dados inseridos
        System.out.println("Tem certeza do nome de Usuário ou senha?");
        System.out.printf("%nS/Y: ");
        String opt = scan.nextLine().toUpperCase();

        if(opt.equals("Y")) {
            System.out.println("-------------------------");
            Login();
        } else {
            System.out.println("-------------------------");
            AlteraCad();
        }
    }

    static void AlteraCad() {
        System.out.println("O que deseja alterar?");
        System.out.printf("%n1 - Usuário%n2 - Senha");
        int option3 = scan.nextInt();

        if(option3 == 1) {
            System.out.println("-------------------------");
            System.out.println("Escreva seu novo nome de Usuário: ");
            setNomeUsuario(scan.nextLine());
        } else {
            System.out.println("-------------------------");
            System.out.println("Escreva seu novo nome de Usuário: ");
            setSenhaUsuario(scan.nextLine());
        }

        System.out.println("Deseja refazer o processo?");
        System.out.printf("%nS/Y: ");
        String opt = scan.nextLine().toUpperCase();

        if(opt.equals("Y")) {
            AlteraCad();
        } else {
            System.out.println("-------------------------");
            Login();
        }
    }

    static void setNomeUsuario(String nome) {
        NomeUsuario = nome;
    }

    static void setSenhaUsuario(String senha) {
        SenhaUsuario = senha;
    }

    static String getNomeUsuario() {
        return NomeUsuario;
    }

    static String getSenhaUsuario() {
        return SenhaUsuario;
    }

    static void Login() {
        //Contador que possibilita o Loop da estrutura
        // int counterror = 0;

        /* Realizar um Loop para cada erro do usuário ao escrever Senha ou Nome e após 3 erros recomendar realizar um novo cadastro */

        //Acesando as informações do usuário
        System.out.printf("%nDigite seu nome: ");
        String Usuario = scan.nextLine();
        System.out.printf("%nDigite uma senha: ");
        String Senha = scan.nextLine();
        
        //Confirmando informações do usuário

        if(Usuario.equals(getNomeUsuario()) && Senha.equals(getSenhaUsuario())) {
            div();
        } else {
            System.out.println("-------------------------");
            System.out.println("Usuário ou Senha Incorreto!");
            Login();
        }
    }

    private static void div() {
        int[] nums = new int[2];
        int div;
        for(int i = 0; i<2; i++) {
            System.out.printf("%nInsira %d número: ", i+1);
            nums[i] = scan.nextInt();
        }

        div = nums[0] / nums[1];

        System.out.printf("O resultado da divisão entre %d e %d é: %d", nums[0],nums[1], div);
    } 

    public static void main(String[] args) {
        //Entrada do Sistema:
        System.out.println("Seja Bem-vindo ao sistema, por favor escolha uma forma de Login:");
        System.out.printf("%n1 - Login %n2 - Criar novo cadastro%n");
        int option = scan.nextInt(); //Variável de opção

        //Criando as condições para o sistema
        if(option == 1) {
            Login();
        } else {
            CadUsuario();
        }
    }
}