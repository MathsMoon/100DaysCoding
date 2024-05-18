package Curso_Dojo.OOP.Collections.Dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga>{
    private Long ID;
    private String Nome;
    private String Genero;

    public Manga(Long id, String nome, String genero) {
        //Declara que ao receber as informações deste Objeto, valores ID e Nome não podem ser Nulos
        Objects.requireNonNull(id, "ID não pode ser Nulo! Por favor preencha");
        Objects.requireNonNull(nome,"Nome não pode ser Nulo! Por favo preencha");

        ID = id;
        Nome = nome;
        Genero = genero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(ID, manga.ID) && Objects.equals(Nome, manga.Nome) && Objects.equals(Genero, manga.Genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, Nome, Genero);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "ID=" + ID +
                ", Nome='" + Nome + '\'' +
                ", Genero='" + Genero + '\'' +
                '}';
    }
    /*
        Para Ordenar uma Lista personalizada como a que criamos com o manga
        é necessário implementar o método de Comparação que irá interar
        cada elemento organizando da forma que definirmos através do comando
        CompareTo. Para as regras de implementação faça:

        - Negativo se o this (Objeto do Manga) < outroManga
        - Se this == outroManga, retorna 0
        - Positivo se o this > outroManga
     */
    @Override
    public int compareTo(Manga OutroManga) {
        /* Maneira manual de fazer a Comparação através da Lógica do -1, 0 e 1.
        if(this.ID < OutroManga.getID()){
            return -1;
        } else if (this.ID.equals(OutroManga.getID())) {
            return 0;
        } else {
            return 1;
        }
         */

        //Como estamos usando o Long que é um wrapper, podemos usar a função própria dele:
        return this.ID.compareTo(OutroManga.getID());
        /*
            Para organizar a lista usando compare basta usar:
            this.(variavel).compare/to.(variavelreferenciada.valorquevcbusca());
         */
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }
}