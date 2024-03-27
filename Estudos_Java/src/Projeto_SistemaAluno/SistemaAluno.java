package Projeto_SistemaAluno;
import java.util.Scanner;

public class SistemaAluno {
    /*

    O objetivo principal será criar várias pequenas classes com funcionalidades específicas para futuramente agrupa-las atráves 
    de um sistema central do Aluno. 
    Uma interface que o Aluno acessará para consultar notas, provas anteriores, trabalhos, aulas e cronogramas da escola.
    Dentre entre outras funcionalidades que podem ser adicionadas. 
    Este projeto será grande para utilizar todo conhecimento que fui adquiriando durante o progresso em aprender o java,
    será o primeiro grande projeto que estampará meu GitHub e será meu marco esse primeiro semestre. 
    
    */



    //Definição do Scanner utilizado na Classe do Sistema e do objeto a ser manipulado
    public static Scanner scan = new Scanner(System.in);
    public static Dados_do_Aluno aluno1 = new Dados_do_Aluno();

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
        aluno1.getCadastroAluno(ra2, senha2);
    }


    public static void main(String[] args) {
        //Definição de variáveis
        int ra, senha;
    
        //Login do Aluno
        System.out.println("Seja Bem-Vindo a plataforma do Aluno digital");
        System.out.println("Para acessar o sistema realiza o login ou cadastre-se no nosso sistema.");

        System.out.printf("Possui Login?%nResponder 0 para Sim e 1 para não:");
        int Precisacadastro = scan.nextInt();

        //Verificação de resposta para o Cadastro
        if (Precisacadastro == 1) {
            cadastrandoAluno();
        }else {
            System.out.print("%nLogin(RA):");
            ra = scan.nextInt();
            System.out.printf("%nSenha:");
            senha = scan.nextInt();
            aluno1.getCadastroAluno(ra, senha);
        }

        //Acessando as funcionalidades do sistema
        System.out.printf("%nPara usar nosso sistema basta escrever abaixo o número referente a funcionalidade que procura!");
        System.out.printf("%n 1 - Notas. %n 2 - Informações suas. %n 3 - sair do programa.");
        System.out.printf("%nEscreva aqui: ");
        int escolha = scan.nextInt();

        switch (escolha) {
            case 1:
            System.out.println("sei lá");
                break;
            case 2:
            aluno1.InfoAluno();
                break;
            case 3:
            System.out.printf("%nAté mais %s!",aluno1.NOME_ALUNO);
            System.exit(0);
                break;
        }
    }
}