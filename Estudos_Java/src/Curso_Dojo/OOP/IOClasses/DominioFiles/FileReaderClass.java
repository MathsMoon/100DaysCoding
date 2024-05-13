package Curso_Dojo.OOP.IOClasses.DominioFiles;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file)) {
            //Para realizar leitura do arquivo, utiliza o incremento e enquanto o valor for diferente de -1
            //o arquivo realiza a leitura convertendo o char de número da tabela ASCII, assim retornando o texto do Arquivo
           int i;
           while ((i=fr.read()) != -1){
               System.out.print((char)i);
           }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}