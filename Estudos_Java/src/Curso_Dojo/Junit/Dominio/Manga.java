package Curso_Dojo.Junit.Dominio;

import java.util.Objects;

public record Manga(String name, int pages) {
    public Manga {
        Objects.requireNonNull(name);
    }
}