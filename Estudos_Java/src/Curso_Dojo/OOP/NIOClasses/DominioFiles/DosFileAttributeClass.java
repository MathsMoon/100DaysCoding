package Curso_Dojo.OOP.NIOClasses.DominioFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributeClass {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("Estudos_Java/src/Curso_Dojo/OOP/NIOClasses/PastasTests/Home/teste.txt");
        if(Files.notExists(path)) {
            Files.createFile(path);
        }
        //Colocando atributos ao Arquivo do Path
        Files.setAttribute(path,"dos:hidden", true); //Ocultando o Arquivo
        Files.setAttribute(path, "dos:readonly", true); //Deixando o Arquivo como leitura

        //Usando o DosFileAttributeView
        DosFileAttributeView dfav = Files.getFileAttributeView(path, DosFileAttributeView.class);
        dfav.setHidden(true);
        dfav.setReadOnly(true);

        //Para mostrar os resultados tanto pode ser usado o DFA como o DFAV com o readAttributes.
        DosFileAttributes dfa = Files.readAttributes(path, DosFileAttributes.class);
        System.out.println("Arquivo está oculto? "+ dfav.readAttributes().isHidden());
        System.out.println("O arquivo é apenas de leitura? "+dfav.readAttributes().isReadOnly());
        System.out.println("última vez acessado: "+ dfav.readAttributes().lastAccessTime());
        System.out.println("última vez modificado: "+ dfav.readAttributes().lastModifiedTime());
    }
}