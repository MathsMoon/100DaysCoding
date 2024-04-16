package Atividades_Facul.Encapsulamento_Java;

public class MainPessoa {
    public static void main(String[] args) {
        //Criando um Objeto da classe pessoa
        Pessoa p1 = new Pessoa();
        
        //Inserindo valores a classe pessoa
        p1.setNome("Carlos");
        p1.setIdade(20);
        p1.setSenha("123");

        //Mostrando as informações da Pessoa
        p1.info();
    }
}
