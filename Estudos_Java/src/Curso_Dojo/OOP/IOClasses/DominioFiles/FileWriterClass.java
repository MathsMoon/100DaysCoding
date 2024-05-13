package Curso_Dojo.OOP.IOClasses.DominioFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {
    public static void main(String[] args) {
        File file = new File("file.txt");
        //Pelo FileWriter ser uma classe cloaseble ela pode ser usada com o Try with resources
        //O Append permite que o arquivo seja reescrito sem a necessidade do sistema ter que deletar o conteúdo pra colocar as alterações
        try (FileWriter fw = new FileWriter(file, true)){
            fw.write("A, é a primeira letra do alfabeto que coloquei para saber sua posição ASCII");
            fw.flush();//Comando que vai jogar tudo que estiver no write ou buffer para fechar a função
            System.out.println("Arquivo Criado? "+ file.exists());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}