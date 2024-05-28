package Curso_Dojo.OOP.CleaningCode.Streams.Dominio;

import java.util.Objects;

public class LightNovel {
    private String Title;
    private double price;

    public LightNovel(String title, double price) {
        Title = title;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LightNovel that = (LightNovel) o;
        return Objects.equals(Title, that.Title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Title);
    }

    @Override
    public String toString() {
        return "LightNovel{" +
                "Title='" + Title + '\'' +
                ", price=" + price +
                '}';
    }

    public String getTitle() {
        return Title;
    }

    public double getPrice() {
        return price;
    }
}