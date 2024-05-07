package Atividades_Facul.Empresa_java.Dominio;

public class Empregado {

    protected final String nome;
    protected final double Salario_Bruto;
    protected final double Tax;

   public Empregado (String name, int salary, double taxes) {
     this.nome = name;
     this.Salario_Bruto = salary;
     this.Tax = taxes;
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

   //Duas funções abaixo serão reescritas.
   public void GetAumentoSalario() {} //Rever depois esta funçõa para mostra o aumento no Salário atual com um bônus comum de cada 1.

   public void InfoEmpregado() {
    System.out.println("-------------------------------");
    System.out.printf("%nSeu nome é: %s", GetNome());
    System.out.printf("%nSeu Salário Bruto atual é: %.2f", GetSalario());
    System.out.printf("%nVocê paga: R$%.2f em taxas%n", GetTax());
   } 
}