package CFB_CursoJava.Colecoes_java;
import java.util.HashMap;
import java.util.Scanner;

public class Hash {
    public static void main(String[] args) {
        
        /*  Hashmap: relacionamento de uma chave para um valor  */

        //Criando o HashMap com parâmetros de int e String
        HashMap<Integer, String> FabrCarro = new HashMap<Integer,String>();
        Scanner scan = new Scanner(System.in);

        //Inserindo valores ao HashMap 
        for(int i = 1; i<=5; i++) {
            System.out.println("Digite uma Fabricante de carro: ");
            FabrCarro.put(i, scan.nextLine());
        }

        /*  Funções do HASHMAP */
        //FabrCarro.get(); Retorna dentro do HashMap o valor assinalado aquela chave, como um index
        // FabrCarro.size(); Retorna um int do tamanho do Hash
        // FabrCarro.remove(FabrCarro, 2); Remove o valor assinalado de 2 no HashMap
        // FabrCarro.clear(); Limpa todo o HashMap


        //Mostrando o HashMap
        System.out.println(FabrCarro);

        //Para utilizar o ForEach é necessário a interação com a função values que mostra os elementos do Hash
        // for(String FC:FabrCarro.values()) {
        //     System.out.println("----------");
        //     System.out.println(FC);
        // }

        //Fechando o Objeto
        scan.close();
    }
}
