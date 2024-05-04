package Curso_Dojo.OOP.Trowables.ExceptionsTest.Dominio;

import Curso_Dojo.OOP.Trowables.ExceptionsTest.PeronalizedExceptions.LoginInvalidoException;
import java.io.FileNotFoundException;

public class Pessoa {

    public void Save() throws LoginInvalidoException, FileNotFoundException{
        System.out.println("Salvando Pessoa");
    }
}
