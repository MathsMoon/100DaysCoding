package Curso_Dojo.OOP.Trowables.ExceptionsTest.Dominio;

import Curso_Dojo.OOP.Trowables.ExceptionsTest.PeronalizedExceptions.LoginInvalidoException;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    @Override
    public void Save() throws LoginInvalidoException, FileNotFoundException {
        super.Save();
    }
}
