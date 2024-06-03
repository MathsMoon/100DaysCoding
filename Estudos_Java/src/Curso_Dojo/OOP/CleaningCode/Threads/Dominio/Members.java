package Curso_Dojo.OOP.CleaningCode.Threads.Dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

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
            //Voltando todas as Threads do descanso
            this.emails.notifyAll();
        }
    }

    /*
        A função abaixo ele recebe da lista de emails e confere caso esteja
        pendente ou não algum email, caso esteja ele retorna que não tem mais emails
        e usa o wait para colocar em modo de decanso a Thread utilizada, desta forma
        não é necessário ficar recriando Threads a cada processo, elas são reutilizadas
        através da ação do wait que espera uma ação. Caso contrário ele retorna o email
     */

    public String retrieveEmail() throws InterruptedException{
        System.out.println(Thread.currentThread().getName() + " Checking if there are e-mails");
        synchronized (this.emails){
            while (this.emails.isEmpty()){
                if(!open) return null;
                System.out.println(Thread.currentThread().getName() + " Não tem e-mail disponível na lista, entrando em mode de espera");
                 this.emails.wait();
            }
            return this.emails.poll();
        }
    }


    public void close(){
        open = false;
        synchronized (this.emails) {
            System.out.println(Thread.currentThread().getName() + " Finalizando a coleta de e-mails");
        }
    }
}