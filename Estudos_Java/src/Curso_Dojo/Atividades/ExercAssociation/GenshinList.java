package Curso_Dojo.Atividades.ExercAssociation;
import java.util.Scanner;
import Curso_Dojo.Atividades.ExercAssociation.Domain.GenshinCharList;

/*
    Exercício para reforçar o conceito de Associação Bidirecional
    vou Linkar Personagens a Região e Região ao Personagem

    Erros para revisar:
    - Construtor da Classe Character e region para ser preenchido pelo usuário
    - Revisar sets and Gets das classes
    -
*/
public class GenshinList {

    public static void setCharacters() {
        Scanner scan = new Scanner(System.in);

        //Definindo tamanho do Array de personagens:
        System.out.println("Quantos personagens vão cadastrar?");
        int qtdChar = Integer.parseInt(scan.nextLine());
        GenshinCharList[] personagens = new GenshinCharList[qtdChar];


        //Criando o Loop para Inserir Nome e Região
        for (int i = 0; i <= qtdChar; i++) {
            System.out.println("Insira o Nome do personagem: ");
            personagens[i].setNome(scan.nextLine());
            System.out.println("Insira a Região do Personagem: ");
            personagens[i].setRegiao(scan.nextLine());
        }
        //Função para mostrar os resultados:
        Imprime(personagens);
    }
    //que bom que estão prestando atenção na história e não nesse crime de guerra que eu tô fazendo
    public static void Imprime(GenshinCharList[] personagens) {
        for (GenshinCharList Pchar:personagens) {
            Pchar.Imprime();
        }
    }

    public static void main(String[] args) {
        //Introdução ao sistema:
        System.out.println("Testa ai");

        //Função para inserção dos dados
        setCharacters();
    }
}