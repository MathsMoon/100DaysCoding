package Curso_Dojo.OOP.Interfaces.Dominio.DataInterface;

public class FileLoarder implements DataLoader, DataRemover {
    @Override
    public void Load() {
        System.out.println("Carregando Aqruivo");
    }

    @Override
    public void remove() {
        System.out.println("Deletando Arquivos no Banco de Dados");
    }

    @Override
    public void CheckPermission() {
        System.out.println("Fazendo checagem das informações dos Arquivos");
    }
}
