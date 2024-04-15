package CFB_CursoJava.Arquivos_java;
import java.io.IOException;
import java.nio.file.*;


public class Copy_Bytes {
    public static void main(String[] args) throws IOException{
        
        //Criando os Paths da foto antiga e a nova
        Path NewImg = Paths.get("Estudos_Java/src/CFB_CursoJava/Arquivos_java/Tests_Imgs/Hutao_discord.jpg");
        Path OldImg = Paths.get("Estudos_Java/src/CFB_CursoJava/Arquivos_java/Tests_Imgs/Literalmente eu.jpeg");

        //Criando um Array de Bytes para guardar a NewImg
        byte[] bytesNewImg = Files.readAllBytes(NewImg);

        //Realizando a leitura dos bytes e inserindo dentro da OldImg
        Files.write(OldImg, bytesNewImg);

        
        //Resultado está na pasta Estudos_Java\src\CFB_CursoJava\Arquivos_java\Tests_Imgs


        //Por estar usando o IOException é necessário o Try, vai estar aqui apenas por aprendizado.
        // try {
        //     byte[] bytesNewImg = Files.readAllBytes(NewImg);
        //     Files.write(OldImg, bytesNewImg);
        // } catch (Exception e) {
        //     System.out.println("Erro");
        // }
    }
}
