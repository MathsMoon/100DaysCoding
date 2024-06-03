package Curso_Dojo.OOP.CleaningCode.Threads.DominioTests;

import Curso_Dojo.OOP.CleaningCode.Threads.Dominio.Members;
import Curso_Dojo.OOP.CleaningCode.Threads.Service.EmailDeliveryService;

import javax.swing.*;

public class TestsEmailDelivery {
    public static void main(String[] args) {
        Members members = new Members();

        Thread Natsuki = new Thread(new EmailDeliveryService(members), "Natsuki");
        Thread Sayori = new Thread(new EmailDeliveryService(members), "Sayori");

        Natsuki.start();
        Sayori.start();

        while (true){
            String email = JOptionPane.showInputDialog("Entre com seu e-mail:");

            if(email == null || email.isEmpty()){
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }
    }
}