package Curso_Dojo.OOP.CleaningCode.Concurrency.Dominio;

//Alterando a função Synchronized para Lock:

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Members {
   private final Queue<String> emails = new ArrayBlockingQueue<>(10);
   private final ReentrantLock lock = new ReentrantLock();
   private final Condition condition = lock.newCondition();
   private boolean open = true;

    public boolean isOpen(){
        return open;
    }

    public int pendingEmail(){
        lock.lock();
        try {
            return emails.size();
        }finally {
            lock.unlock();
        }
    }

    /*
        Diferente do PendingEmail, essa classe trabalha notificando as Threads
        Para trabalhar com este tipo em específico de sistema temos que usar
        dentro da classe Concurrency o Conditions, ele é responsável por
        responder as condições existentes dentro do Lock.
     */

    public void addMemberEmail(String email){
        lock.lock();
        try {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Adicionou um e-mail na lista");
            this.emails.add(email);
            //Voltando todas as Threads do descanso
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }

    public String retrieveEmail() throws InterruptedException{
        System.out.println(Thread.currentThread().getName() + " Checking if there are e-mails");
        lock.lock();
        try {
            while (this.emails.isEmpty()){
                if(!open) return null;
                System.out.println(Thread.currentThread().getName() + " Não tem e-mail disponível na lista, entrando em mode de espera");
                 condition.await();
            }
            return this.emails.poll();
        }finally {
            lock.unlock();
        }
    }

    public void close(){
        open = false;
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " Finalizando a coleta de e-mails");
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }
}