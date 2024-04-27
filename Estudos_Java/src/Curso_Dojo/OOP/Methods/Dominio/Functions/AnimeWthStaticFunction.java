package Curso_Dojo.OOP.Methods.Dominio.Functions;

public class AnimeWthStaticFunction {
    private String Nome;
    private static int[] episodios;

    /*
      Diferente do bloco de inicialização da outra classe anime, por estar Static ele só executa 1 vez para
      todos os objetos que forem criados desta classe. Em caso de mais blocos de inicialização, eles são executados
      em ordem e apenas 1 vez.
     */
    static {
        System.out.println("Dentro do bloco de Inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public AnimeWthStaticFunction(String nome) {
        Nome = nome;
    }

    public AnimeWthStaticFunction() {
        for(int eps:episodios) {
            System.out.println(eps);
        }
    }






}
