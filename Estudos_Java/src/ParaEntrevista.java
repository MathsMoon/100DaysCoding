public class ParaEntrevista {

    /*

    Olá, seja bem-vindo ao meu repositório de estudos, abaixo resolvi as questões para a entrevista usando métodos 
    no java, que é a linguagem que estou aprendendo. 
    Se quiser ver meu progresso nos estudos basta ver o ReadMe da aba principal (Meu diário de programador do desafio 100DaysCode) 
    ou entrar nas pastas dentro do src.
    
    */


    public static void ProcessoLoop() {//1 - Processo de Loop
        //Definindo parâmetros para o Loop
        int indice = 13, soma = 0;

        for (int k = 0; k<indice; k++) {
            soma++;
        }
        System.out.printf("A soma final ficou: %d%n", soma);
    }

    public static void Fibonnaci(int n1) {//2 - Código para Fibonnaci.
        //Até a 20 sequência em Fibonnaci
        int limit = 20;

        long[] series = new long[limit];

        //Series recebem os valores iniciais para dar sequência ao cálculo
        series[0] = 0;
        series[1] = 1;

        //Cálculo da Fibonnaci feito com a recepeção de 2 números do usuário
        for(int i=2; i < limit; i++){
            series[i] = series[i-1] + series[i-2];
        }

        //Crie abaixo um verify para saber se n1 pertence a sequência
        
    }
    public static void IncrementoNum() {//3 - Lógica de incremento.

    }

    public static void LogicLamp() {   //4 - Lógica para Lâmpadas.

    }

    public static void ReversingString(String n) {//5 - Inversão de String.
        
    }

    public static void main (String[] args) {
       //Métodos para Mostrar os resultados: 
        ProcessoLoop();
        Fibonnaci(0);
    }
}