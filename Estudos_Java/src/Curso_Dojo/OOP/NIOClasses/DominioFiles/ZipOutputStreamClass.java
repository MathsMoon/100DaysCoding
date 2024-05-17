package Curso_Dojo.OOP.NIOClasses.DominioFiles;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamClass {

    private static void zip(Path arquivoZip, Path arquivosparazipar){
        //Função Try que cria tanto um ZipStream para realizar o recebimento do arquivo para zipar
        //Como do directory stream para ler tudo do diretório alvo
        try(ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosparazipar)){

            //Comando for que vai lendo cada arquivo do diretório.
                for(Path file:directoryStream){
                    ZipEntry zipEntry = new ZipEntry(file.getFileName().toString()); //Cria uma entrada com o arquivo alvo
                    zipStream.putNextEntry(zipEntry); //Prepara o zip com o arquivo alvo
                    Files.copy(file,zipStream); //Transcreve o arquivo alvo para o arquivo preparado dentro do zio
                    zipStream.closeEntry(); //termina o processo de cópia
                }
            System.out.println("Arquivo Zip criado com Sucesso!");

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //Definindo o nome do arquivo zip e os conteúdos da pasta que ele irá copiar e zipar
        Path zip = Paths.get("Estudos_Java/src/Curso_Dojo/OOP/NIOClasses/PastasTests/arq.zip");
        Path arquivosparazipar = Paths.get("Estudos_Java/src/Curso_Dojo/OOP/NIOClasses/PastasTests/subpasta1/subsubpasta1");
        zip(zip,arquivosparazipar);
    }
}