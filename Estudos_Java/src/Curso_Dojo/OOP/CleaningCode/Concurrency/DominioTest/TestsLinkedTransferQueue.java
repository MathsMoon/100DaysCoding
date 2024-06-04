package Curso_Dojo.OOP.CleaningCode.Concurrency.DominioTest;

import java.util.concurrent.LinkedTransferQueue;

public class TestsLinkedTransferQueue {
    public static void main(String[] args) throws InterruptedException {
        LinkedTransferQueue<Object> tq = new LinkedTransferQueue<>();

        /*
            Diferença entre Add/Offer/Put/Transfer e Element:
            Add -> Ele lança uma exceção em Runtime caso não tenha espaço
            Offer -> retorna um booleano como resposta da inserção, true para sinalizar que deu certo
            e false para caso tenha superado o limite da lista.
            Put -> Insere um valor a lista ou fica esperando abrir um espaço
            para inseri-lo.
            Transfer -> Pesquisar melhor depois.
            Element -> Mostra o primeiro item da Queue sem remove-lo ou retorna
            uma exception.

            obs: podemos usar um temporizador para realizar uma ação com o
            offer, para isso basta adicionar o tempo e definir a TimeUnit
            no tempo desejado, lembrando que desta forma ele pode retornar
            um erro, então é necessário Trata-lo.
            O mesmo pode ocorrer com TryTransfer, mas melhor buscar separada-
            mente como pode fazer.
         */
        System.out.println(tq.add("Mari"));
        System.out.println(tq.offer("Mari"));
        tq.put("ily");
        System.out.println(tq.tryTransfer("really"));
        //tq.remove(); Retorna exception caso seja vazia a Queue
        //tq.poll(); remove ou retorna null
        //tq.take(); retira da fila ou fica esperando em standby para retirar.
        System.out.println(tq.remainingCapacity());
    }
}