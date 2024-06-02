package Curso_Dojo.OOP.CleaningCode.Threads.DominioTests;

class ThreadExempleRunnable2 implements Runnable{
    private final String c;

    public ThreadExempleRunnable2(String c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.println(c);
            if (i % 100 == 0){
                System.out.println();
            }
        }
    }
}

public class TestsThread3 {
    public static void main(String[] args) throws InterruptedException {
        //Criando uma Thread com String:
        Thread t1 = new Thread(new ThreadExempleRunnable2("KA"));
        Thread t2 = new Thread(new ThreadExempleRunnable2("SA"));

        //Com o Join eu posso organizar de fato a prioridade forçando a Thread
        //Main a se juntar a uma thread menor e executa-la até o fim.
        t1.join();

        //Iniciando as Threads
        t1.start();
        t2.start();

    }
}