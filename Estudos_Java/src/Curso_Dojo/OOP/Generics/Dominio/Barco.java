package Curso_Dojo.OOP.Generics.Dominio;

public class Barco {
    private String Nome;

    public Barco(String nome) {
        Nome = nome;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "Nome='" + Nome + '\'' +
                '}';
    }

    public String getNome() {
        return Nome;
    }
}