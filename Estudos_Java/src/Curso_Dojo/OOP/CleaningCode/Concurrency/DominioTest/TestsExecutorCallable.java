package Curso_Dojo.OOP.CleaningCode.Concurrency.DominioTest;

import java.util.concurrent.*;

class RandomNumberCallable implements Callable<String>{
    @Override
    public String call() throws Exception {
        //Para processos multithreads dê preferência ao ThreadLocalRandom
        int num = ThreadLocalRandom.current().nextInt(1, 11);
        for (int i = 0; i < num; i++) {
            System.out.printf("%s executing task Callable..%n", Thread.currentThread().getName());
        }
        return String.format("%s Finished and the random number is: %d", Thread.currentThread().getName(), num);
    }
}

public class TestsExecutorCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RandomNumberCallable rnc = new RandomNumberCallable();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future = executorService.submit(rnc);
        String s = future.get();
        System.out.printf("Program Finished %s", s);
        executorService.shutdown();
    }
}