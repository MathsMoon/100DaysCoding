package Curso_Dojo.OOP.NIOClasses.DominioFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.*;
import java.util.Set;

public class PosixFileAttributesClass {
    /*
        Importante revisão para mexer com arquivos para o sistema Linux.
        aula 152
     */
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("Estudos_Java/src/Curso_Dojo/OOP/NIOClasses/PastasTests/Home/Teste02.txt");
        PosixFileAttributes pfav = Files.readAttributes(path, PosixFileAttributes.class);

        System.out.println(pfav.permissions());
        PosixFileAttributeView setPfav = Files.getFileAttributeView(path, PosixFileAttributeView.class);
        Set<PosixFilePermission> posixFilePermissions = PosixFilePermissions.fromString("rw-rw-rw-");
        setPfav.setPermissions(posixFilePermissions);
        System.out.println(setPfav.readAttributes().permissions());
    }
}