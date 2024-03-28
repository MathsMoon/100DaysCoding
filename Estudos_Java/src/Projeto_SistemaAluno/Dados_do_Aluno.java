package Projeto_SistemaAluno;

import java.util.Scanner;

public class Dados_do_Aluno { //Classe Dedicada ao Cadastro de Alunos ou da sua validação
    //Definindo o padrão do Cadastro Aluno para a classe de cadastro.
    static String NOME_ALUNO;
    static String CLASSE_ALUNO;
    static int RA;
    static int SENHA_ALUNO;
    static Scanner scan = new Scanner(System.in);

    public void cadastrandoAluno(String Nome, String ca, int ra, int senha) {//Criando cadastro de Aluno
       CLASSE_ALUNO = ca;
       SENHA_ALUNO = senha;
       RA = ra;
       NOME_ALUNO = Nome;
    }

    public static void getCadastroAluno(int ra, int senha) { //Método de validação das informações do cadastro Aluno.
        if (ra == RA && senha == SENHA_ALUNO) {
            System.out.println("-------------------------------");
            System.out.printf("Seja Bem-Vindo: %s!", NOME_ALUNO);
            SistemaAluno.funcionalidadesSistema();
        } else if (ra != RA || senha != SENHA_ALUNO ) {
            System.out.println("Login ou Senha Incorretos");
            System.out.println("Por favor Realize novamente seu Login ou faça um cadastro.");
            System.out.printf("Possui Login?%nResponder 0 para Sim e 1 para não:");
            int Precisacadastro = scan.nextInt();
    
            //Verificação para o Login do Aluno
            if(Precisacadastro == 1) {
                SistemaAluno.cadastrandoAluno();//Posso acessar de forma static sem precisar criar um objeto nesta classe
            } else {
                SistemaAluno.LoginAluno();
            }
        } else {
            System.out.println("Por favor fazer cadastro.");
            SistemaAluno.cadastrandoAluno();
        }
    }

    public static void InfoAluno() {
        System.out.println("-------------------------------");
        System.out.printf("Dados do Aluno: %s", NOME_ALUNO);
        System.out.printf("%nSérie.......: %s", CLASSE_ALUNO);
        System.out.printf("%nRA.......: %d%n", RA);
        /* Depois acrescento mais info
        System.out.printf("Série.......: %d", this.CLASSE_ALUNO);
        System.out.printf("Série.......: %d", this.CLASSE_ALUNO);*/

        System.out.println("Deseja ver algo mais ou sair?");
        System.out.printf("Para Responder: digite 0 para Sair ou 1 para continuar no sistema:");
        int verificaaluno = scan.nextInt();

        if (verificaaluno == 0) {
            System.out.println("-------------------------------");
            SistemaAluno.funcionalidadesSistema();
        } else {
            System.out.println("-------------------------------");
            System.out.println("Caso deseje sair basta clicar no 0.");
            InfoAluno();
        }
    }
}