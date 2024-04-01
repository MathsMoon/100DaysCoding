package CFB_CursoJava.Classes_java;
/*
  
 Para acessar certos arquivos é necessários importa-los, exemplo:
 Se eu quero importar o jogador.java que está fora da pasta classes_java eu preciso fazer isso:

 import Topicos_java.jogador;

 por tanto para melhor organização das pastar preciso ver sobre o comando Package e o import.

 Import: usa o import para buscar de outras packages ou pastas as funções ou classes que você busca para atribuir ao programa atual
 como o uso do Scanner que importa do java.util.Scanner.

 package: é um conjunto de arquivos que possuem as classes do java, seja criados pelo programada, pela biblioteca ou afins.
 É importante para definir o conjunto específico de uma aplicação. o protect por exemplo só se torna público e acessável para pastas dentro
 do mesmo package ou que recebem de Herança a classe que tem permissão ou as possuem.
  
 
 */



public class clube {
    public static void main(String[] args) {

        /*Criando uma condição de Pós Incremento:
        int posincre = 0;

        Igual a criação de um objeto, pq o j1 é um objeto independente que "herda" tudo da classe Jogador.java
        jogador j1 = new jogador(posincre++);
        jogador j2 = new jogador(posincre++);
        jogador j3 = new jogador(posincre++); 

        Resultado: ele sai do 0 ao 2, vai adicionando a cada jogador criado
        */

        //Criando uma condição Pré-Incremento:
        int posincre = 0;
        jogador j1 = new jogador(++posincre);
        jogador j2 = new jogador(++posincre);
        jogador j3 = new jogador(++posincre);
        //Resultado: sai a partir do 1 já que ele incrementa antes de mostrar.


        //jogador.Teste(); desta forma consigo executar um método de outra classe aqui dentro

       
         //j1.b = 10;  Se eu criar um j2.b e colocar qualquer outro valor o resultado são 2 valores, cada instância é independente.

        System.out.printf("O valor da vida do jogador 1 é de: %d", j1.getVidas());
        //O getVidas() é uma função que chama dentro da outra classe um paramêtro existente, podendo pegar valores e colocando nesta classe atual.

    }
}
