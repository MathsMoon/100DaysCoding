public class MainApp {
    
    public static void main(String[] args) {
        //Definindo Objetos
        Aranha AraAra = new Aranha(20, 5, 3, 10);
        Formiga fourmigar = new Formiga(15, 2, 4);
        Vegetal erva = new Vegetal(3);

        //Mostrando as informações de cada objeto 
        AraAra.info();
        fourmigar.info();
        erva.info();

        //Teste de ataque
        AraAra.Atacar(fourmigar);


        //Resultado do ataque:
        AraAra.info();
        fourmigar.info();

        //Comendo a Erva
        AraAra.Comer(2);

    }
}
