package Curso_Dojo.OOP.CleaningCode.Concurrency.DominioTest;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
    private int count;
    private final AtomicInteger atomicInteger = new AtomicInteger();
    private Lock lock = new ReentrantLock(true);


    /*
        O maior problema de usar o Synchronized abaixo é justamente a necessidade
        que ambas as threads precisarem passar pelo increment, e devido ao bloqueio
        imposto com a função, fica mais difícil para a performance do sistema de
        executar a função devido ao bloqueio, perdendo eficiência.

        Para contornar isso é necessário o uso da Concorrência para continuar
        tendo uma eficiência ao se usar múltiplas Threads. Por este motivo
        é necessário o uso do AtomicInteger que retorna um valor certo
        para cada thread entregando uma certeza para o caso usado.
     */

    synchronized void increment(){
        //Revisar posteriormente o Uso do Lock.
        lock.lock();
        try {
            count++;
            atomicInteger.getAndIncrement();
        }finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }
}

public class TestsAtomicInteger {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        //Runnable que irá realizar a incrementação da classe Counter
        Runnable r = () -> {
            for (int i = 0; i < 10_000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();

        //Após cada Thread ter finalizado seu trabalho ela será juntada atravésd o Join
        t1.join();
        t2.join();

        System.out.println(counter.getCount());
        System.out.println(counter.getAtomicInteger());
    }
}