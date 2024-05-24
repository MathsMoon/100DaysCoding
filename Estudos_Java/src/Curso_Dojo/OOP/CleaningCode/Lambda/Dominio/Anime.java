package Curso_Dojo.OOP.CleaningCode.Lambda.Dominio;

public class Anime {
    private String Title;
    private int Episodes;

    public Anime(String title, int quantity) {
        Title = title;
        Episodes = quantity;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "Title='" + Title + '\'' +
                ", Episodes=" + Episodes +
                '}';
    }

    public String getTitle() {
        return Title;
    }

    public Integer getEpisodes() {
        return Episodes;
    }
}