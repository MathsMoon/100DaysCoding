package Curso_Dojo.OOP.NIOClasses.DominioFiles;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathClass {
    public static void main(String[] args) {
        //Formas de pegar os Paths com a classe PATH:
        Path p1 = Paths.get("Estudos_Java/src/Curso_Dojo/OOP/IOClasses/Archive_Stories/text.txt");
        Path p2 = Paths.get("Estudos_Java", "src/Curso_Dojo/OOP/IOClasses/Archive_Stories/text.txt");
        Path p3 = Paths.get("Estudos_Java","src","Curso_Dojo","OOP","IOClasses","Archive_Stories","text.txt");
        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
    }
}