package Curso_Dojo.OOP.Polymorphism.Dominio;

public class Televisao extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.22;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double CalculoImposto() {
        System.out.println("Cálculando Imposto Televisao");
        return Valor * IMPOSTO_POR_CENTO;
    }
}
