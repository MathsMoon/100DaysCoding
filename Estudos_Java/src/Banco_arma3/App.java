package Banco_arma3;
import java.io.IOException;
import java.util.Scanner;

public class App extends Functionality{
    /*
     
    Pasta criada para um futuro projeto de um banco de dados para o RP do arma 3, cada jogador vai ser cadastrado e vai ter 
    sua própria economia, ganhando ao completar as missões e ao coletar DogTags. Essas economias são usadas para comprar 
    pacotes de armas de determinados países ou Expansão da base.

    Funcionalidades:
    - Armazenar informações de cada Mercenário
    - Informar a Economia do usuário
    - Tabela do mercado internacional para compras
    - Consulta do saldo e de possíveis retiradas do dinheiro
      
    */
    
    //Criando um objeto que vai receber e guardar as informações do Usuário
    private static final Scanner scan = new Scanner(System.in);
    // private static Functionality systemfunctions = new Functionality();

    public static void UserFunctions() {
        
    }
    
    public static void main(String[] args) throws IOException, InterruptedException {
        //Introdução do sistema
        System.out.println("Seja Bem-vindo ao Banco Militaires Sans Frontières");
        System.out.println("Caso seja seu primeiro acesso considere realizar seu registro.");
        System.out.println("Deseja realizar seu Login ou registro?");
        String op = scan.nextLine().toUpperCase();

        //Verificação da opção.
        if(op.equals("LOGIN")) {
            CleaningCMD(); //Precisa estar a frente da função para não apagar posteriormente o que virá.
            Login();
        } else if (op.equals("REGISTRO")) {
            CleaningCMD();
            Register();
        } else {
            CleaningCMD();
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Valor inserido não foi reconhecido, por favor insira um valor válido!");
            System.out.println("------------------------------------------------------------------------");
            main(args);
        }
    }
}