package Curso_Dojo.OOP.Trowables.ExceptionsTest;

import java.io.File;
import java.io.IOException;

/*
    O Tratamento de um erro ocorre quando dizemos ao sistema
    retornar um Erro através da utilização indevida do código
    ou função, portanto podemos utilizar de duas formas para
    informar sobre o catch de exceptions, tanto pelo Try and
    Catch, como também utilizando na criação da função o
    Throws (exception específica). Para funções públicas é
    recomendado o uso do Throw na definição da função já que
    sendo pública é evidente o cuidado que temos que ter ao
    utilizar aquela função, entretanto caso o uso seja priva
    -do ou de menor acesso, pode-se utilizar o Try.
 */



public class TestException01 {
    public static void main(String[] args)  {
        CreatNewArchive();
    }

    private static void CreatNewArchive()  {
        //Criando um Arquivo de Hello World.java na pasta NewRepository.
        File file = new File("Estudos_Java/src/Curso_Dojo/OOP/Trowables/ExceptionsTest/NewRepository/HelloWorld.java");

        //Tratando o Exception error do Arquivo
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo Criado: " + isCriado);
        }catch (IOException e) {
            //System.out.println(e.getMessage()); Retorna só a mensagem: Acesso Negado
            e.printStackTrace(); //Retorna todo o Trace do erro
            throw new RuntimeException("Erro na criação do arquivo");
        }
    }
}