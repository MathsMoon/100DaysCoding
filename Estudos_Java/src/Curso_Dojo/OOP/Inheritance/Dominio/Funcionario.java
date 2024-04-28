package Curso_Dojo.OOP.Inheritance.Dominio;

public class Funcionario extends Pessoa{
    private String Empresa;
    private double salario;

    @Override
    public void Imprime() {
        System.out.println("Watashi no na wa: " + getNome());
        System.out.println("CPF: " + getCPF());
        getEndereco().Imprime();
        System.out.println("shigoto wa: " + getEmpresa());
        System.out.println("Salário: " + getSalario());
    }

    public void RelatorioPagamento() {
        System.out.println("Eu " + Nome + " " + salario);
    }


    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}