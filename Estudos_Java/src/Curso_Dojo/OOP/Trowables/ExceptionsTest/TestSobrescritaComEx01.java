package Curso_Dojo.OOP.Trowables.ExceptionsTest;

import Curso_Dojo.OOP.Trowables.ExceptionsTest.Dominio.Funcionario;
import Curso_Dojo.OOP.Trowables.ExceptionsTest.Dominio.Pessoa;
import Curso_Dojo.OOP.Trowables.ExceptionsTest.PeronalizedExceptions.LoginInvalidoException;

import java.io.FileNotFoundException;


public class TestSobrescritaComEx01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

       funcionario.Save();
        try {
            pessoa.Save();
        } catch (LoginInvalidoException | FileNotFoundException  e) {
            throw new RuntimeException(e);
        }
    }
}