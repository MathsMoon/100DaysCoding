package Curso_Dojo.JDBC.Introduction.Service;

import Curso_Dojo.JDBC.Introduction.Dominio.Mangaka;
import Curso_Dojo.JDBC.Introduction.Repository.MangakaRepo;

import java.util.List;

public class MangakaService {
    public static void save(Mangaka mangaka){
        MangakaRepo.save(mangaka);
    }

    public static void delete(Integer id){
        requireValidID(id);
        MangakaRepo.delete(id);
    }

    public static void update(Mangaka mangaka){
        requireValidID(mangaka.getId());
        MangakaRepo.update(mangaka);
    }

    public static List<Mangaka> findAll(){
        return MangakaRepo.findAll();
    }

    public static List<Mangaka> findByName(String name){
        return MangakaRepo.findByName(name);
    }

    public static void showingMetaData(){
        MangakaRepo.getMangakaMetaData();
    }

    public static void showingDriverMetaData(){
        MangakaRepo.getDriverMetaData();
    }

    public static void showTypeScrollWorking(){
        MangakaRepo.showTypeScrollWorking();
    }

    public static List<Mangaka> findByNameAndUpdateToUpperCase(String name){
        return MangakaRepo.findByNameAndUpdateToUpperCase(name);
    }

    private static void requireValidID(Integer ID){
        if(ID == null || ID <= 0){
            throw new IllegalArgumentException("Invalid value for ID");
        }
    }
}