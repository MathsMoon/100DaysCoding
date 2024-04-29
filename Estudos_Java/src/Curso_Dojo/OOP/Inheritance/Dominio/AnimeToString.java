package Curso_Dojo.OOP.Inheritance.Dominio;

public class AnimeToString {
    private String Nome;

    //O override é usado para dar certeza que estamos alterando a função certa
    @Override
    public String toString() {
        return Nome;
    }

    public AnimeToString(String nome) {
        Nome = nome;
    }

//    public void Imprime() {
//
//    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
}
