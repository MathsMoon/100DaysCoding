package Curso_Dojo.OOP.Polymorphism.Dominio;

public abstract class Produto implements Taxavel{
    protected String Nome;
    protected double Valor;

    public Produto(String nome, double valor) {
        Nome = nome;
        Valor = valor;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double valor) {
        Valor = valor;
    }
}