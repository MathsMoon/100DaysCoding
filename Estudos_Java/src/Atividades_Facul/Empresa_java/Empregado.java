package Atividades_Facul.Empresa_java;

public class Empregado {

    private String nome;
    private double Salario_Bruto;
    private double Tax;
    private double NovoSalario;

   public Empregado (String n, int sb, double tax) {
     this.nome = n;
     this.Salario_Bruto = sb;
     this.Tax = tax;
   }
    
   public String GetNome() {
     return this.nome;
   }

   public double GetSalario() {
     return this.Salario_Bruto;
   }

   public double GetTax() {
     return this.Tax;
   }

   public void AumentoSalario(boolean n) {
     if (n) {
        this.NovoSalario = this.Salario_Bruto + (this.Salario_Bruto * 0.1);
        System.out.println("-------------------------------");
        System.out.printf("O Novo Salário bruto é de: %.2f%n", this.NovoSalario);
     }
   }

   public void InfoEmpregado() {
    System.out.println("-------------------------------");
    System.out.printf("%nSeu nome é: %s", this.nome);
    System.out.printf("%nSeu Salário Bruto atual é: %.2f", this.Salario_Bruto);
    if(NovoSalario == 0) {
        System.out.printf("%nNão houve aumento no Salário%n");
    }
    System.out.printf("%nVocê paga: R$%.2f em taxas%n", this.Tax);
   } 
}
