package CFB_CursoJava.Calculadora_java;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
    //Definição do Objeto Scanner.
    Scanner scan = new Scanner(System.in);
    
    //Definição dos Objetos para manipulação da classe Numero.
    Numero n1Numero = new Numero();
    Numero n2Numero = new Numero();
    Numero res = new Numero();

    //Condição para o While permanecer loopando
    String opc = "S"; 

    //Utilizando um Loop para usar o sistema enquanto o usuário quiser
    while (opc.equals("S") || opc.equals("s")) { //opc.equals(usado para comparar Objetos, muito bom para String que não é um tipo primitivo)
        
        //Inserção dos dados nos Objetos n1 e n2.
        System.out.printf("Digite o primeiro valor: %n");
        n1Numero.setValor(scan.nextFloat());
        System.out.printf("Digite o segundo valor: %n");
        n2Numero.setValor(scan.nextFloat());
    
        //Cálculo e saída do resultado
        res.setValor(n1Numero.getValor() + n2Numero.getValor());
        System.out.printf("O resultado da soma de %.1f + %.1f é: %.1f", n1Numero.getValor(), n2Numero.getValor(), res.getValor());
        
        //Inserção do atributo que vai Loopar ou não a função while.
        System.out.printf("\nDeseja somar outro valor? ");
        opc = scan.next();
    }
    
    //Fechando o objeto do Scanner.
    scan.close();
   }
}
