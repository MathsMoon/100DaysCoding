package Curso_Dojo.OOP.Methods.Dominio;

public class EstudanteParametros {
    private String Nome;
    private int Idade;
    private char Sexo;

    //Criando funções para o Estudante:
    public void Imprimi() {//Para impressão das informações
        System.out.println(Nome);
        System.out.println(Idade);
        System.out.println(Sexo);
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char sexo) {
        Sexo = sexo;
    }
}