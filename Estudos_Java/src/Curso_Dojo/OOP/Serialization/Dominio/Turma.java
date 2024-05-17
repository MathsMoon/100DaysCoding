package Curso_Dojo.OOP.Serialization.Dominio;

public class Turma {
    private String Nome;

    public Turma(String nome) {
        Nome = nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
}