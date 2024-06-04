package Curso_Dojo.OOP.CleaningCode.Concurrency.DominioTest;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/*
    Refazer o código depois para que apareça corretamente os códigos
    de cada vez que foi pego o WriteLock
*/

class MapReadWrite{
    private final Map<String, String> map = new LinkedHashMap<>();
    private final ReentrantReadWriteLock rwl;

    MapReadWrite(ReentrantReadWriteLock rwl) {
        this.rwl = rwl;
    }

    public void put(String key, String value){
        rwl.writeLock().lock();
        try {
            if(rwl.isWriteLocked()){
                System.out.printf("%s obteve o Write lock%n", Thread.currentThread().getName());
            }
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            rwl.writeLock().unlock();
        }

    }

    public Set<String> allKeys(){
        rwl.readLock().lock();
        try {
            return map.keySet();
        }finally {
            rwl.readLock().unlock();
        }
    }
}


public class TestsReentrantRead {
    public static void main(String[] args) {
        ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
        MapReadWrite mapReadWrite = new MapReadWrite(rwl);

        Runnable writer = () -> {
            for (int i = 0; i < 20; i++) {
                mapReadWrite.put(String.valueOf(i), String.valueOf(i));
            }
        };

        Runnable reader = () -> {
            if(rwl.isWriteLocked()){
                System.out.println("Write Locked!");
            }
            rwl.readLock().lock();
            System.out.println("Got it");

            try {
                System.out.println(Thread.currentThread().getName() + " " + mapReadWrite.allKeys());
            }finally {
                rwl.readLock().unlock();
            }
        };

        Thread t1 = new Thread(writer);
        Thread t2 = new Thread(reader);
        Thread t3 = new Thread(reader);

        t1.start();
        t2.start();
        t3.start();
    }
}