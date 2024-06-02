package Curso_Dojo.OOP.CleaningCode.Threads.DominioTests;

//Criando uma Thread:

class ThreadExample extends Thread{
    private final char c;

    public ThreadExample(char c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if(i % 100 == 0){
                System.out.println();
            }
        }
    }
}

//Outra forma de criar uma Thread utilizando o Runable:
class ThreadExampleRunnable implements Runnable{
    private final char c;

    public ThreadExampleRunnable(char c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if(i % 100 == 0){
                System.out.println();
            }
        }
    }
}

public class TestsThread {
    public static void main(String[] args) {

        /*
        ThreadExample t1 = new ThreadExample('A');
        ThreadExample t2 = new ThreadExample('B');
        ThreadExample t3 = new ThreadExample('C');
        ThreadExample t4 = new ThreadExample('D');

            Utilizando a função start de uma classe que extende
            a thread podemos usar a start, essa função inicia
            diversas threads que agem ao mesmo tempo imprimindo o
            valor de A,B,C,D de forma aleatória que a JVM atribui
            para gerar o resultado.

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        */

        /*
            Devido ao construtor sobrecarregado do Thread
            ele é capaz de aceitar o encapsulamento da ThreadExample
            que implementa o Runnable, pode-se usar também com a extensão
            como no ThreadExample, mas o recomendado é usar como implementação
         */
        Thread t1 = new Thread(new ThreadExampleRunnable('A'));
        Thread t2 = new Thread(new ThreadExampleRunnable('B'));
        Thread t3 = new Thread(new ThreadExampleRunnable('C'));
        Thread t4 = new Thread(new ThreadExampleRunnable('D'));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}