package Curso_Dojo.OOP.NIOClasses.DominioFiles;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeClass {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/william");
        Path classe = Paths.get("/home/william/pasta3/OlaMundo.java");
        Path PathToClass = dir.relativize(classe);
        System.out.println(PathToClass);

        Path absoluto1 = Paths.get("/home/william");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/william/pasta3/OlaMundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.2137921");

        System.out.println("1 "+ absoluto1.relativize(absoluto3));
        System.out.println("2 "+ absoluto3.relativize(absoluto1));
        System.out.println("3 "+ absoluto1.relativize(absoluto2));
        System.out.println("4 "+ absoluto2.relativize(absoluto1));
        System.out.println("5 "+ relativo1.relativize(relativo2));
        System.out.println("6 "+ relativo2.relativize(relativo1));
    }
}