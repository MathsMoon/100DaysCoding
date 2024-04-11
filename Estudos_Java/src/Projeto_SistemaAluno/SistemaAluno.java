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

    public static void EscolhendoAcesso(int op) {
        if (op == 1) {
            System.out.println("-------------------------------");
            System.out.println("Digite seu Login: ");
            int ra = scan.nextInt();
            System.out.println("Digite sua Senha: ");
            int senha = scan.nextInt();

            aluno1.ValidacaoDados(senha, ra);
        } else if (op == 2) {
            CadastroAluno();
        }
    }

    public static void CadastroAluno() {
    
    //Inserção de dados para o objeto Aluno
    System.out.println("Vamos iniciar seu cadastro, digite abaixo algumas informações!");
    System.out.println("-------------------------------");
    System.out.printf("%nDigite seu nome: ");
    aluno1.setNome(scan.next());
    System.out.printf("%nDigite o Nome da sua escola: ");
    aluno1.setEscola(scan.next());
    System.out.printf("%nDigite sua classe: ");
    aluno1.setClasseAluno(scan.next());
    System.out.printf("%nDigite seu RA: ");
    aluno1.setRA(scan.nextInt());
    System.out.printf("%nDigite sua nova senha: ");
    aluno1.setSenha(scan.nextInt());
    
    //Mostrando as informações colocadas pelo usuário
    System.out.println("-------------------------------");
    aluno1.InfoAluno();
    System.out.println("-------------------------------");

    //Caso precise alterar o cadastro antes de guardar
    System.out.println("As suas informações estão certas?\nDigite 1 para Sim e 2 Para não");
    int op = scan.nextInt();
    //Condicionamento para 
    if (op == 1) {
        Sistema();
    } else if (op == 2) {
        System.out.println("-------------------------------");
        System.out.println("O que precisa alterar?\n1 - Nome\n2 - RA\n3 - Senha\n4 - Classe\n5 - Nome Escola");
        int alterar = scan.nextInt(); 
        AlterandoCadastro(alterar);
        }
    }

    public static void AlterandoCadastro(int alterar) {
        switch (alterar) {
            case 1:
                System.out.printf("%nDigite seu nome: ");
                aluno1.setNome(scan.next());
                break;
            case 2:
                System.out.printf("%nDigite seu RA: ");
                aluno1.setRA(scan.nextInt());
                break;
            case 3:
                System.out.printf("%nDigite sua nova senha: ");
                aluno1.setSenha(scan.nextInt());
                break;
            case 4:
                System.out.printf("%nDigite sua classe: ");
                aluno1.setClasseAluno(scan.next());
                break;
            case 5:
                System.out.printf("%nDigite o Nome da sua escola: ");
                aluno1.setEscola(scan.next());
                break;
            default:
                System.out.printf("%nNúmero invalido, reescreva: ");
                alterar = scan.nextInt();
                AlterandoCadastro(alterar);
                break;
        }

        System.out.println("-------------------------------");

    }

    public static void Sistema() {
        aluno1.InfoAluno();
    }

    public static void main(String[] args) {
        
    //Início do sistema
    System.out.println("Seja Bem-vindo ao sistema Ânima, para realizar acesso basta entrar com Login e senha ou criar um cadastro agora!");

    //Escolhendo qual metodo ira trabalhar
    System.out.println("Deseja realizar o Login ou criar um cadastro?\nPara login digite 1, para cadastro digite 2");
    int op = scan.nextInt();

    //Método de escolha de Login
    EscolhendoAcesso(op);
    }
}   