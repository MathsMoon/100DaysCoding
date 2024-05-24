package Curso_Dojo.OOP.InnerClasses;

public class TestsInnerClasses2 {
    private final String name = "Hu Tao";

    /*
        Criando uma classe dentro de uma Função, para usar este exemplo
        é necessário criar a classe como abstract ou como final;
    */
    void print(){
        /*
            O problema de variáveis locais como esta abaixo é que por conta
            da classe interna, o java a partir da versão 8 considera ela como
            final. Qualquer atributo deste método deve ser usado como final
            devido ao tempo de execução e a forma que o java compila essas
            informações.
         */
        final String lastname = "From Wansheng Parlor";

        final class Inner {
            public void PrintLocal() {
                System.out.println(name + " "+ lastname);
            }
        }
        //Criando a instância do objeto que é chamado pelo Print
       new Inner().PrintLocal();
    }




    public static void main(String[] args) {
        TestsInnerClasses2 testsInner = new TestsInnerClasses2();
        testsInner.print();
    }
}