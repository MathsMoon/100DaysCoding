package Curso_Dojo.OOP.Methods.Dominio.Associacao2;

public class Escola {
    private String Nome;
    private Professor[] professors;

    public Escola(String nome) {
        Nome = nome;
    }
    //fazendo a sobrecarga do construtor:
    public Escola(String nome, Professor[] professores) {
        Nome = nome;
        professors = professores;
    }


    public void Imprime() {
        System.out.println(Nome);
        if(professors == null) {
            return;
        }
        for (Professor professor: professors) {
            System.out.println(professor.getNome());
        }
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Professor[] getProfessors() {
        return professors;
    }

    public void setProfessors(Professor[] professors) {
        this.professors = professors;
    }
}
