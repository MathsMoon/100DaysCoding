package Curso_Dojo.OOP.CleaningCode.Optional.Repository;

import Curso_Dojo.OOP.CleaningCode.Optional.Dominio.Manga;

import java.util.List;

public class MangaRepo {
    private static List<Manga> mangaList = List.of(
            new Manga("Boku no Hero",1, 300),
            new Manga("Hellsing", 2, 200),
            new Manga("Mirai Nikki", 3, 150),
            new Manga(""),


    );
}