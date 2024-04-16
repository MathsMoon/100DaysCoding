package Atividades_Facul.Encapsulamento_Java;

public class Pessoa {

    //Atributos da classe Pessoa
    private  String Nome;
    private  String Senha;
    private  int idade;

    void setNome(String name) {//Método que insere o nome
        this.Nome = name;
    }

    void setSenha(String passw){//Método que insere a Senha
        this.Senha = passw;
    }

    void setIdade(int age) {//Método que insere a idade
        this.idade = age;
    }

    String getNome() {//Método que retorna o Nome
        return this.Nome;
    }

    private String getSenha() {//Método que retorna a Senha
        return this.Senha;
    }

    int getIdade() {//Método que pega 
        return this.idade;
    }

    public void info() {//Método que mostra as informações
        System.out.printf("%nNome: %s", this.Nome);
        System.out.printf("%nidade: %d", this.idade);
        System.out.printf("%nidade: " + getSenha());
    }
}