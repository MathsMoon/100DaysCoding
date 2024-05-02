package Curso_Dojo.Atividades.ExercAssociation;
import java.util.Scanner;
import Curso_Dojo.Atividades.ExercAssociation.Domain.GenshinCharList;

/*
    Exercício para reforçar o conceito de Associação Bidirecional
    vou Linkar Personagens a Região e Região ao Personagem

    Erros para revisar:
    - Construtor da Classe Character e region para ser preenchido pelo usuário
    - Revisar sets and Gets das classes


*/
public class GenshinList {

    public static void setCharacters() {
        Scanner scan = new Scanner(System.in);
        GenshinCharList personagem1 = new GenshinCharList();

        //Criando o Loop para Inserir Nome e Região
        System.out.println("Insira o Nome do personagem: ");
        personagem1.setNome(scan.nextLine());
        System.out.println("Insira a Região do Personagem: ");
        personagem1.setRegiao(scan.nextLine());

        //Função para mostrar os resultados:
        personagem1.Imprime();
    }

    public static void main(String[] args) {
        //Introdução ao sistema:
        System.out.println("Testa ai");

        //Função para inserção dos dados
        setCharacters();
    }
}