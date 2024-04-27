package Curso_Dojo.OOP.Methods.Dominio.Functions;

public class Carro {
    private String Fabricante;
    private double VelMaxima;
    private static double VelLimite;

    /*
       O modificador Static torna um parametro setado como padrão para todos os outros
       Neste exemplo a velocidade Limite é 250 para todos por eu ter inicializado desta forma
       Mas qualquer valor inserido irá alterar o valor de todos os demais objetos
    */
    public Carro(String fabricante, double velMaxima) {
        Fabricante = fabricante;
        VelMaxima = velMaxima;
    }

    public void Imprime() {
        System.out.println("--------------");
        System.out.println("Fabricante: " + this.Fabricante);
        System.out.println("Velocidade Máxima: " + this.VelMaxima);
        System.out.println("Velocidade Limite: " + Carro.VelLimite);

    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String fabricante) {
        Fabricante = fabricante;
    }

    public double getVelMaxima() {
        return VelMaxima;
    }

    public void setVelMaxima(double velMaxima) {
        VelMaxima = velMaxima;
    }

    /*
       A função static faz parte da classe e devido a isso não precisa utilizar o This.
       Uma função static não pode chamar atributos não staticos devido a seu tempo de inicialização
       como static é atribuido a classe é inicializado primeiro, logo pode ter erros de compilação
       caso utilize um valor não estático sem inicialização. É importante utilizar as funções estáticas
       quando se sabe quando incializa-la e utilizada dentro de um determinado contexto, para que não afete
       atributos não estáticos.
     */
    public static void setVelLimite(double velLimite) {
        VelLimite = velLimite;
    }

    public double getVelLimite() {
        return VelLimite;
    }
}
