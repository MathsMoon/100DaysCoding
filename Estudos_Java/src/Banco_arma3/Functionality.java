package Banco_arma3;
import Banco_arma3.Player_Data.Players_Register;
import Banco_arma3.Player_Data.SQL_Connections;
import java.io.IOException;
import java.util.Scanner;

public class Functionality {

    private static final SQL_Connections BankUser = new SQL_Connections();
    private static final Scanner scan = new Scanner(System.in);

    public static void Login() { //Método de login
        System.out.println("Login: ");
        // Verificar como usar o Array para receber as duas Strings [0] e [1]
        System.out.println("Password: ");

        //Pós verificação habilita as funcionalidades do sistema:
        App.UserFunctions();
    }  

    public static void Register() throws IOException, InterruptedException { // Método para o registro do Player
        System.out.println("Siga os passos abaixo para criar seu registro");

        //inserção das informações de acesso e verificação
        System.out.println("Crie um nome de Login válido (Mais de 5 letras, contenha números e 1 caractere especial):");
        String VerifyUserLoginRegister = scan.nextLine();
        System.out.println("Crie uma senha (Precisa ter no mínimo 8 caracteres):");
        String VerifyUserPassWordRegister = scan.nextLine();
        
        //Limpando o CMD pós verificação
        CleaningCMD();

        //Cadastrando informações de Player.
        System.out.println("Muito bem, agora queremos saber um pouco mais sobre você!");
        System.out.println("Seu nickname no jogo:");
        String setUserName = scan.nextLine();
        System.out.println("Se possui algum saldo escreva abaixo a quantidade (Disponível no servidor do Reino Sinopense): ");
        int setUserActualBalance = Integer.parseInt(scan.nextLine()); //verificar como barra qualquer valor além de um Int
        System.out.println("Quantas DogTags você já pegou?");
        int setUserNumDogTags = Integer.parseInt(scan.nextLine()); //verificar como barra qualquer valor além de um Int

        //Criando um Novo Usuário:
        BankUser.SQL_Connections(VerifyUserLoginRegister, VerifyUserPassWordRegister, setUserName, setUserNumDogTags, setUserActualBalance);

        //Finalização
        CleaningCMD();
        System.out.printf("Agradeço novamente pelas informações. Agora Basta realizar seu primeiro login, seja bem vindo %s!%n", BankUser.getUserName());
        Login();
    }

    public static void CleaningCMD() throws IOException, InterruptedException { //Função que limpa o terminal para novas infos.
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

}
