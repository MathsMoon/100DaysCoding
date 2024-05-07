package Atividades_Facul.Empresa_java.Dominio;

public class Telefonista extends Empregado{

    private double NewSalary;

    public Telefonista(String name, int salary, double taxes) {
        super(name, salary, taxes);
    }

    public double getNewSalary() {
        return NewSalary;
    }

    @Override
    public void GetAumentoSalario() {
        double IncreaseSalary = 0.02f;
        NewSalary = Salario_Bruto + (Salario_Bruto * IncreaseSalary);
    }

    @Override
    public void InfoEmpregado() {
        super.InfoEmpregado();
        System.out.println("Com acréscimo de Salário: " + getNewSalary());
    }
}