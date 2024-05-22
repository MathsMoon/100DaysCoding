package Curso_Dojo.OOP.Generics.DominioTests;

abstract class Animal{
    public abstract void consulta();
}

class Cachorro extends Animal{
    @Override
    public void consulta() {
        System.out.println("Consultando Cachorro");
    }
}

class Gato extends Animal{
    @Override
    public void consulta() {
        System.out.println("Consultando Gato");
    }
}

public class TestsWildCard {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};

        PrintConsulta(cachorros);
        PrintConsulta(gatos);
    }

    private static void PrintConsulta(Animal[] animals){
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
}