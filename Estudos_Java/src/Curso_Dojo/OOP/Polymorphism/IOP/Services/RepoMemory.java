package Curso_Dojo.OOP.Polymorphism.IOP.Services;

import Curso_Dojo.OOP.Polymorphism.IOP.Repositories.Repository;

public class RepoMemory implements Repository {
    @Override
    public void Salvar() {
        System.out.println("Salvando em memória");
    }
}