package Curso_Dojo.OOP.Inheritance.DominioTests;
import Curso_Dojo.OOP.Inheritance.Dominio.AnimeToString;

public class TestsAnimeToString {
    public static void main(String[] args) {
        //Criando Objeto da classe Anime
        AnimeToString anime = new AnimeToString("One Piece");

        //Formas de chamar o toString:
        System.out.println(anime.toString());
        System.out.println(anime);
    }
}