package Curso_Dojo.OOP.Polymorphism.Dominio;

public class Computador extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.21;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    //Função é herança da Intarface de Taxa
    @Override
    public double CalculoImposto() {
        System.out.println("Cálculando Imposto Computador");
        return Valor * IMPOSTO_POR_CENTO;
    }
}