package Curso_Dojo.OOP.Methods.Dominio;

public class Pessoa {
    private String Nome;
    private int Idade;

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setIdade(int idade) {
        if(idade <= 0) {
            System.out.println("Valor de Idade inválido");
        } else {
            Idade = idade;
        }
    }

    public String getNome() {
       return Nome;
    }

    public  int getIdade() {
        return Idade;
    }
}
