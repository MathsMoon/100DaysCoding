package Curso_Dojo.Atividades.ExercPOO.Domain;

public class Players {
    private String Name;
    private int Lifes;

    //Para eu criar no início do código
    public Players() {}

    public Players(String name) {
        Name = name;
        Lifes = 3;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getLifes() {
        return Lifes;
    }
}