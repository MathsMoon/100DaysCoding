package Curso_Dojo.OOP.Trowables.RunTimeTest;

public class TestRunTimeEx04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}