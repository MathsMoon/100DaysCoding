package Curso_Dojo.OOP.CleaningCode.Threads.DominioTests;

public class TestsThreadDeadLock {
    public static void main(String[] args) {
        /*
            DeadLock é um conceito que se desenvolve a partir
            da tranca de um processo por parte de outra Thread
            como foi aprendido, o problema é que se ambas as Threads
            necessitarem acessar conteúdos lockados de outra Thread
            pode gerar um ciclo infinito de espera ocasionando
            uma paralização total devido aos locks que ambas as Threads
            se impõe. Para resolver esse problema, você deve rever as
            Threads e conferir quais são as informações que elas usam
            para realizar suas tarefas, caso elas acessem pontos em comum
            que são protegidos por Lock para não ocorrer casos de Threads
            simultâneas no código, provalvelmente elas podem gerar um
            DeadLock, então é necessário revisar a arquitetura do código
            para evitar que as Threads fiquem esperando uma liberação de outra
            evitando esse problema.
         */

        //Criando Objetos para se lockarem:
        Object lock1 = new Object();
        Object lock2 = new Object();

        Runnable r1 = () -> {
            synchronized (lock1){
                System.out.println("Thread 1: Segurando Lock 1");
                System.out.println("Thread 1: esperando Lock 2");
                synchronized (lock2){
                    System.out.println("Thread 1: Segurando lock 2");
                }
            }
        };

        Runnable r2 = () -> {
            synchronized (lock2){
                System.out.println("Thread 2: Segurando Lock 2");
                System.out.println("Thread 2: esperando Lock 1");
                synchronized (lock1){
                    System.out.println("Thread 2: Segurando lock 1");
                }
            }
        };

        //TravaZap de Thread.
        new Thread(r1).start();
        new Thread(r2).start();
    }
}