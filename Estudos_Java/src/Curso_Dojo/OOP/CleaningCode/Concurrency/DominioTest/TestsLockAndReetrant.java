package Curso_Dojo.OOP.CleaningCode.Concurrency.DominioTest;

import java.util.concurrent.locks.ReentrantLock;

class Worker implements Runnable{
    private String Name;
    private ReentrantLock lock;

    public Worker(String name, ReentrantLock lock) {
        Name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        try{
            System.out.printf("Thread %s entrou em sessão Crítica", Name);
            System.out.printf("%n%d Threads esperando na fila%n",lock.getQueueLength());
            System.out.printf("Thread %s vai esperar 2s%n", Name);
            Thread.sleep(2000);
            System.out.printf("Thread %s finalizou a espera%n", Name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
}

public class TestsLockAndReetrant {
    public static void main(String[] args) {
        /*
            Criando o ReentrantLock para manualmente
            realizar o fechamento das funções do Lock
            para cada Thread.
         */

        ReentrantLock lock = new ReentrantLock();

        new Thread(new Worker("A", lock)).start();
        new Thread(new Worker("B", lock)).start();
        new Thread(new Worker("C", lock)).start();
        new Thread(new Worker("D", lock)).start();
        new Thread(new Worker("E", lock)).start();
        new Thread(new Worker("F", lock)).start();
        new Thread(new Worker("G", lock)).start();
        new Thread(new Worker("H", lock)).start();
    }
}