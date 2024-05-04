package Curso_Dojo.OOP.Trowables.ExceptionsTest;

import Curso_Dojo.OOP.Trowables.ExceptionsTest.PeronalizedExceptions.LoginInvalidoException;

import java.util.Scanner;

/*
    Testando meu exception personalizado para Login.

    Por mais que você digite tudo errado ou até deixe em branco o UserLogin e Password, ele
    não retorna um erro, seja o específico que eu criei ou até mesmo a classe Exception.
 */

public class TestLoginInvalidoEx {
    public static void main(String[] args) {
        try {
            Logar();
        } catch (LoginInvalidoException e) {
            e.getStackTrace();
        }
    }

    private static void Logar() throws LoginInvalidoException {
        //Criando os atributos simulando um Banco de dados
        Scanner scan = new Scanner(System.in);
        String UsernameDB = "User1";
        String PasswordDB = "12345";

        System.out.println("Usuário: ");
        String Userlogin = scan.nextLine();
        System.out.println("Senha: ");
        String UserPassword = scan.nextLine();

        if(!Userlogin.equals(UsernameDB) || !UserPassword.equals(PasswordDB)) {
            throw new LoginInvalidoException("Login ou Senha incorretos");
        }

        System.out.println("Usuário Logado com Sucesso!");
    }
}