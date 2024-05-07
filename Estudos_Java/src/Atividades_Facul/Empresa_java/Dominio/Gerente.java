package Atividades_Facul.Empresa_java.Dominio;

public class Gerente extends Empregado{

    private final String DEPARTAMENT_LEADING;
    private double NewSalary;

    public Gerente(String name, int salary, double taxes, String DP) {
        super(name, salary, taxes);
        DEPARTAMENT_LEADING = DP;
    }

    public String getDEPARTAMENT_LEADING() {
        return DEPARTAMENT_LEADING;
    }

    public double getNewSalary() {
        return NewSalary;
    }

//    @Override
//    public double GetAumentoSalario() {
//        double IncreaseSalary = 0.35f;
//        return GetSalario() * IncreaseSalary;
//    }

    @Override
    public void InfoEmpregado() {
        super.InfoEmpregado();
        System.out.println("Departamento Liderado: " + getDEPARTAMENT_LEADING());
        System.out.println("Com acréscimo de Salário: " + getNewSalary());
    }
}