package CFB_CursoJava.Arquivos_java;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;


public class LearnArchv {
    public static void main(String[] args) throws IOException{
    
        /*  Trabalhando com diretórios  */

        //para criar um path precisa utilizar ou a URL completa da pasta ou arquivo ou seu relativo, estou usando o relativo
        //como também trocar as \ comuns que dividem as seções para /, desta forma deixamos o \ para usar na classe String.
        // Path diretorio = Paths.get("Estudos_Java/src/CFB_CursoJava/Arquivos_java");
        // Path arq = Paths.get("Estudos_Java/src/CFB_CursoJava/Arquivos_java/LearnArchv.java");
        
        // if(Files.isDirectory(diretorio) && Files.exists(arq)) {
        //     System.out.println("Esse diretório existe e o Arquivo também");
        // } else {
        //     System.out.println("Esse diretório NÃO existe nem seu arquivo");
        // }

        //Realizando a leitura de um arquivo
        Path ArchReed = Paths.get("Estudos_Java/src/Anotações.txt");
        List <String> linhas = Files.readAllLines(ArchReed);
        
        // ForEach padrão
        for(String read:linhas) {
            System.out.println(read);
        }

        //ForEach interable, ver melhor uso para ele depois
        // linhas.forEach(read -> System.out.println(linhas));

        
        
        //Por ser uma considerado uma operação de risco o programa me indicou o uso de um Try and cathc
        //Mas também pode ser resolvido com um throw IOExcepetion como está no main()
        // List<String> linhas;
        // try { 
        //     linhas = Files.readAllLines(ArchReed);
        //     for(String read:linhas) {
        //         System.out.println(read);
        //     }
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

    }
}
