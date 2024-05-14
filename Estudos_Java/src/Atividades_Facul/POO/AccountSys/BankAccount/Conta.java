package Atividades_Facul.POO.AccountSys.BankAccount;

import java.util.Random;

public class Conta {
    private final Random rd = new Random();
    private String UserName;
    private int ID;
    private String Agencia;
    private double Saldo;

    public Conta(){}

    public Conta(String userName, double saldo) {
        UserName = userName;
        int num1 = rd.nextInt(1000);
        int num2 = rd.nextInt(10);
        Agencia = String.format("%03d-%d",num1, num2);
        ID = 1000 + rd.nextInt(9999);
        Saldo = saldo;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getID() {
        return ID;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public String getAgencia() {
        return Agencia;
    }

    public void UserInfo(){
        System.out.println("Nome da Conta: "+getUserName());
        System.out.println("Número da Agência: "+getAgencia());
        System.out.println("Saldo da Conta: "+getSaldo());
    }
}