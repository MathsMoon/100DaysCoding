package Curso_Dojo.OOP.Trowables.RunTimeTest;

import Curso_Dojo.OOP.Trowables.ExceptionsTest.Dominio.ReaderArchive1;
import Curso_Dojo.OOP.Trowables.ExceptionsTest.Dominio.ReaderArchive2;

import java.io.*;

public class TestRunTimeWtResources {
    public static void main(String[] args) {
        ReadingArchive();
    }

    /*
        Utilizando o Try with resources, diminuindo o tamanho do Try já colocando dentro do () do Try
        as condições necessárias para tentar executar. No exemplo Abaixo temos a implementação deste
        try, para funcionar é necessário a utilização do Closeable que fecha o método usado do reading
        para fecha-lo sem a necessidade de implementar o finally e um try caso ele não seja nulo, pode-
        se utilizar então uma classe quee já implementa está função de fechar a função independente
        de qualquer outro parâmetro, então o Reader faz a implementação da classe Cloeable que possui
        esta função e declara dentro do resources do Try, assim fechando o método lendo ou não o arqui-
        vo.
    */
    public static void ReadingArchive() {
        try (ReaderArchive1 r1 = new ReaderArchive1();
             ReaderArchive2 r2 = new ReaderArchive2()){
            Reader readingfiles = null;

            readingfiles = new BufferedReader(new FileReader("Estudos_Java/src/Curso_Dojo/OOP/Trowables/ExceptionsTest/NewRepository/HelloWorld.java"));
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}