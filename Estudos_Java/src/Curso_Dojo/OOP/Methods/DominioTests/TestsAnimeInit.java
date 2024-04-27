package Curso_Dojo.OOP.Methods.DominioTests;

import Curso_Dojo.OOP.Methods.Dominio.Initialization.AnimeInit;

public class TestsAnimeInit {
    public static void main(String[] args) {
        AnimeInit Objanime = new AnimeInit("One Piece");

        for (int episodio : Objanime.getEpisodios()) {
            System.out.println(episodio + " ");
        }
    }
}
