package Curso_Dojo.JDBC.CRUD.Service;

import Curso_Dojo.JDBC.CRUD.Dominio.Professor;
import Curso_Dojo.JDBC.CRUD.Repository.ProfessorRepository;

import java.util.Optional;
import java.util.Scanner;

public class ProfessorService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int op){
        switch (op){
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
            default -> throw new IllegalArgumentException("Not a valid option");
        }
    }

    private static void save(){
        System.out.println("Insira o nome do Professor");
        String nome = SCANNER.nextLine();
        System.out.println("Insira o endereço do Professor");
        String endereco = SCANNER.nextLine();
        System.out.println("Insira o telefone do Professor");
        String telefone = SCANNER.nextLine();
        ProfessorRepository.save(buildingProfessor(nome, endereco, telefone));
    }

    private static Professor buildingProfessor(String nome, String endereco, String telefone) {
        return Professor.builder().nome_Professor(nome).endereco_Professor(endereco).telefone_Professor(telefone).build();
    }


    private static void findByName(){
        System.out.println("Insira o nome que deseja Pesquisar: ");
        String name = SCANNER.nextLine(); //Verificar se retorna nullo ou "";
        ProfessorRepository.
                findByName(name).
                forEach(p -> System.out.printf("[%d] - %s%n",p.getID_Professor(), p.getNome_Professor()));
    }

    private static void delete(){
        System.out.println("Insira o ID do Professor que deseja Deletar");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.printf("\nDeseja deletar o id %d? (S/N)\n", id);
        String choice = SCANNER.nextLine();
        if (choice.toLowerCase().startsWith("s")){
            ProfessorRepository.delete(id);
        }
    }

    private static void update(){
        System.out.println("Insira o ID do professorFromDb para modificar: ");
        Optional<Professor> optionalProfessor = ProfessorRepository.findByID(Integer.parseInt(SCANNER.nextLine()));
        if(optionalProfessor.isEmpty()){
            System.out.println("ID do Professor não encontrado, insira um valor válido.");
            return;
        }
        //Caso avance:
        Professor alunoFromDb = optionalProfessor.get();
        System.out.println("Professor encontrado: "+ alunoFromDb);
        System.out.println("Insira o Novo nome ou corrija: ");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? alunoFromDb.getNome_Professor() : name;
        Professor aluno = Professor.builder().nome_Professor(name).ID_Professor(alunoFromDb.getID_Professor()).build();
        ProfessorRepository.update(aluno);
    }
}