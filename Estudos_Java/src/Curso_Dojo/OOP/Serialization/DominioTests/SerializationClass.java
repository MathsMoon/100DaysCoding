package Curso_Dojo.OOP.Serialization.DominioTests;

import Curso_Dojo.OOP.Serialization.Dominio.Aluno;
import Curso_Dojo.OOP.Serialization.Dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationClass {

    private static void Serialize(Aluno aluno){
        Path path = Paths.get("Estudos_Java/src/Curso_Dojo/OOP/Serialization/SerFiles/aluno.ser");
        try (ObjectOutput oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void Deserialize(){
        Path path = Paths.get("Estudos_Java/src/Curso_Dojo/OOP/Serialization/SerFiles/aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Aluno ObjAluno =(Aluno) ois.readObject();
        }catch (IOException | ClassNotFoundException e ){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno(1, "Makoto Naegi", "72111112101");

        //Adicionando turma como uma classe não Serializavél para ser serializada
        Turma turma = new Turma("Class 1-A");
        aluno.setTurma(turma);


        Serialize(aluno);
        Deserialize();
        System.out.println(aluno);
    }
}