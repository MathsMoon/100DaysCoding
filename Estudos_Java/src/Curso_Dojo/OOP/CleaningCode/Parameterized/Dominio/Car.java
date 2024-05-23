package Curso_Dojo.OOP.CleaningCode.Parameterized.Dominio;

public class Car {
    private final String CarName = "Audi";
    private String Color;
    private int Year;

    public Car(String color, int year) {
        Color = color;
        Year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "CarName='" + CarName + '\'' +
                ", Color='" + Color + '\'' +
                ", Year=" + Year +
                '}';
    }

    public String getCarName() {
        return CarName;
    }

    public String getColor() {
        return Color;
    }

    public int getYear() {
        return Year;
    }
}