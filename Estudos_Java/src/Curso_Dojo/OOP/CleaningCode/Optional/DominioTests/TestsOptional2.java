package Curso_Dojo.OOP.CleaningCode.Optional.DominioTests;

import Curso_Dojo.OOP.CleaningCode.Optional.Dominio.Manga;
import Curso_Dojo.OOP.CleaningCode.Optional.Repository.MangaRepo;

import java.util.Optional;

public class TestsOptional2 {
    public static void main(String[] args) {
        //Buscando manga pelo Título:
        Optional<Manga> manga = MangaRepo.findByTitle("Mirai nikki");
        System.out.println(manga);

        //Buscando Manga pelo ID e alterando o nome do Objeto:
        MangaRepo.findByID(1).ifPresent(m -> m.setTitle("Alterando nome"));
        Optional<Manga> byID = MangaRepo.findByID(1);
        System.out.println(byID);

        //Como tratar caso o valor não exista:
//        Manga mangaById = MangaRepo.findByID(5).orElseThrow(IllegalArgumentException::new);
//        System.out.println(mangaById);

        //Criando um Manga caso não exista:
        Manga CreatingManga = MangaRepo.findByTitle("Mob Psycho 100").orElseGet(() -> new Manga("Mob Psycho 100", 5, 50));
        System.out.println(CreatingManga);
    }
}