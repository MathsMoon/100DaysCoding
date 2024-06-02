package Curso_Dojo.OOP.CleaningCode.Threads.DominioTests;

import java.util.ArrayList;
import java.util.List;

class ThreadSafeNames{
    private final List<String> names = new ArrayList<>();


    public synchronized void add (String name){
        names.add(name);
    }

    public synchronized void removeFirst(){
        if(!names.isEmpty()){
            System.out.println(Thread.currentThread().getName());
            System.out.println(names.removeFirst());
        }
    }
}


public class TestsThreadSafe {
    public static void main(String[] args) {
        ThreadSafeNames threadSafeNames = new ThreadSafeNames();
        threadSafeNames.add("Junker 87");

        /* Duas formas de chamar o Runnable para executar a função do Metodo da Thread:
        Runnable r = () -> {
            threadSafeNames.removeFirst();
        };
         */

        Runnable r = threadSafeNames::removeFirst;

        //Utilizando a Thread para iniciar a Runnable r
        new Thread(r).start();
        new Thread(r).start();
    }
}