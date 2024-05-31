package Projeto_SistemaAluno.resources.RepositoryData;

import Projeto_SistemaAluno.resources.JavaClasses.Person;
import Projeto_SistemaAluno.resources.JavaClasses.Student;

import java.util.ArrayList;
import java.util.List;

public class DataRepo {
   private static List<Student> studentList = new ArrayList<>();

    private static void setAlunos(Student aluno){
        /*
            A função stream abaixo realiza uma leitura da lista
            buscando qualquer aluno de ID igual ao aluno passado
            caso não exista ele adiciona o novo aluno conforme
            descrito a lista, caso contrário ele retorna uma
            mensagem descrevendo que o aluno já está cadastrado.
         */
        studentList.stream();
    }

    private static void getStudentList(){
        studentList.stream().map(Person::getID).forEach(System.out::println);
    }
}