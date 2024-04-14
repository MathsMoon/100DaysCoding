package CFB_CursoJava.Excecoes_java;

public class Throw_inJava {
    public static void main(String[] args) {
        int n1, n2, res;

        n1 = 60;
        n2 = 20;

        if(n1 > 50) {
            throw new IllegalArgumentException("Valor de nota Inválido"); 
            /*Caso eu precise especificar qual erro é possível dentro de uma aplicação eu posso utilizar o throw new para 
             * criar a mensagem de erro de acordo com a necessidade e assim organizar de forma mais fácil as possibilidades de contra 
             * medida em casos de erro assim, já que eu facilmente estou identificando os pontos fracos do sistema com mensagens 
             * personalizadas, destacando aonde pode estar errado para correção.
             * Melhor estudar mais casos de uso do throw e utilizar em conjunto com o Try.
            */
        }
        if (n2 > 20) {
            throw new IllegalArgumentException("Valor de nota Inválido");
        }

        res = n1 + n2;

        System.out.println("Resultado: " + res);
    }   
}