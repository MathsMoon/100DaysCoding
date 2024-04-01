package CFB_CursoJava.Calculadora_java;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
    //Definição do Objeto Scanner.
    Scanner scan = new Scanner(System.in);
    
    //Definição dos Objetos Número
    Numero n1Numero = new Numero();
    Numero n2Numero = new Numero();
    Numero res = new Numero();
    String opc = "S"; //Condição para o While permanecer loopando

    //Utilizando um Loop para usar o sistema enquanto o usuário quiser
    while (opc.equals("S") || opc.equals("s")) {
        System.out.printf("Digite o primeiro valor: %n");
        n1Numero.setValor(scan.nextFloat());
        System.out.printf("Digite o segundo valor: %n");
        n2Numero.setValor(scan.nextFloat());
    
        res.setValor(n1Numero.getValor() + n2Numero.getValor());
        System.out.printf("O resultado da soma de %.1f + %.1f é: %.1f", n1Numero.getValor(), n2Numero.getValor(), res.getValor());
        
        System.out.printf("\nDeseja somar outro valor? ");
        opc = scan.next();
    }
    
    //Fechando o objeto do Scanner.
    scan.close();
   }
}
