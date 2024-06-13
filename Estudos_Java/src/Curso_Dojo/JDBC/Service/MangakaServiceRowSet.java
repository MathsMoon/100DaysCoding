package Curso_Dojo.JDBC.Service;

import Curso_Dojo.JDBC.Dominio.Mangaka;
import Curso_Dojo.JDBC.Repository.MangakaRepoRowSet;

import java.util.List;

public class MangakaServiceRowSet {
    public static List<Mangaka> findByNameRowSet(String name){
        return MangakaRepoRowSet.findByNameRowSet(name);
    }

    public static void updateRowSet(Mangaka mangaka){
        MangakaRepoRowSet.updateRowSet(mangaka);
    }
}