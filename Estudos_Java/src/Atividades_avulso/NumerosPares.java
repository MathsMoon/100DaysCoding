package Atividades_avulso;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número par de 0 a 20");
        int np = scan.nextInt();

        for(int i = 2; i <= 20; i++){
            if(i%2 == 0){
                System.out.printf("%nNúmeros pares de %d: %d%n", np,(i*np));
            }
        }
    }
}