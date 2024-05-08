package Curso_Dojo.OOP.UtilityClasses.Dominio.StringClasses;

public class StringPerformace {
    /*
        Quanto mais Strings você utiliza pior é o desempenho delas,
        para carregar uma intenração 100 mil vezes ou 1 milhão já começa se tornar
        cada vez mais pesado tornando inviável a utilização comum da String
        para sistemas que mexem com milhões de pessoas.
        Para resolver isso vamos utilizar o UtilizingStringBuilder para não ter esse gargâlo.

        Para diminuir ainda mais e utilizando múltiplas threads, podemos utilizar o StringBuffer
    */

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis(); //Comando que pega o tempo atual em milisegundos

        //Pode-se utilizar _ para dividir o número para melhor visualização de quantidade
        //Comparando os 3 tipos de utilização da String:
        ConcatString(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para a concatenar String: " + (fim - inicio) + "ms");

        ConcatStringBuilder(100_000);
        long fim2 = System.currentTimeMillis();
        System.out.println("Tempo gasto para a concatenar Builder: " + (fim2 - inicio) + "ms");

        ConcatStringBuffer(100_000);
        long fim3 = System.currentTimeMillis();
        System.out.println("Tempo gasto para a concatenar Buffer: " + (fim3 - inicio) + "ms");
    }

    private static void ConcatStringBuffer(int tamanho) {
        StringBuffer texto = new StringBuffer(tamanho);

        for (int i = 0; i < tamanho; i++) {
            texto.append(i);
        }
    }

    private static void ConcatStringBuilder(int tamanho) {
        StringBuilder texto = new StringBuilder(tamanho);

        for (int i = 0; i < tamanho; i++) {
            texto.append(i);
        }
    }

    private static void ConcatString(int tamanho) {
        String texto = "";

        for (int i = 0; i < tamanho; i++) {
            texto += 1;
        }
    }
}
