package Atividades_Facul.POO.AccountSys.BankAccount;

public class ContaCorrente extends Conta{
    private double Limite;

    public ContaCorrente(){}

    public ContaCorrente(double limite) {
        super();
        Limite = limite;
    }

    public double getLimite() {
        return Limite;
    }

    public void setLimite(double limite) {
        Limite = limite;
    }

    @Override
    public void UserInfo() {
        super.UserInfo();
        System.out.println("Limite da Conta: "+getLimite());
    }
}