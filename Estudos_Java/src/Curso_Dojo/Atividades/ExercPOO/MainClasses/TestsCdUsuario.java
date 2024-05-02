package Curso_Dojo.Atividades.ExercPOO.MainClasses;
import Curso_Dojo.Atividades.ExercPOO.Domain.CadastroUsuario;

import java.util.Scanner;

public class TestsCdUsuario {
    //Atributos da Classe
    static Scanner scan = new Scanner(System.in);
    static CadastroUsuario CdUser = new CadastroUsuario();

    public static void CadastroUsuario() {}

    public static void main(String[] args) {
        //Criando atributos básicos do sistema
        boolean TermsCondition = false;

        while (!TermsCondition) {
            System.out.println("Cadastro de Usuário, por favor siga as Regras Abaixo:");
            System.out.println("1 - Nome deve conter 1 letra em maíusculo e não conter espaços");
            System.out.println("2 - Senha deve conter 8 caracteres, sem espaço e com 1 caractere especial");
            System.out.println("3 - Não é permitido criar conta com menos de 13 anos");
            System.out.println("Está de acordo com os termos acima? (S/N)");
            String option = String.valueOf(scan.next().charAt(0));

            if(option.equalsIgnoreCase("S")) {
                TermsCondition = true;
                CadastroUsuario();
            } else {
                System.out.println("Só podemos Prosseguir com uma resposta positiva: ");
                System.out.println("-------------------------");
            }
        }
    }
}