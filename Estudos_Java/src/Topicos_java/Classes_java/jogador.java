package Topicos_java.Classes_java;

public class jogador {
    private int a = 10; //Private é um modificador de acesso que proibe a manipulação do atributo fora da classe.
    public int b = 0; // logo quaisquer métodos, variáveis ou afins que tenham modificador public são manipuláveis fora da classe.
    private int num = 10;
    private int vidas;


    public jogador (int num) { //Isso é um metódo chamado Constructor, ainda preciso saber sua função
        this.num = num; //Função que basicamente diz que o Num da classe é igual ao num criado dentro do método. 
        this.vidas = 3;
        System.out.printf("O jogador número %d foi criado.%n", num);
    }

    public int getVidas() {
        return this.vidas;
    }
}
