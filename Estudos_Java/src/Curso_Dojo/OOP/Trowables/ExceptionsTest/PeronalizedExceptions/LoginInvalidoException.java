package Curso_Dojo.OOP.Trowables.ExceptionsTest.PeronalizedExceptions;

public class LoginInvalidoException extends Exception{
    public LoginInvalidoException() {
        super("Login inválido!");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}