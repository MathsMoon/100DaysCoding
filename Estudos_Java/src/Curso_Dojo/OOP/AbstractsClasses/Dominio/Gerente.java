package Curso_Dojo.OOP.AbstractsClasses.Dominio;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void BonusSalario() {
        Salario = Salario + (Salario * 0.15);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "Nome='" + Nome + '\'' +
                ", Salario=" + Salario +
                '}';
    }
}