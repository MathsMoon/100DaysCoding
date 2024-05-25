package Curso_Dojo.OOP.CleaningCode.Optional.Dominio;

public class Manga {
    private final Integer ID;
    private String Title;
    private int chapters;

    public Manga(String title, Integer ID, int chapters) {
        Title = title;
        this.ID = ID;
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "Title='" + Title + '\'' +
                ", ID=" + ID +
                ", chapters=" + chapters +
                '}';
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getTitle() {
        return Title;
    }

    public Integer getID() {
        return ID;
    }

    public int getChapters() {
        return chapters;
    }
}