package Atividades_Facul.POO.AccountSys.BankAccount;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtratoBancario {
    public void ImpressaoExtrato(Conta conta){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();

        System.out.println("Saldo Atual da Conta: "+ conta.getSaldo());
        System.out.println("Data: "+ sdf.format(date.getTime()));
    }
}