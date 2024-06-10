package Curso_Dojo.JDBC.Introduction.Dominio;

import java.util.Objects;

public class Mangaka {
    private Integer id;
    private String Name;


    public static final class MangakaBuilder {
        private Integer id;
        private String Name;

        private MangakaBuilder() {
        }

        public static MangakaBuilder builder() {
            return new MangakaBuilder();
        }

        public MangakaBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public MangakaBuilder Name(String Name) {
            this.Name = Name;
            return this;
        }

        public Mangaka build() {
            Mangaka mangaka = new Mangaka();
            mangaka.id = this.id;
            mangaka.Name = this.Name;
            return mangaka;
        }
    }

    @Override
    public String toString() {
        return "Mangaka{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mangaka mangaka = (Mangaka) o;
        return Objects.equals(id, mangaka.id) && Objects.equals(Name, mangaka.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Name);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return Name;
    }
}