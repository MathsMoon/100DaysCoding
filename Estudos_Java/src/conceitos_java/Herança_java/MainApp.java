package conceitos_java.Herança_java;

public class MainApp {
    public static void main(String[] args) {
        //Criado o objeto da classe Carro chamado de: carro1
        Carro carro1 = new Carro("Golf");
        Carro carro2 = new Carro("Corsa");
        Carro_Combate carro3 = new Carro_Combate("m130", 100);

        //Utilizando os métodos da classe Mãe: Carro e utilizando herança do Carro_Combate
        carro1.info();
        carro2.info();
        carro3.info();
    }
}
