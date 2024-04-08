package CFB_CursoJava.Arrays_java;
//import java.util.Scanner;

public class Parametros {

    public static int Soma(int[] n) {
        //Definindo o resultado
        int res = 0;

        for(int i:n) {
            res +=i; //res recebe os valores do Array e soma cada valor
        }
        return res;
    }



    public static void main(String[] args) {
        //Definindo o Array
        int[] valores = {10, 20, 30, 40, 50};

        //Chamando o Método de soma 
        int res = Soma(valores);

        //Mostrando o resultado
        System.out.println(res);
    }
}
