package Curso_Dojo.OOP.Trowables.RunTimeTest;

public class TestRunTimeEx02 {

    /*
        Exemplo abaixo mostra como podemos utilizar os catch Exceptions
        sem utilizar necessariamente o Try and Catch
        caso o argumento seja inválido ele utiliza a exception específica
        para erros de Argumento Ilegal, tornando o código mais limpo e fácil de compreender
        para todo tratamento de erro, utilizar a exception devida ao erro.
     */

    private static void Divisao(int a, int b) {
        if(b == 0 || a == 0) {
            throw new IllegalArgumentException("Argumento Inválido, não pode ser 0");
        }
        System.out.println(a/b);
    }

    public static void main(String[] args) {
       Divisao(40,10);
    }
}