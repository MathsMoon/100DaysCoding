package CFB_CursoJava;

public class BreakAndContinue {
    public static void main(String[] args) {
        
        int cont = 100;

        for (int i = 0; i<cont; i++) {
            if(i >= 10 && i<=60) {
                continue; 
                //O código ira do 0 ao 9 e depois voltará no 61, já que essas condições são false
                //o código continuará a ser executado mas não mostrará o sout enquanto a condição for true.  
            }
            System.out.printf("%d - ", i);
        }

        /*
          
        O conceito do break é: A interação irá acontecer até o ponto que 
        ela seja true. assim o código em si é finalizado na hora que a condição é preenchida.
        
        O conceito do Continue é: apenas as condições false são executadas enquanto o código roda por completo.
        
        */


    }    
}
