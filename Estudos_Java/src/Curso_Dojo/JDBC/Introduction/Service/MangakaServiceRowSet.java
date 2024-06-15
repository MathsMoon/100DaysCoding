package Curso_Dojo.JDBC.Introduction.Service;

import Curso_Dojo.JDBC.Introduction.Dominio.Mangaka;
import Curso_Dojo.JDBC.Introduction.Repository.MangakaRepoRowSet;

import java.util.List;

public class MangakaServiceRowSet {
    public static List<Mangaka> findByNameRowSet(String name){
        return MangakaRepoRowSet.findByNameRowSet(name);
    }

    public static void updateRowSet(Mangaka mangaka){
        MangakaRepoRowSet.updateRowSet(mangaka);
    }

    public static void updateCachedRowSet(Mangaka mangaka){
        MangakaRepoRowSet.updateCachedRowSet(mangaka);
    }
}