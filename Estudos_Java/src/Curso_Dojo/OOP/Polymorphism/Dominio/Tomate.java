package Curso_Dojo.OOP.Polymorphism.Dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.06;
    private String DataValidade;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    public Tomate(String nome, double valor, String dataValidade) {
        super(nome, valor);
        DataValidade = dataValidade;
    }

    public String getDataValidade() {
        return DataValidade;
    }

    public void setDataValidade(String dataValidade) {
        DataValidade = dataValidade;
    }

    //Função é herança da Intarface de Taxa
    @Override
    public double CalculoImposto() {
        System.out.println("Cálculando Imposto Tomate");
        return Valor * IMPOSTO_POR_CENTO;
    }
}