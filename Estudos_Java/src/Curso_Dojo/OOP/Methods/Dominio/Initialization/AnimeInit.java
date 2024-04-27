package Curso_Dojo.OOP.Methods.Dominio.Initialization;

public class AnimeInit {
    private String Nome;
    private int[] episodios;

    /*
     Bloco de Inicialização: Como próprio nome diz o bloco de inicialização ele insere certas informações
     ao código antes de qualquer outra execução, no exemplo a baixo ele inicializa o Array de eps já
     informando que possue 100 episódios.
    */
    {
        System.out.println("Dentro do bloco de Inicialização:");
        episodios = new int[100];
        for (int i = 0; i <episodios.length ; i++) {
            episodios[i] = i+1;
        }
    }


    public AnimeInit(String nome) {
        Nome = nome;
    }

    public AnimeInit() {
        for(int ep:this.episodios) {
            System.out.print(ep + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
