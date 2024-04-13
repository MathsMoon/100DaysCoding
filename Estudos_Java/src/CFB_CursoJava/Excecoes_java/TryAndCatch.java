package CFB_CursoJava.Excecoes_java;
import java.util.ArrayList;
import java.util.Scanner;

public class TryAndCatch {

    public static void main(String[] args) {
        //Definindo atributos 
        Scanner scan = new Scanner(System.in);
        final int TAM = 5;
        ArrayList<String> carros = new ArrayList<>(TAM);

        //Adicionando itens a lista
        carros.add("Corsa");
        carros.add("Celta");
        carros.add("Camaro");
        carros.add("Corolla");
        carros.add("Cruze");
       
        try {

            /*o Try é uma função que ao receber um bloco de código pode evitar que o erro trave o sistema ao executar o comando 
            e retornar um erro usando o método Catch. Por isso que muitos sistemas por mais que você erre algo ele não para de funcionar
            ao utilizar esse comando, nós damos a possibilidade de descrever um erro ao usuário do sistema e realizar a operação correta
            do comando, sem que o sistema todo pare de funcionar devido ao erro. */

            System.out.println(carros.get(20));
        } catch (Exception e) {
            
        }
        


        //Mostrando a Lista
        for(String e:carros) {
            System.out.println(e);
        }

        //Fechando objeto Scanner
        scan.close();
    }
}
