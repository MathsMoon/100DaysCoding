package Curso_Dojo.OOP.IOClasses.DominioFiles;

import java.io.*;

public class FileBufferedWriterClass {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file);
            BufferedWriter br = new BufferedWriter(fw)){
            br.write("Outro texto aleatório para escrever");
            br.newLine();
            br.write("Escrevendo mais uma linha apenas para cumprir tabela e ter mais coisas");
            br.newLine();
            br.write("Desta forma meu BufferedReader mais facilmente lerá tudo do que o reader comum");
            br.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}