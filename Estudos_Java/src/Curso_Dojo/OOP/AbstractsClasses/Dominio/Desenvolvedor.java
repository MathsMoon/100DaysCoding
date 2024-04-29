package Curso_Dojo.OOP.AbstractsClasses.Dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void BonusSalario() {
        Salario = Salario + (Salario * 0.1);
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "Nome='" + Nome + '\'' +
                ", Salario=" + Salario +
                '}';
    }
}
