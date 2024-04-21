package CFB_CursoJava.SuperClasse;

public class Aviao extends Veiculo {
    private final int categoria;

    public Aviao(String nome, int categoria) {
        super(nome, 10); //uma referência a Super classe Veiculo
        this.categoria = categoria;
    }

    public void info() { //Mostrando apenas as informações da classe Avião
        super.info(); //Chamando método das infos da Super Classe veículo
        System.out.printf("Categoria: %d", this.categoria);
    }
}
