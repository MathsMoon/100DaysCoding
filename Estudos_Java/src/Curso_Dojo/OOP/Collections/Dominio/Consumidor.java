package Curso_Dojo.OOP.Collections.Dominio;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Consumidor {
    private Long ID;
    private String Nome;

    public Consumidor(String nome) {
        //uma classe Thread que cria um número de ID aleatório para cada consumidor
        ID = ThreadLocalRandom.current().nextLong(0, 100_000);
        Nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consumidor that = (Consumidor) o;
        return Objects.equals(ID, that.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ID);
    }

    @Override
    public String toString() {
        return "Consumidor{" +
                "ID=" + ID +
                ", Nome='" + Nome + '\'' +
                '}';
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
}