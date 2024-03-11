import java.util.Scanner;

public class Aula04 {
    public static void main(String[] args) {
        //Criação de um objeto para scanear
        Scanner scan = new Scanner(System.in);

        //Declaração de variáveis
        float n1,n2,n3,n4; 
        int a;

        //Introdução ao sistema
        System.out.println("Bem-Vindo aluno, para saber sua média e situação educacional por favor descreva suas notas abaixo.");

        //Processo de entrada de informações
        System.out.println("Digite a primeira nota: ");
        n1 = scan.nextFloat();
        System.out.println("Digite a segunda nota: ");
        n2 = scan.nextFloat();
        System.out.println("Digite a terceira nota: ");
        n3 = scan.nextFloat();
        System.out.println("Digite a quarta nota: ");
        n4 = scan.nextFloat();

        //Cálculo da média e análise da situação do Aluno
        float media =(n1 + n2 + n3 + n4)/4;

        if (media >= 7) {
            a = 1;
        } else if (media > 5.9 && media < 7 ) {
            a = 2;
        } else {
            a = 3;
        }

        //Mostrando o resultado da média e a situação acadêmica do Aluno
        switch (a) {
            case 1:
                System.out.println("Sua média é: " + media + " e sua situação é Aprovado");
                break;
            case 2:
                System.out.println("Sua média é: " + media + " e sua situação é em recuperação");
                break;
            case 3:
                System.out.println("Sua média é: " + media + " e sua situação é Reprovado");
                break;
        }       
    }
}
