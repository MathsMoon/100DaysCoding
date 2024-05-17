package Curso_Dojo.OOP.IOClasses;

import java.io.File;
import java.io.IOException;

public class FileDirectoryClass {
    public static void main(String[] args) throws IOException {
        //Criando diretório
        File filedirectory = new File("Folder");
        boolean isDirectoryCreated = filedirectory.mkdir();
        System.out.println("O Diretório foi criado? "+ isDirectoryCreated);

        //Criando arquivo para guardar no diretório
        File file = new File(filedirectory.getPath(), "Arquivo.txt");
        boolean isFileCreated = file.createNewFile();
        System.out.println("Arquivo foi criado? "+ isFileCreated);

        //Renomeando arquivo do diretório
        File filerenamed = new File(filedirectory, "outronome.txt");
        boolean isRenamed = file.renameTo(filerenamed);
        System.out.println("Arquivo foi renomeado? "+ isRenamed);
    }
}