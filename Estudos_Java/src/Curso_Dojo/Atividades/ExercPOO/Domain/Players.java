package Curso_Dojo.Atividades.ExercPOO.Domain;

/*
    Possíveis melhorias do Código:
    -



*/


public class Players {
    private String Name;
    public int Lifes = 3;

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