package Atividades_Facul.POO.AccountSys.BankAccount;

import java.text.DateFormat;

public class Poupanca extends Conta{
    private final DateFormat date = DateFormat.getTimeInstance(DateFormat.MEDIUM);
    private String Data_Aniversario;

    public Poupanca(){}

    public Poupanca(String data_aniv) {
        super();
        Data_Aniversario = data_aniv;
    }

    public void setData_Aniversario(String data_Aniversario) {
        Data_Aniversario = data_Aniversario;
    }

    //Revisar depois a formatação da Datação para Sair o mês por extenso e o dia escrito.
    @Override
    public void UserInfo() {
        super.UserInfo();
        System.out.println("Data de Aniversário: "+ date.format(Data_Aniversario));
    }
}