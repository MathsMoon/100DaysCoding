package Curso_Dojo.OOP.InnerClasses;

class Animal {
    public void Walk(){
        System.out.println("Animal walking");
    }
}

public class TestsAnonymousClasses {
    public static void main(String[] args) {
        //Criando uma subclasse anônima para usar funções sem que necessiariamente tenhamos que criar uma classe própria
        Animal animal = new Animal(){
            /* Dentro da subclasse anônima
                Esta subclasse anônima me permite acessar todos os recursos
                e substitui-los como se herdasse de Animal, mas sem que eu
                precise criar uma classe para alterar os métodos.
            */

            @Override
            public void Walk() {
                System.out.println("Walkin in the Shadows");
            }
        };
        animal.Walk();
    }
}