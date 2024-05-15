package Curso_Dojo.OOP.NIOClasses.DominioFiles;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolvePathClass {
    public static void main(String[] args) {
        //Resolvendo Paths convergindo os diretórios para organizarem em hierarquia
        Path dir = Paths.get("home/william");
        Path arquivo = Paths.get("dev/arquivo.txt");
        Path resolve = dir.resolve(arquivo);

        System.out.println(resolve);

        Path absolute = Paths.get("/home/william");
        Path relative = Paths.get("dev");
        Path resolve2 = absolute.resolve(relative);

        System.out.println(resolve2);
    }
}