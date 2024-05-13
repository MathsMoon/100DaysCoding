package Curso_Dojo.OOP.IOClasses.DominioFiles;

import java.io.*;

public class FileBufferedReaderClass {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr))   {
            //Diferente do Reader, ele consegue ler linhas inteiras tornando mais fácil a leitura do conteúdo do arquivo
            String Line;
            while ((Line = br.readLine()) != null){
                System.out.println(Line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}