package Curso_Dojo.OOP.CleaningCode.Threads.DominioTests;

import Curso_Dojo.OOP.CleaningCode.Threads.Dominio.Account;

public class TestsThread4 implements Runnable{
    private final Account account = new Account();

    //Utilizando o run para realizar os saques:
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0){
                System.out.println("Burro");
            }
        }
    }


    public static void main(String[] args) {
        TestsThread4 testsThread4 = new TestsThread4();

        Thread t1 = new Thread(testsThread4, "Boot1");
        Thread t2 = new Thread(testsThread4, "Boot2");

        t1.start();
        t2.start();
    }
    /*
        Um dos grandes problemas do paralelismo que as threads oferecem
        é o erro de em algumas execuções o código ser executado 2 vezes
        invalidamente devido as threads simultâneamente terem acesso a uma
        função, oque neste caso acarreta as 2 threads entrarem para sacar
        ainda que não possua dinheiro devido a condição ser atendida para
        as duas, para evitar esse problema na função que será usada pelas
        threads, podemos tranca-la para 1 thread por vez utilizando o
        synchronized.

        Através do synchronized(tipo){código}, pode-se também realizar o lock
        para as threads em si, o problema é a necessidade de utilizar o final
        no objeto account para que não ocorra de uma nova instância ser criada
        e o synchronized perder a referência de qual dos objetos deve ser lockado.
     */
    private synchronized void withdrawal(int amount){
        if (account.getBalance() >= amount){
            System.out.println(getThreadName() + " está indo sacar o dinheiro");
            account.withdrawal(amount);
            System.out.println(getThreadName() + " completou o saque, valor atual da conta: "+ account.getBalance());
        } else {
            System.out.println("Sem Dinheiro para "+ getThreadName() + " Efetuar o saque "+ account.getBalance());
        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }
}