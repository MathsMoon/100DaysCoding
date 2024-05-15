package Curso_Dojo.OOP.NIOClasses.DominioFiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAtribute1Class {
    public static void main(String[] args) throws IOException {
        //BasicFileAttributes, DosFileAttributes, PosixFileAttributes
        LocalDateTime date = LocalDateTime.now().minusDays(10);
        File file = new File("Estudos_Java/src/Curso_Dojo/OOP/NIOClasses/Home/dev/novo.txt");
        boolean isFileCreated = file.createNewFile();
        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

        System.out.println("Arquivo criado? "+ isFileCreated);
        System.out.println("Arquivo foi modificado? "+isModified);


        //Mesmo procedimento com a classe NIO
        Path path1 = Paths.get("Estudos_Java/src/Curso_Dojo/OOP/NIOClasses/Home/dev/novo2.txt");
        Files.createFile(path1);
        FileTime time = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path1,time);

        System.out.println("Arquivo criado? "+ Files.exists(path1));
        System.out.println("Arquivo foi modificado? "+ Files.getLastModifiedTime(path1));
    }
}