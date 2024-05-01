package Curso_Dojo.OOP.Polymorphism.IOP.Services;

import Curso_Dojo.OOP.Polymorphism.IOP.Repositories.Repository;

public class RepoDB implements Repository {
    @Override
    public void Salvar() {
        System.out.println("Salvando em um Banco de Dados");
    }
}