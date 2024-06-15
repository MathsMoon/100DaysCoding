package Curso_Dojo.JDBC.CRUD.Service;

import Curso_Dojo.JDBC.CRUD.Dominio.Aluno;
import Curso_Dojo.JDBC.CRUD.Repository.AlunoRepository;

import java.util.Optional;
import java.util.Scanner;

public class AlunoService {
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
        System.out.println("Insira o nome do Aluno");
        String nome = SCANNER.nextLine();
        System.out.println("Insira o endereço do Aluno");
        String endereco = SCANNER.nextLine();
        System.out.println("Insira o telefone do Aluno");
        String telefone = SCANNER.nextLine();
        System.out.println("Insira a stiuação do Aluno");
        String situacao = SCANNER.nextLine();
        AlunoRepository.save(buildingAluno(nome, endereco, telefone, situacao));
    }

    private static Aluno buildingAluno(String nome, String endereco, String telefone, String situacao) {
        return Aluno.builder().nome_Aluno(nome).endereco_Aluno(endereco).telefone_Aluno(telefone).situacao_Aluno(situacao).build();
    }


    private static void findByName(){
        System.out.println("Insira o nome que deseja Pesquisar: ");
        String name = SCANNER.nextLine(); //Verificar se retorna nullo ou "";
        AlunoRepository.
                findByName(name).
                forEach(p -> System.out.printf("[%d] - %s%n",p.getID_Aluno(), p.getNome_Aluno()));
    }

    private static void delete(){
        System.out.println("Insira o ID do Aluno que deseja Deletar");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.printf("\nDeseja deletar o id %d? (S/N)\n", id);
        String choice = SCANNER.nextLine();
        if (choice.toLowerCase().startsWith("s")){
            AlunoRepository.delete(id);
        }
    }

    private static void update(){
        System.out.println("Insira o ID do alunoFromDb para modificar: ");
        Optional<Aluno> optionalAluno = AlunoRepository.findByID(Integer.parseInt(SCANNER.nextLine()));
        if(optionalAluno.isEmpty()){
            System.out.println("ID do Aluno não encontrado, insira um valor válido.");
            return;
        }
        //Caso avance:
        Aluno alunoFromDb = optionalAluno.get();
        System.out.println("Aluno encontrado: "+ alunoFromDb);
        System.out.println("Insira o Novo nome ou corrija: ");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? alunoFromDb.getNome_Aluno() : name;
        Aluno aluno = Aluno.builder().nome_Aluno(name).ID_Aluno(alunoFromDb.getID_Aluno()).build();
        AlunoRepository.update(aluno);
    }
}