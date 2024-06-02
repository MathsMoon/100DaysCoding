package Curso_Dojo.OOP.CleaningCode.Threads.Dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Members {
   private final Queue<String> emails = new ArrayBlockingQueue<>(10);
   private boolean open = true;

    public boolean isOpen(){
        return open;
    }

    public int pendingEmail(){
        synchronized (emails){
            return emails.size();
        }
    }

    public void addMemberEmail(String email){
        synchronized (this.emails){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Adicionou um e-mail na lista");
            this.emails.add(email);

            //TODO voltar quando a Thread estiver esperando
        }
    }


    public void retrieveEmail(){
        System.out.println(Thread.currentThread().getName() + " Checking if there are emails");

    }
}