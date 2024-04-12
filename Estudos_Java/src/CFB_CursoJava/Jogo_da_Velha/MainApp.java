package CFB_CursoJava.Jogo_da_Velha;
import java.util.Scanner;

public class MainApp {

    public static void LayoutJogo(Campo[][] velha) {//Método visual do Layout do jogo
        LimpandoLayout();

        //Desenhando o Layout do jogo da Velha que vai receber o simbolo de acordo com o que o player for escolhendo na linha e na coluna.
        System.out.println("         0    1   2");
        System.out.printf("0   %c | %c | %c %n", velha[0][0].getSimbolo(), velha[0][1].getSimbolo(), velha[0][2].getSimbolo());
        System.out.println("        ------------");
        System.out.printf("0   %c | %c | %c %n", velha[1][0].getSimbolo(), velha[1][1].getSimbolo(), velha[1][2].getSimbolo());
        System.out.println("        ------------");
        System.out.printf("0   %c | %c | %c %n", velha[2][0].getSimbolo(), velha[2][1].getSimbolo(), velha[2][2].getSimbolo());

    }


    public static void LimpandoLayout() {//Limpando o Game para reinício
        for(int c = 0; c <200; c++) {
            System.out.println("");
        }
    }

    public static String VerifVitoria(Campo[][] velha) {
       


        return " ";
    }

    public static void Main(String[] args) {
    //Definindo atributos importantes para o jogo
    Campo[][] Jogo_Velha = new Campo[3][3]; //Campo do jogo 3x3
    char simboloAtual = 'X'; //Começando pelo X
    boolean game = true; //Condição para manter o jogo enquanto não termina 
    String Vitoria = ""; //Resultado a ser mostrado
    Scanner scan = new Scanner(System.in);
    
    //Estrutura de repetição do jogo
        while (game) {
    
        LayoutJogo(Jogo_Velha);
        Vitoria = VerifVitoria(Jogo_Velha);  
    
            if(!Vitoria.equals("")) {
                System.out.printf("Jogador %s venceu%n", Vitoria );
                break;
            } 
            try {

            }catch(Exception e) {//Expection e = erro, caso não ocorra uma vitória ele irá tentar outros meios para continuar ou dar erro no jogo.
                System.out.printf("Erro");
            }
        }
    }   
}