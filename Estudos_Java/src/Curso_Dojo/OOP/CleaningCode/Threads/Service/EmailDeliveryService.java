package Curso_Dojo.OOP.CleaningCode.Threads.Service;

import Curso_Dojo.OOP.CleaningCode.Threads.Dominio.Members;

public class EmailDeliveryService implements Runnable{
    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " Começando a enviar os e-mails");
        while (members.isOpen() || members.pendingEmail() > 0){
            try {
                String email = members.retrieveEmail();
                if(email == null) continue;
                System.out.println(threadName + " Enviando e-mail para "+ email);
                Thread.sleep(2000);
                System.out.println(threadName + " Enviou e-mail com sucesso para " + email);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Todos os e-mails foram enviados com sucesso");
    }
}