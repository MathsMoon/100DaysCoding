package Curso_Dojo.OOP.CleaningCode.Threads.Dominio;

public class Account {
    private int balance = 50;

    public void withdrawal(int amount){
        balance = balance - amount;
    }

    public int getBalance() {
        return balance;
    }
}