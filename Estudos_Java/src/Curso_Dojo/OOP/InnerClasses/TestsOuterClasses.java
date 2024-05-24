package Curso_Dojo.OOP.InnerClasses;

public class TestsOuterClasses {
    private final String name = "Ahri";
    /*
        Lembrando da linha de compilação que a JVM enxerga
        a classe estando static reconhece a Nested como se fosse
        uma classe padrão criada fora da public class TesteOuterClasses.
        portanto, tendo o nível igual ou semelhante a uma classe externa.
        por isso ela só acessa atributos staticos da própria classe ou
        através de uma call externa, exemplo:
    */
    static class Nested{
        void print(){
            System.out.println(new TestsOuterClasses().name);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}