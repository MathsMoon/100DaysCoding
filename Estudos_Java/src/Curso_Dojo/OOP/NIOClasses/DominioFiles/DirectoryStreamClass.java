package Curso_Dojo.OOP.NIOClasses.DominioFiles;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamClass {
    public static void main(String[] args) {
        //Listando todos os arquivos de um Diretório utilizando a Stream
        Path dir = Paths.get(".");
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
            for (Path path: stream){
                System.out.println(path.getFileName());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}