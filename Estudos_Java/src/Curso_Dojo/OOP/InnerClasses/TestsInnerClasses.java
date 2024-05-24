package Curso_Dojo.OOP.InnerClasses;

public class TestsInnerClasses {
    private final String name = "Natsuki";

    //Classe interna do InnerClasses
    class Inner {
       /*
            A classe interna recebe de "herança tudo que existe da classe
            na qual ela está sendo criado como se fosse seu próprio atributo
            apesar de que ela por si só age como uma classe própria
        */
        public void printOuterClassAtributes(){
            System.out.println(name);
            System.out.println(this); //Retorna o endereço de memória da classe Inner
            System.out.println(TestsInnerClasses.this); //Retorna o endereço de memória da Classe TestInner
        }
    }

    public static void main(String[] args) {
        //Criando um Objeto da classe interna, através de um objeto da externa:
        TestsInnerClasses testsInner = new TestsInnerClasses();

        //Duas formas de declarar o Inner:
        Inner inner = testsInner.new Inner(); //Objeto da classe Inner que está dentro da TestInner
        //Inner inner1 = new TestsInnerClasses().new Inner();

        //Mostrando a função dentro da classe Inner.
        inner.printOuterClassAtributes();
    }
}