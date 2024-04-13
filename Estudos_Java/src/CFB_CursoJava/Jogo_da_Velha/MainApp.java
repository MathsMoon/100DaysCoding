package CFB_CursoJava.Jogo_da_Velha;
import java.util.Scanner;

public class MainApp {

    public static void LayoutJogo(Campo[][] velha) {//Método visual do Layout do jogo
        //Desenhando o Layout do jogo da Velha que vai receber o simbolo de acordo com o que o player for escolhendo na linha e na coluna.
		System.out.printf("0 %c | %c | %c %n",velha[0][0].getSimbolo(),velha[0][1].getSimbolo(),velha[0][2].getSimbolo());
		System.out.printf("1 %c | %c | %c %n",velha[1][0].getSimbolo(),velha[1][1].getSimbolo(),velha[1][2].getSimbolo());
		System.out.printf("2 %c | %c | %c %n",velha[2][0].getSimbolo(),velha[2][1].getSimbolo(),velha[2][2].getSimbolo());
    }


    public static void LimpandoLayout() {//Limpando o Game para reinício
        for(int c = 0; c <200; c++) {
            System.out.println("");
        }
    }

    public static char VerifyVitoria(Campo[][] velha) {//Verificando qual jogador ganhou 
        for(int i=0;i<3;i++){//Preciso rever esse código que peguei de um dos alunos, ele fez de uma maneira mais bruta possível, encontrando as combinações possíveis
			if((velha[i][0].getSimbolo()=='X' && velha[i][1].getSimbolo()=='X' && velha[i][2].getSimbolo()=='X')||(velha[i][0].getSimbolo()=='O' && velha[i][1].getSimbolo()=='O' && velha[i][2].getSimbolo()=='O')){
				return velha[i][0].getSimbolo();
			}
		}
		for(int i=0;i<3;i++){
			if((velha[0][i].getSimbolo()=='X' && velha[1][i].getSimbolo()=='X' && velha[2][i].getSimbolo()=='X')||(velha[0][i].getSimbolo()=='O' && velha[1][i].getSimbolo()=='O' && velha[2][i].getSimbolo()=='O')){
				return velha[0][i].getSimbolo();
			}
		}
		if((velha[0][0].getSimbolo()=='X' && velha[1][1].getSimbolo()=='X' && velha[2][2].getSimbolo()=='X')||(velha[0][2].getSimbolo()=='O' && velha[1][1].getSimbolo()=='O' && velha[2][0].getSimbolo()=='O')){
			return velha[0][0].getSimbolo();
		}
		return ' ';
    }


    public static void IniciarJogo(Campo[][] velha) {//Método que Inicia de fato o jogo
        for (int l = 0; l<3; l++) {
            for (int c = 0; c<3; c++) {
                velha[l][c] = new Campo();
            }
        }
    }


    public static int[] Jogar(Scanner scan, char sa) {//Método do jogo em si, recebe os valores do jogador e vai fazer a verificação da jogada com o outro método
        int p[] = new int[2];
        // int[] p = new int[2]; As duas formas estão certas
        
        System.out.printf("%s %c%n", "Quem joga: ", sa);
        System.out.print("Informe a Linha: ");
        p[0] = scan.nextInt();
        System.out.print("Informe a Coluna: ");
        p[1] = scan.nextInt();

        return p; //Retorna o valor da Array contendo Linha e Coluna
    }


    public static boolean VerifyJogada(Campo[][] velha, int[] p, char simboloAtual) {//Verificação se a jogada é válida
       //Condição a qual a posição e a coluna escolhidas pelo usuário estão livres para p mesmo marcar
       if(velha[p[0]][p[1]].getSimbolo() == ' ') {
        velha[p[0]][p[1]].setSimbolo(simboloAtual);
        return true;
       } else {
        return false;
       }
    }

    public static void main(String[] args) {

        //Definindo atributos importantes para o jogo
        Campo[][] Jogo_Velha = new Campo[3][3]; //Campo do jogo 3x3
        char simboloAtual = 'X'; //Começando pelo X
        boolean game = true; //Condição para manter o jogo enquanto não termina 
        char Vitoria = ' '; //Resultado a ser mostrado
        Scanner scan = new Scanner(System.in);
    

        //Iniciando o Jogo em si
        IniciarJogo(Jogo_Velha);


        //Estrutura de repetição do jogo
        while (game) {
    
        LayoutJogo(Jogo_Velha);
        Vitoria = VerifyVitoria(Jogo_Velha);  
    
            if(Vitoria!=(' ')) {
                System.out.printf("Jogador %s venceu%n", Vitoria );
                game = false;
                break;
            } 
            try {
                if(VerifyJogada(Jogo_Velha, Jogar(scan, simboloAtual), simboloAtual)) {
                    if(simboloAtual == 'X') {
                        simboloAtual = 'O';
                    } else {
                        simboloAtual = 'X';
                    }
                }
            }catch(Exception e) {//Expection e = erro, caso não ocorra uma vitória ele irá tentar outros meios para continuar ou dar erro no jogo.
                System.out.print("ERRO durante a execução do jogo!\nErro:"+e); //Diz o erro e mostra onde foi com o e.
            }
        }
        System.out.printf("Fim do jogo");
    }   
}