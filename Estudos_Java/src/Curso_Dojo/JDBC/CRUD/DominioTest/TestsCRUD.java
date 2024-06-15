package Curso_Dojo.JDBC.CRUD.DominioTest;

import Curso_Dojo.JDBC.CRUD.Service.AlunoService;
import Curso_Dojo.JDBC.CRUD.Service.DisciplinaService;
import Curso_Dojo.JDBC.CRUD.Service.ProfessorService;

import java.util.Scanner;

public class TestsCRUD {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        while (true){
            menu();
            op = Integer.parseInt(SCANNER.nextLine());
            switch (op){
                case 1 -> alunoMenu();
                case 2 -> professorMenu();
                case 3 -> disciplinasMenu();
                default -> throw new IllegalArgumentException("Valor inválido");
            }
        }
    }

    private static void menu(){
        System.out.println("Bem vindo ao Menu de Administração, escreva o número que refere a operação!");
        System.out.println("1. Acessar interface para Alunos.");
        System.out.println("2. Acessar interface para Professores.");
        System.out.println("3. Acessar interface para Disciplinas");
        System.out.println("0. Sair do Sistema.");
    }

    private static void alunoMenu(){
        System.out.println("Bem vindo a Interface do Aluno, escolha abaixo o procedimento que deseja!");
        System.out.println("1. Pesquisando Aluno pelo Nome.");
        System.out.println("2. Deletando Aluno pelo ID.");
        System.out.println("3. Salvando um Aluno no Banco.");
        System.out.println("4. Alterando informações de um Aluno no Banco.");
        System.out.println("0. Para voltar ao Menu da Administração.");
        AlunoService.menu(Integer.parseInt(SCANNER.nextLine()));
    }

    private static void professorMenu(){
        System.out.println("Bem vindo a Interface do Professor, escolha abaixo o procedimento que deseja!");
        System.out.println("1. Pesquisando Professor pelo Nome.");
        System.out.println("2. Deletando Professor pelo ID.");
        System.out.println("3. Salvando um Professor no Banco.");
        System.out.println("4. Alterando informações de um Professor no Banco.");
        System.out.println("0. Para voltar ao Menu da Administração.");
        ProfessorService.menu(Integer.parseInt(SCANNER.nextLine()));
    }

    private static void disciplinasMenu(){
        System.out.println("Bem vindo a Interface das disciplinas, escolha abaixo o procedimento que deseja!");
        System.out.println("1. Pesquisando Disciplinas pelo Nome.");
        System.out.println("2. Deletando Disciplinas pelo ID.");
        System.out.println("3. Salvando um Disciplinas no Banco.");
        System.out.println("4. Alterando informações de um Disciplinas no Banco.");
        System.out.println("0. Para voltar ao Menu da Administração.");
        DisciplinaService.menu(Integer.parseInt(SCANNER.nextLine()));
    }
}