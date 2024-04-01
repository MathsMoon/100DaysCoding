public class Veiculo { //Super classe dos Veículos
    private String Nome;
    private int tipo;
    
    public Veiculo(String Nome, int tipo) {//Método construtor parâmetro
        this.tipo = tipo;
        this.Nome = Nome;
    }   

    public void info() {//Informação do veiculo criado
        System.out.printf("Nome: %s%n", this.Nome);
        System.out.printf("Tipo: %d%n", this.tipo);  
    }
}