package Curso_Dojo.OOP.Interfaces.DominioTests;

import Curso_Dojo.OOP.Interfaces.Dominio.DataInterface.DatabaseLoader;
import Curso_Dojo.OOP.Interfaces.Dominio.DataInterface.FileLoarder;

public class TestsDataLoader {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoarder fileLoarder = new FileLoarder();

        //Mostrando resultados das funções da interface:
        databaseLoader.Load();
        fileLoarder.Load();

        databaseLoader.remove();
        fileLoarder.remove();

        databaseLoader.CheckPermission();
        fileLoarder.CheckPermission();


    }
}
