package Projeto_SistemaAluno;
import java.util.Scanner;

public class SistemaAluno {
    /*
    
    ERROS: 
    - Primeiro corrigir para que eu possa ter informações de múltiplos alunos ao mesmo tempo.
    - Após errar o Login e Senha a mesma frase se repete em 2 métodos, revisar todos os métodos para que não
    ocorra esse tipo de repetição.
    - Corrigir os casos e Switchs para que o sistema só aceite as respostas de SIM ou Não, ou que apenas aceite os números
    referentes as funcionalidades.
    - Compreender melhor os métodos e a funcionalidade do Static e demais funções dentro das classes.
    
    MELHORIAS:
    - Adicionar um banco de dados (MySQL ou já começar o desenvolvimento Web com MongoDB)
    - Adicionar uma Interface Gráfica (ou utilizar full Java ou transportar esse projeto para o Full Stack)
    - Adicionar mais funcionalidades (Mudando registro do Aluno, Consulta das notas, Atendimento online do Sistema, Quadro de Aulas etc..)
    
    PARA ESTUDO:
    - Métodos
    - Loops 
    - Classes
    - Cadastro 
    - Armazenamento 
    - Modelo Visual do projeto

    */



    //Definindo o Scanner e o objeto aluno para ser manipulado por toda a classe Sistema Aluno
    public static Scanner scan = new Scanner(System.in);
    public static Dados_do_Aluno aluno1 = new Dados_do_Aluno();
    //public static Dados_do_Aluno aluno2 = new Dados_do_Aluno();

    public static void cadastrandoAluno() {//Método que colhe as informações do Aluno para realizar cadastro.
        //Introdução e inserção dos dados
        System.out.println("-------------------------------");
        System.out.println("Certo, vamos realizar seu cadastro!");

        System.out.printf("%nPor favor informe seu nome: %n");
        String nome = scan.next();
        System.out.printf("Por favor informe sua Classe: %n");
        String ca = scan.next();
        System.out.printf("Por favor informe seu RA: %n");
        int ra = scan.nextInt();
        System.out.printf("Por favor crie uma senha: %n");
        int senha = scan.nextInt();

        //Inscrição nos dados para a Classe dos dados do Aluno.
        aluno1.cadastrandoAluno(nome, ca, ra, senha);

        //Realizando o Login após a criação do cadastro
        System.out.println("Agora vamos validar suas informações, por favor realize o Login.");
        System.out.printf("%nLogin(RA):");
        int ra2 = scan.nextInt();
        System.out.printf("%nSenha:");
        int senha2 = scan.nextInt();
        Dados_do_Aluno.getCadastroAluno(ra2, senha2);
    }

    public static void LoginAluno () {
        //Definição de variáveis
        int ra, senha;

        //Cadastro ou Login?
        System.out.println("Você possui um Cadastro?");
        System.out.println("Responda 0 para Sim ou 1 para Não.");
        int verificaCadastro = scan.nextInt();

        if(verificaCadastro == 1){
            cadastrandoAluno();
        }else { //Login do Aluno
            System.out.printf("%nLogin(RA):%n");
            ra = scan.nextInt();
            System.out.printf("Senha:");
            senha = scan.nextInt();
            Dados_do_Aluno.getCadastroAluno(ra, senha);
        }
    }

    public static void funcionalidadesSistema() {
        //Acessando as funcionalidades do sistema
        System.out.printf("%nPara usar nosso sistema basta escrever abaixo o número referente a funcionalidade que procura!");
        System.out.printf("%n 1 - realizar login em outra conta. %n 2 - Informações suas. %n 3 - sair do programa.");
        System.out.printf("%nEscreva aqui: ");
        int escolha = scan.nextInt();

        switch (escolha) {
            case 1:
            System.out.println("-------------------------------");
            System.out.println("Certo, vamos para outra conta!");
            LoginAluno();
                break;
            case 2:
            Dados_do_Aluno.InfoAluno();
                break;
            case 3:
            System.out.printf("%nAté mais %s!",Dados_do_Aluno.NOME_ALUNO);
            System.exit(0);
                break;
        }
    }

    public static void main(String[] args) {

        //Login do Aluno
        System.out.println("Seja Bem-Vindo a plataforma do Aluno digital");
        System.out.println("Para acessar o sistema realiza o login ou cadastre-se no nosso sistema.");
         
        LoginAluno();//Métotodo para realizar o login do Aluno

        funcionalidadesSistema(); //Método das funcionalidades do sistema.
    }
}