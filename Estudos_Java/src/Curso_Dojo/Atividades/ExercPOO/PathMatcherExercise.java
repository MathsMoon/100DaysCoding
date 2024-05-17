package Curso_Dojo.Atividades.ExercPOO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

//Criando esta classe consigo colocar os arquivos em uma Stream de Paths e ler individualmente cada um.
class FindAllTestsJavaClasses extends SimpleFileVisitor<Path>{
    //Declarando a variável matcher que irá ser o padrão de pesquisa para os arquivos que possuem Test e são java.
    private final PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Test*}.{java,class}");

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        //o visitFile observa cada arquivo da Path e retorna todos que dão match com o glob destacado
        if(matcher.matches(file)){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}



public class PathMatcherExercise {
    public static void main(String[] args) throws IOException{
        //Criando um root que recebe toda a pasta do 100DaysCoding
        Path root = Paths.get(".");
        Files.walkFileTree(root, new FindAllTestsJavaClasses()); //Função que permite correr por toda a árvore de arquivos do root
    }
}