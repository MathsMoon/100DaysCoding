public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        int nota1 = 7, nota2 = 7, nota3 = 5, nota4 = 8;
        float media = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.println("Sua média é: " + media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if ( media > 5.9 && media < 7 ) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        
        int pontoextra = (int) (media/7);

        /* 
        A ideia aqui é para o pontoextra ser o que falta para o aluno sair da recuperação
         então reveja como isso é possível amanhã.


        switch (pontoextra) {
            case 1:
                System.out.println("Para passar precisa de 1 ponto");
                break;
            case 2:
                System.out.println("Para passar precisa de 2 pontos");
                break;
            default:
                System.out.println("Não tem ponto suficiente");
                break;
                */
        }
    }   
}