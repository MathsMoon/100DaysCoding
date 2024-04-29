package Curso_Dojo.OOP.AbstractsClasses.Dominio;

//A classe Abstrata cria um template para ser usado, sendo ela apenas um meio para desenvolver outras classes
public abstract class Funcionario extends  Pessoa{
    protected String Nome;
    protected double Salario;

    public Funcionario(String nome, double salario) {
        Nome = nome;
        Salario = salario;
        BonusSalario();
    }

    public abstract void BonusSalario();

    @Override
    public void Imprime() {
        System.out.println("Imprimindo...");
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "Nome='" + Nome + '\'' +
                ", Salario=" + Salario +
                '}';
    }
}