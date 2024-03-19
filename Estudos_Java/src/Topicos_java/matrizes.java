package Topicos_java;
import java.security.SecureRandom;

public class matrizes {
    public static void main(String[] args) {
        final int lin = 5;
        final int col = 5;
        int[][] matriz = new int[lin][col];

        for(int l = 0; l<lin; l++) {
            for (int c = 0; c<col; c++) {
                matriz[l][c] = new SecureRandom().nextInt(100);
            }
        }

    }
}
