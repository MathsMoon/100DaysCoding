package CFB_CursoJava;
//import java.util.Arrays;

import CFB_CursoJava.Herança_java.Carro;

public class arrays {
    public static void main(String[] args) {
        //Vou escrever diferentes formas de utilizar um Array e salvar abaixo para lembrar de usar mais tarde.
        
        /*
        final int tam = 5;
        int[] num = {20, 10, 40, 50, 30};
        int[] n = new int[tam];
        int p = 50; //Caso for usar a Binary Search, cria o valor da posição para usar no ternário
        int pos = Arrays.binarySearch(num, p); */
        

        //Chamando funcionalidades da biblioteca Arrays.

        //Arrays.sort(num); Devolve de forma ordenada o Array (do maior para o menor).
        //Arrays.fill(n, 10); Preenche um objeto com algum valor indicado no argumento (Array, valor).

        

        //System.out.println(num); pesquisar melhor depois o resultado: [I@2f92e0f4;


        /*System.arraycopy(num, 0, n, 0, tam); 
        Função que permite copiar todo conteúdo de um Array e jogar em outro seguindo os seguintes passos:
        (Array Origem, Posição inicial para copiar, Array Destino, Posição da Array que vai receber, tamanho da Array)
        */

        /*Arrays.equals(n, num) é uma função que retorna um valor booleano respondendo se os arrays são iguais ou n.
        Pode ser usado um comando if para já imprimir a resposta:
        System.out.printf("Os Arrays são iguais? R: %s", Arrays.equals(n,num) ? "Sim" : "Não");
        */ 

        /* Para a utilização da Binary Search é necessário que a array seja ordenada de forma crescente,
        para que ele encontre dentro do array o valor designidado. por exemplo, vou encontrar o valor 50 na array:
        
        Arrays.sort(num);
        System.out.printf("O valor %d está na array? %s",p, pos > 0 ? "Sim" : "Não"); 
        
        */
    
        /*Parte 2 da aula de Arrays:
        
        int[] num = new int[5];

        num[0] = 1;
        num[1] = 10;
        num[2] = 101;
        num[3] = 1010;
        num[4] = 10101;

        for(int i = 4; i > -1; i--) {//num.length pega o tamanho do Array.
            System.out.printf("%d%n", num[i]);
        }


        for(int n:num) {//mesma coisa do for decima.
            System.out.printf("%d%n", n);
        }

        */

        final int numCarros = 5;
        Carro[] carros = new Carro[numCarros];
        String[] NomesCarro = {"Corolla","MAZDA MX-5", "SF90", "Golf", "Uno"};

        //Inicializando o Array Carros:

       for(int i = 0; i<numCarros; i++) {
        carros[i] = new Carro(NomesCarro[i]);
       }

       //Mostrando o resultado
       for(Carro i: carros) {
        i.info();
       }
    }
}