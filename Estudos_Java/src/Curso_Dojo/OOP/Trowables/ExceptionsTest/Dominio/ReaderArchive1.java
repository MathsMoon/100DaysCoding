package Curso_Dojo.OOP.Trowables.ExceptionsTest.Dominio;

import java.io.Closeable;
import java.io.IOException;

public class ReaderArchive1 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Fechando Leitor 1");
    }
}
