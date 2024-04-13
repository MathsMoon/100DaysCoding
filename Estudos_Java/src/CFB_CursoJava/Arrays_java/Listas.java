package CFB_CursoJava.Arrays_java;
import java.util.ArrayList;

public class Listas {
   public static void main(String[] args) {
    
      //Definindo uma Arraylist, a definição dos atributos é feita dentro do <>
      ArrayList<Integer> numeros = new ArrayList<>(10); //O número dentro do () representa a quantidade inicial de index, ele abriu com 10
      ArrayList<String> carros = new ArrayList<>(10);

      //Definindo números a lista
      numeros.add(10);
      numeros.add(20);
      numeros.add(30);
      numeros.add(0, 5); //Indexando um item colocando em primeiro lugar na lista
      numeros.addFirst(2); //Esse comando ignora o index comum do add e coloca em primeiro este elemento
      //numeros.clear();  Limpando todos os valores dentro da lista
      //System.out.println(numeros.contains(20)); Pesquisa um elemento dentro da lista e mostra um valor booleano
      //numeros.ensureCapacity(1); ??????
      //System.out.println(numeros.indexOf(10)); Mostra a posição do elemento dentro da lista
      //System.out.println(numeros.get(0)); Imprimindo valores específicos usando a função get()
      //numeros.remove(); função que remove um objeto, seja o nome do elemento ou seu index
      numeros.trimToSize(); //Remove os index não utilizados da lista números, se tem 10 e só usa 5, apaga os 5 que estão vagos

      //Definindo Strings a lista.
      carros.add("HRV");
      carros.add("Polo");
      carros.add("Cruze");
      carros.add(0, "Ponte Preta"); //Indexando um elemento para ocupar uma colocação específica
      carros.trimToSize();

      for(Integer e:numeros) {//ForEach para ler a lista precisa ser do mesmo tipo da Lista
         System.out.println(e);
      }

      System.out.println("------------------------");

      for(int i = 0; i<carros.size(); i++) {//Realizando a leitura da list usando as funções Size(retorna um int do tamanho da lista) e get(pega o valor naquele index)
         System.out.println(carros.get(i));
      }
   }
}