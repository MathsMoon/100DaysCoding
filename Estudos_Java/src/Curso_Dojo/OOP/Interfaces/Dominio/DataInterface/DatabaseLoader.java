package Curso_Dojo.OOP.Interfaces.Dominio.DataInterface;

//Para usar uma interface é necessário usar o Implements
public class DatabaseLoader implements DataLoader, DataRemover {

    //Função da interface, para implementar a interface devemos também implementar
    //todas as suas funções e atributos
    @Override
    public void Load() {
        System.out.println("Carregando Dados no Banco de Dados");
    }

    //Função da Interface DataRemover
    @Override
    public void remove() {
        System.out.println("Deletando dados no Banco de Dados");
    }

    @Override
    public void CheckPermission() {
        System.out.println("Fazendo Checagem dos Dados no Banco de Dados");
    }
}