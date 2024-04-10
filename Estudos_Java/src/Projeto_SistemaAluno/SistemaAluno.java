package Projeto_SistemaAluno;
import java.util.Scanner;

public class SistemaAluno {
    /*
    
    ESTRUTURA DO SISTEMA:
    Login ou Cadastro => Perfil Aluno: Modificar cadastro, inserir dados, consultar dados, realizar provas online, acessar provas antigas




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

    public static void EscolhendoAcesso() {
        System.out.println("Seja Bem-vindo ao sistema Ânima, para realizar acesso basta entrar com Login e senha ou criar um cadastro agora!");

        //Escolhendo qual metodo ira trabalhar
        System.out.println("Deseja realizar o Login ou criar um cadastro?\nPara login digite 1, para cadastro digite 2");
        int op = scan.nextInt();

        if (op == 1) {
            System.out.println("-------------------------------");
            System.out.println("Digite seu Login: ");

            System.out.println("Digite sua Senha: ");


        } else if (op == 2) {
            System.out.println("-------------------------------");
            System.out.println("Indo para o cadastro");
        }
    }

    public static void CadastroAluno() {
    //Utilizando o aluno

    System.out.println("Vamos iniciar seu cadastro, digite abaixo algumas informações!");
    System.out.println("-------------------------------");
    System.out.println("Digite seu nome: ");
    aluno1.setNome(scan.nextLine());
    System.out.println("Digite o Nome da sua escola: ");
    aluno1.setEscola(scan.nextLine());
    System.out.println("Digite sua classe: ");
    aluno1.setClasseAluno(scan.nextLine());
    System.out.println("Digite seu RA: ");
    aluno1.setRA(scan.nextInt());
    System.out.println("Digite sua nova senha: ");
    aluno1.setSenha(scan.nextInt());
    
    System.out.println("-------------------------------");

    aluno1.InfoAluno();
    System.out.println("-------------------------------");
    System.out.println("As suas informações estão certas?\nDigite 1 para Sim e 2 Para não");
    int op = scan.nextInt();

    if (op == 1) {
        Sistema();
    } else if (op == 2) {
        System.out.println("-------------------------------");
        System.out.println("O que precisa alterar?\n1 - Nome\n2 - RA\n 3 - Senha\n4 - Classe\n 5 - Nome Escola");
        }
    }

    public static void Sistema() {
        System.out.println("");
    }

    public static void main(String[] args) {
        
    //Início do sistema
    EscolhendoAcesso();




    }




}   