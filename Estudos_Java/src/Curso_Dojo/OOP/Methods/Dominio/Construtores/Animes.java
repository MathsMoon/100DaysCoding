package Curso_Dojo.OOP.Methods.Dominio.Construtores;

public class Animes {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String Studio;

    public Animes(String nome, String tipo, int episodios, String genero) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    //Construtores podem também serem sobrecarregados:
    public Animes(String nome, String tipo, int episodios, String genero, String Studio){
        //Chamando o Outro Construtor para adicionar a String Studio
        //Ele só funciona se for o primeiro elemento chamado no construtor
        this(nome, tipo, episodios, genero);
        this.Studio = Studio;
    }


    /*
      Sobrecarga de função é quando temos duas funções com mesmo nome que são diferentes entre si
      devido a quantidade de informações que ela contém, sendo assim ela pode receber mais info
      por conta dessa possibilidade do java de Sobrecarregar uma função adicionando informações a ela


    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void init(String nome, String tipo, int episodios, String genero) {
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }

----------------------------------------------------------------------------------------------------

    public String getFabricante() {
        return nome;
    }

    public void setFabricante(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    */

    //Função que retorna no Próprio objeto os valores cadastrados
    @Override //Comando para sobrescrever algo
    public String toString() {
        return "Animes{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", episodios=" + episodios +
                ", genero='" + genero + '\'' +
                '}';
    }
}