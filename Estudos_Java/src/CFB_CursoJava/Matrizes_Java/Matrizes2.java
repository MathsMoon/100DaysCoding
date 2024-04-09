package CFB_CursoJava.Matrizes_Java;
// import java.security.SecureRandom;

 public class Matrizes2 {
    public static void main(String[] args) {
        //Criando Arrays 
        int[][] numeros = new int[3][5]; //Instanciando um Array para que tenha 3 linhas e 5 colunas

        for(int l = 0; l<3; l++) {
            for(int c = 0; c<5; c++) {
                numeros[l][c] = 1;

            }
        }

        // for(int[] n:numeros) {//For Each para matrizes você coloca o []
        //     System.out.printf("%d - %n", n);
        // }
        
    }
}
