package Curso_Dojo.OOP.NIOClasses.DominioFiles;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherClass {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta/subpasta/file.bkp");
        Path path2 = Paths.get("pasta/subpasta/file.txt");
        Path path3 = Paths.get("pasta/subpasta/file.java");
        pathmatches(path1, "glob:*.bkp"); //Considera também tudo anterior aos arquivos
        pathmatches(path1, "glob:**.bkp"); //Considera apenas os arquivos que terminam em .php
        pathmatches(path1, "glob:**/*.bkp"); //Outra forma do **, com a diferença é que é possível alterar o /*
        pathmatches(path2, "glob:**/*.{bkp,txt,java}"); //Forma de Agregamento que busca arquivos de final php,txt ou java
        pathmatches(path3, "glob:**/*.???"); //Busca por arquivos que tem uma extensão de 3 letras.
    }

    private static void pathmatches(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": "+matcher.matches(path));
    }
}