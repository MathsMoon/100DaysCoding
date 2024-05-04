package Curso_Dojo.OOP.Trowables.ExceptionsTest.Dominio;

import java.io.Closeable;
import java.io.IOException;

public class ReaderArchive2 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Fechando Leitor 2");
    }
}
