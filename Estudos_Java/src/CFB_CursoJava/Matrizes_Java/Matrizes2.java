package CFB_CursoJava.Matrizes_Java;
import java.security.SecureRandom;
public class Matrizes2 {


    public static void ImpDados(int[][] mtz, int lin, int col) {//método para imprimir os dados da Matriz
        //Realizando a leitura de toda Matriz
        for(int l = 0; l<lin; l++) {
            for(int c = 0; c<col; c++) {
                System.out.printf("%d - ", mtz[l][c]);
            }
            System.out.printf("%n"); //Quebra entre Linhas
        }
    }

    public static void NumAleat(int[][] mtz, int lin, int col) {//Método para gerar os Números
        for(int l = 0; l<lin; l++) {
            for(int c = 0; c<col; c++) {
                mtz[l][c] = new SecureRandom().nextInt(100); //Função que preenche cada elemento da Matriz com números de 1 a 100
            }
        }
    } 

    public static void main(String[] args) {
        //Criando Arrays 
        int lin = 3, col = 5;
        int[][] numeros = new int[lin][col]; //Instanciando um Array para que tenha 3 linhas e 5 colunas

        //Gerando Números aleatórios para a Matriz
        NumAleat(numeros, lin, col);


        //Fazendo a impressão dos dados
        ImpDados(numeros, lin, col);
    }
}
