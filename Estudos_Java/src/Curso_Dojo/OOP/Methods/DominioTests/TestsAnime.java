package Curso_Dojo.OOP.Methods.DominioTests;

import Curso_Dojo.OOP.Methods.Dominio.Animes;

public class TestsAnime {
    public static void main(String[] args) {
        //Inserção dos valores ao Objeto da classe Anime
        Animes AnimeObj = new Animes("One Piece", "TV/Manga", 1190, "Ação/Aventura");

        //Mostrando as informações cadastradas no Objeto
        System.out.println(AnimeObj);
    }
}