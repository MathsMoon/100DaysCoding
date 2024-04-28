package Curso_Dojo.OOP.Inheritance.Dominio;
/*
    O private dentro de uma classe protege aquela informação de ser acessada
    fora da classe que ela está, desta forma ela se restringe a uma área de atuação
    o Protected é uma variável protegida da classe que permite seu uso fora apenas
    em caso de herança, desta forma ela protege de usos indevidos fora da área de
    herança da classe mãe ou Super Classe.
 */



public class Pessoa {
    protected String Nome;
    protected int CPF;
    protected Endereco endereco;

//    public Pessoa(String nome, int CPF, Endereco endereco) {
//        Nome = nome;
//        this.CPF = CPF;
//        this.endereco = endereco;
//    }

    public void Imprime() {
        System.out.println("Nome: " + Nome);
        System.out.println("CPF: " + CPF);
        endereco.Imprime();
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}