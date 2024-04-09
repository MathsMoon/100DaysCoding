package Atividades_Facul.Empresa_java;
import java.util.Scanner;

public class EmpregadoPrincipal{
    public static void main(String[] args) {
        //Criando Objeto
        Scanner scan = new Scanner(System.in);


        //Inserção de dados
        System.out.printf("Digite seu nome: ");
        String nome = scan.next();
        System.out.printf("%nDigite seu Salário bruto atual: ");
        int salariobruto = scan.nextInt();
        System.out.printf("%nQuanto você paga de taxa? ");
        double taxas = scan.nextDouble();
        // System.out.println("Houve o aumento?");
        // boolean n = scan.hasNextByte();

        //Manipulando as informações do Empregado
        Empregado trabalhador1 = new Empregado(nome,salariobruto,taxas);
        
        trabalhador1.InfoEmpregado();
        trabalhador1.AumentoSalario(false);

        trabalhador1.AumentoSalario(true);
        trabalhador1.InfoEmpregado();

        scan.close();
    }   
}