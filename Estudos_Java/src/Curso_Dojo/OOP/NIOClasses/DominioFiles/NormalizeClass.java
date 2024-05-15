package Curso_Dojo.OOP.NIOClasses.DominioFiles;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeClass {
    public static void main(String[] args) {
        //Normalizando arquivo para dentro do diretórios com várias pastas:
        String diretorioProjeto = "home/william/dev";
        String arquivoTXT = "../../arquivo.txt";

        Path p1 = Paths.get(diretorioProjeto, arquivoTXT);
        System.out.println(p1);
        System.out.println(p1.normalize());
    }
}