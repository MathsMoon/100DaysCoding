package Curso_Dojo.JDBC.Introduction.DominioTest;

import Curso_Dojo.JDBC.Introduction.Dominio.Mangaka;
import Curso_Dojo.JDBC.Introduction.Repository.MangakaRepo;

public class TestConnectionJDBC {
    public static void main(String[] args) {
        Mangaka mangaka = Mangaka.MangakaBuilder.
                builder().
                Name("Arthemis").
                build();
        MangakaRepo.save(mangaka);
    }
}