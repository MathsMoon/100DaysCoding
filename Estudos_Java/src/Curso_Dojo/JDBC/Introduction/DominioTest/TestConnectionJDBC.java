package Curso_Dojo.JDBC.Introduction.DominioTest;

import Curso_Dojo.JDBC.Introduction.Dominio.Mangaka;
import Curso_Dojo.JDBC.Introduction.Service.MangakaService;

import java.util.List;

public class TestConnectionJDBC {
    public static void main(String[] args) {
        List<Mangaka> mangakas = MangakaService.findByNameAndUpdateToUpperCase("Au");
        System.out.println(mangakas);
    }
}