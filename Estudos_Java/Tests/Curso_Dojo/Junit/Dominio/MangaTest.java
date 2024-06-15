package Curso_Dojo.Junit.Dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MangaTest {
    private Manga manga1;
    private Manga manga2;

    @BeforeEach
    public void setUp(){
        manga1 = new Manga("One Piece", 1200);
        manga2 = new Manga("Komi-san", 430);
    }

    @Test
    public void acessors_ReturnData_WhenInitialized(){
        Assertions.assertEquals("One Piece", manga1.name());
        Assertions.assertEquals(1200, manga1.pages());
        Assertions.assertEquals("Komi-san", manga2.name());
        Assertions.assertEquals(430, manga2.pages());
    }
}