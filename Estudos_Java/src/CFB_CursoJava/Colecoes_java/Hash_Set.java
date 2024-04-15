package CFB_CursoJava.Colecoes_java;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;

public class Hash_Set {
    public static void main(String[] args) {
        
        //Diferente do HashMap ele não armazena valores iguais, apenas ignorando quando ocorre a repetição
        HashSet<String> FabrCarro = new HashSet<String>();
        // int FabrTam = 5;
        Scanner scan = new Scanner(System.in);

        //Inserção dos dados

        FabrCarro.add("a");
        FabrCarro.add("b");
        FabrCarro.add("c");
        FabrCarro.add("d");
        FabrCarro.add("e");


        // Inserção Manual do usuário
        // for(int i = 0; i<FabrTam; i++) {
        //     System.out.println("Digite uma Fabricante de carro: ");
        //     FabrCarro.add(scan.nextLine());
        // }


        /* Funções HashSet */
        //As mesmas do HashMap


        //Mostrando resultado
        // System.out.println(FabrCarro); //Mostra os valores que não se repetiram do for

        /* Funcionamento do Iterator: */

        //Criando um elemento iterator para manipular
        Iterator<String> it = FabrCarro.iterator();

        //Realizando a leitura do Hash usando um Iterator
        while (it.hasNext()) { //hasNext() retorna um valor booleano podendo ser usado no while.
            String compara = it.next();
            if(compara == "b") { //Ele retorna um erro, provavelmente por ser um HashSet usando esse comando, depois pesquisar sobre condições para comparar valores
                it.remove();
            }
            System.out.println(it.next());
        }
       
       
        // Utilizando o For
        // for(int i = 1; i<=FabrTam; i++) {
        //     System.out.println(it.next()); //Função que retorna sempre o próximo elemento da interação, como se fosse um i+=1
        // }
        
        
        //Fechando Objeto
        scan.close();
    }
}
