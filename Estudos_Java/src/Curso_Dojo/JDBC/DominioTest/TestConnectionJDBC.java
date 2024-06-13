package Curso_Dojo.JDBC.DominioTest;

import Curso_Dojo.JDBC.Dominio.Mangaka;
import Curso_Dojo.JDBC.Repository.MangakaRepo;
import Curso_Dojo.JDBC.Repository.MangakaRepoRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class TestConnectionJDBC {
    public static void main(String[] args) {
        //Não consigo usar o Lombok por não estar sendo lido pelo Maven, mas só trocar os println por Log.Info();
        List<Mangaka> mangakaList = MangakaRepo.findAll();
        System.out.println(mangakaList);
    }
}