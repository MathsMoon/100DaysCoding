package Loiane_CursoJava.Exercicios;
import java.util.Scanner;

public class Exerc17 {
    public static void main(String[] args) {
        //3. Programa de validação
        Scanner scan = new Scanner(System.in);
        String nome = "";
        int idade, salario;
        char sexo, Estado_Civil;

        //Início do sistema
        System.out.println("Preencha as informações abaixo");
        System.out.println("-------------------------");

        //Inserção de valores
        System.out.println("Nome:");
        nome = scan.next();
        System.out.println("Idade: ");
        idade = scan.nextInt();
        System.out.println("Salário: ");
        salario = scan.nextInt();
        System.out.println("Sexo (Apenas F ou M): ");
        sexo = scan.next().charAt(0);
        System.out.println("Estado Civil(Apenas S, C, V ou D):");
        Estado_Civil = scan.next().charAt(0);

        //Classe do char que ajuda a ter funcionalidades parecidas com String
        sexo = Character.toUpperCase(sexo);
        Estado_Civil = Character.toUpperCase(Estado_Civil);

        System.out.println(Estado_Civil);

        //Validação
        if(nome.length() < 3) {
            System.out.println("Nome inválido");
        } else if (idade > 150 || idade < 0) {
            System.out.println("Idade inválida");
        } else if (salario < 0) {
            System.out.println("POBRE KKKKKKKKKKKKKKKKKKKKKKKKKKK");
        } else if (sexo != 'F' && sexo != 'M') {
            System.out.println("Sexualidade inválida");
        } else if (Estado_Civil != 'S' && Estado_Civil != 'C' && Estado_Civil != 'V' && Estado_Civil != 'D') {
            System.out.println("Estado Civil inválido");
        }

        System.out.printf("%n %s %d %d %c %c", nome, idade, salario, sexo, Estado_Civil);
        scan.close();
    }
}