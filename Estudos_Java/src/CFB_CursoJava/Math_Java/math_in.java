package CFB_CursoJava.Math_Java;

public class math_in {
    public static void main(String[] args) {

        /* Principais funções da classe Math */

        Math.min(10, 20); //Resultado: 10
        Math.max(10, 20); //Resultado: 20
        Math.abs(0); //Retorna um valor absoluto (positivo do número em questão)
        Math.sqrt(144); //Resultado: 12
        Math.pow(2, 10); //Resultado: 2048
        Math.random(); //Retorna um número aleatório entre 0 e 1 (um double), para alterar basta multiplicar
        //Exemplo: double a = Math.random()*11; retorna um double entre 0 e 10
        Math.floor(0); //Retorna um valor inteiro mais proximo de um float ou double 
        System.out.println(Math.TAU); //Retorna o TAU
    }
}
