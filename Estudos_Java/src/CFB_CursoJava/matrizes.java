package CFB_CursoJava;
import java.security.SecureRandom;

public class matrizes {
    public static void main(String[] args) {
        //Definição de variáveis
        final int lin = 5;
        final int col = 5;
        int[][] matriz = new int[lin][col];


        //Inserção de números aleatórios a Matriz
        for(int l = 0; l<lin; l++) {
            for (int c = 0; c<col; c++) {
                matriz[l][c] = new SecureRandom().nextInt(100);
            }
        }

        /*como são estruturas dentro de estruturas é necessário o for para leitura de cada uma das linhas dentro desse
        Array multidimensional*/
        
        for (int l = 0; l<lin; l++) {
            for(int c = 0; c<col; c++) {
                System.out.printf("| %2d|", matriz[l][c]); //Vai imprimir tudo que existe na Linha e na Coluna
            }
            System.out.printf("%n"); //Quebra a Linha da Matriz para fácil visualização da estrutura
        }

        /*  Aprendizados da Aula de Matriz:
         
        Dependendo da posição do número em %d você consegue manipular qual é o número que prevalece na escolha aleatória, exemplo:
        2%d - pega números que começam com 2.
        %2d - coloca tamanho 2 como padrão fazendo com que o número escolhido seja com 1 ou 2 caracteres utilize o espaço de 2
        %d2 - Pega números que terminam com 2.
         
         */
    }
}
