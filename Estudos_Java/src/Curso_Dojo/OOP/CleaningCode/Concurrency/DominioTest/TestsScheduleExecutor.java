package Curso_Dojo.OOP.CleaningCode.Concurrency.DominioTest;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.*;

public class TestsScheduleExecutor {
    private static final ScheduledExecutorService EXECUTOR_SERVICE = Executors.newScheduledThreadPool(1);
    private static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("HH:mm:ss");

    //Método que retorna um beep a cada tempo determinado
    private static void beeper(){
        Runnable r = () -> System.out.println(LocalTime.now().format(DTF) + " beep");

        /*
            Os dois tipos de scheculeFixed ou funciona contando a partir de possíveis delays ou
            usos da Runnable como pode ser fixa e contar o seu tempo independente de tudo.
         */
        ScheduledFuture<?> schedule = EXECUTOR_SERVICE.scheduleAtFixedRate(r, 1, 5, TimeUnit.SECONDS);
        EXECUTOR_SERVICE.schedule(() -> {
            System.out.println("Cancelando o Schedule Após 10 segundos");
            schedule.cancel(false);
            EXECUTOR_SERVICE.shutdown();
        }, 10, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        System.out.println(LocalTime.now().format(DTF));
        beeper();
    }
}