package Curso_Dojo.Arrays;

public class RevArrays {
    public static void main(String[] args) {
        //Arrays são variáveis de referência. Logo ele n guarda em si valores, mas os endereços de memória dos valores da Array
        int[] idade = new int[3]; //Pode receber null por ser uma referência e não um tipo primitivo.

        //Inserindo valores para demonstrar o Garbage Collector.
        idade[0] = 10;
        idade[1] = 20;
        idade[2] = 30;

        idade = new int[3]; //Processo na qual é criado um novo endereço de memória, apagando consequentemente todo item anterior.

//        System.out.println(idade[0]); //resultado: 0

        //Meses e dias do ano
        int[][] dias = new int[03][03];

        //Inserindo valores a dias:
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        //For Loop para ler os números
//        for (int i = 0; i < dias.length; i++) {
//            for (int j = 0; j < dias[i].length; j++) {
//                System.out.println(dias[i][j]);
//            }
//        }

        //Realizando leitura da Matriz com For Each
        for(int[] arr:dias) {
            System.out.println("---------------");
            for (int num:arr){
                System.out.println(num);
            }
        }






    }
}
