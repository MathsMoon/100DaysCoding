package Curso_Dojo.OOP.NIOClasses.DominioFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAtribute2Class {
    /*
        Revisar esta aula para poder pegar melhor os conceitos do BasicFile
        150
     */
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("Estudos_Java/src/Curso_Dojo/OOP/NIOClasses/Home/dev/text3.txt");
        BasicFileAttributes BFA = Files.readAttributes(path1, BasicFileAttributes.class);
        FileTime ft1 = BFA.creationTime();
        FileTime ft2 = BFA.lastAccessTime();
        FileTime ft3 = BFA.lastModifiedTime();

        System.out.println("Creation Time: "+ ft1);
        System.out.println("Last Access Time: "+ ft2);
        System.out.println("Last Modified Time: "+ ft3);

        BasicFileAttributeView BFAV = Files.getFileAttributeView(path1, BasicFileAttributeView.class);
        FileTime ft = FileTime.fromMillis(System.currentTimeMillis());
        BFAV.setTimes(ft2, ft, ft1);
    }
}