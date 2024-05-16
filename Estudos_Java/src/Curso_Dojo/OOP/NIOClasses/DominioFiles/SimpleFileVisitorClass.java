package Curso_Dojo.OOP.NIOClasses.DominioFiles;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;


class ListJavaFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if(file.getFileName().toString().endsWith(".java")){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorClass {
    public static void main(String[] args) throws IOException{
        //Visitando todos os arquivos dentro de uma Pasta:
        Path root = Paths.get(".");
        Files.walkFileTree(root, new ListJavaFiles());
    }
}