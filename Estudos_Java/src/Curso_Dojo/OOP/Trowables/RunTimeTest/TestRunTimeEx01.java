package Curso_Dojo.OOP.Trowables.RunTimeTest;

public class TestRunTimeEx01 {
    public static void main(String[] args) {
        //Checked Erros and Uncheckded Errors
        Object object = null;

        //Throws a NullPointerException because Object is Null
        System.out.println(object.getClass());
    }
}
