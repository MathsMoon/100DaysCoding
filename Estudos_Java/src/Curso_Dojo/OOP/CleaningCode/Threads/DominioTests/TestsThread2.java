package Curso_Dojo.OOP.CleaningCode.Threads.DominioTests;


class ThreadSleep implements Runnable{
    private final char c;

    public ThreadSleep(char c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 500; i++) {
            System.out.println(c);
            if(i % 100 == 0){
                System.out.println();
            }

            //Para garantir que ela realize o comando podemos usar o try and Catch para tratar
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


//Aula Prioridade e Sleep
public class TestsThread2 {
    public static void main(String[] args) {
        //Nomeando as Threads:
        Thread t1 = new Thread(new ThreadSleep('A'), "T1A");
        Thread t2 = new Thread(new ThreadSleep('B'), "T2B");
        Thread t3 = new Thread(new ThreadSleep('C'), "T3C");
        Thread t4 = new Thread(new ThreadSleep('D'), "T4D");

        /*
            As prioridades de execução em geral vão de 1 a 10, mas devido as diferenças
            que podem ocorrer dentro da sua categorização, o método abaixo é mais recomendável, para definição.
            Lembrando que a prioridade é apenas uma indicação já que cada JVM define de forma própria o caminho
            a ser tomado então a prioridade pode ser ignorada.
         */
        t4.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}