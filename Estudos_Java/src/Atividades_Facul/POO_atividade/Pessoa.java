package Atividades_Facul.POO_atividade;

public class Pessoa {
    //Definindo os atributos da classe Pessoa
    private String Nome;
    private String Sobrenome;
    private int Ano_nasc;

    public void setNome(String nome) {//Recebendo de nome 
        this.Nome = nome;
    }

    public void setSobrenome(String sobrenome) {//Recebendo o sobrenome
        this.Sobrenome = sobrenome;
    }

    public void setAno_nasc(int ano) {//Recebendo o ano de nascimento
        this.Ano_nasc = ano;
    }

    public void info() {
        System.out.println("--------------------------------");
        System.out.printf("Seu Nome é: %s %s",this.Nome, this.Sobrenome);
        System.out.printf("\nVocê nasceu em: %d\n",this.Ano_nasc);
        System.out.printf("Logo sua idade é de: %d", (2024 - this.Ano_nasc)); //Cálculo podre de idade
    }

}
