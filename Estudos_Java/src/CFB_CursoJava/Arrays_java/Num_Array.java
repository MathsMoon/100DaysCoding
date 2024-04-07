package CFB_CursoJava.Arrays_java;

public class Num_Array {

    public static void ParImpar(int[] num) {//Método para conferir os Números Primos
        //Definindo o res para salvar uso de souts.
        String res;

        for(int n:num) {//Função que percorre toda a Array buscando N.P
            if(n%2==0) {
                res = "Par";
            } else {
                res = "Impar";
            }
            System.out.printf("%d:%s%n", n, res);
        }
    }


    public static void ConferindoNotas(int[] nt, int[] r) {//Método para Conferir Notas

        /*
        O Conceito a ser entendido aqui é que:
        Quando nós criamos variáveis para serem usadas em um método, não é a variável em si que é usada
        mas uma de referência, por isso existe a conversão como mostra o for
        
        int i:nt (o I é um Array de referência e não altera o valor do Array criado no Main)

        Para podermos alterar temos como usar parâmetros esses que recebem o valor
        como no caso do resultado, que é uma Array que recebe 2 valores
        Aprovados e Reprovados, assim poupando espaço de utilizar 2 variáveis de referência
        
        O resultado consegue ser alterado por não ser uma variável, ele se torna uma referência 
        aceitando o valor dentro do Método
        */



        for(int i:nt) {
            if (i<=60) {
                r[0]++;
            } else {
                r[1]++;
            }
        }
    }


    public static void main(String[] args) {
        //Definição de variáveis
        int[] numeros = {10, 85, 62, 45, 98, 78, 88, 60, 67, 55, 12, 82};
        int[] resultado = {0,0};
        
        //Chamando Método
        ConferindoNotas(numeros, resultado);

        //Mostrando resultado
        System.out.printf("Aprovados: %d%n", resultado[0]);
        System.out.printf("Reprovados: %d%n", resultado[1]);

    }
}
