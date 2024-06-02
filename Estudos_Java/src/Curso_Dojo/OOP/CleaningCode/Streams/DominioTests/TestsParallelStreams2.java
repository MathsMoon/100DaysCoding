package Curso_Dojo.OOP.CleaningCode.Streams.DominioTests;

public class TestsParallelStreams2 {
    /* Percebendo a necessidade dos usos do Parallel Streams:
       Para saber quando se usa e quando não se usa deve-se
       atentar a alguns princípios importantes da sua construção:

       - Benchmark: melhor forma de testar o seu uso e através de seu consumo
       para impedir um consumo maior que o esperado ou que requer
       desnecessariamente mais recursos pode-se realizar testes de performance
       dentre outros métodos para melhor organizar seu código.

       - Unboxing | Boxing: Por conta dos tipos de dados que pode-se estar
       utilizando é necessário revisar o quanto de processamento se perde
       devido a necessidade de conversão dos dados como também dos processos
       de Unboxing e Boxing que vão tornar mais custoso o processamento e
       consequentemente mais lento.

       - funções Limit e FindFirst: são funções comuns da Stream que não foram
       feitas para serem usadas paralelamente tornando assim muito mais pesado
       e de difícil performance devido a essas instruções que não se saem bem
       em ambientes multithreads, diferente do findAny por exemplo que nesse
       caso funciona muito melhor.

       - Custo Total da Computação: Ao utilizar a streams sempre se mexe com
       número de processos como também de elementos, para melhor lidar com
       esses processos o parallel por ser multithread ajuda em grande parte
       dos casos a diminuiro custo total da Computação.

       - Quantidade de Dados: Quanto maior a quantidade de dados utilizados
       na stream melhor será o resultado de utilizar o parallel, devido a
       necessidade de executar ações sobre cargas massissas de dados.

       - Tipos de Coleções: Dependendo do tipo da coleção utilizada nos dados
       a performance é grandemente afetada, então estudar o melhor tipo de
       implementação de acordo com as coleções utilizadas é a melhor forma
       de organizar a multithread.

       - Tamanho da Stream: O tamanho da stream importa devido a necessidade
       dela ter que dividir as tarefas para os subprocessos de acordo com o
       tamanho da stream, por isso streams já definidas em tamanho são mais
       facilmente usávies do que as dinâmicas devido a falta de certeza
       da quantidade de informações a serem utilizadas.

       - Processamento do Merge: De acordo com a tarefa as divisões ão feitas
       em cada parte do processo para garantir que os subprocessos possam
       realizar em todas as partes, o problema do merge é que dependendo do tipo
       da tarefa realizada o resultado agrupado de todas as subdivisões pode retornar
       de forma mais lenta ou se quer retornar devido a diversas divisões terem sido
       feitas e o resultado ter se tornado grande demais.

     */
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}