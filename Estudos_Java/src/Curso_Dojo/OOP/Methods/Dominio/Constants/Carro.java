package Curso_Dojo.OOP.Methods.Dominio.Constants;

//Podemos criar uma classe utilizando o final nela, isso proibe a classe de ter subclasses e herdar heranças
//da mesma forma que ao utilizarmos final em métodos nós impossibilitamos a função de ser sobreescrita.
public class Carro {
    private String Nome;
    public static final int VELOCIDADE_LIMITE;
    //Utilizando o final para este objeto, eu declaro que Dono sempre será associado
    // as informações do Comprador que ele pertence ou seja que ele faz referencia
    public final Comprador DONO = new Comprador();

    static{
        VELOCIDADE_LIMITE = 250;
    }



    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
}