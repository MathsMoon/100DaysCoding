package Atividades_avulso.SistemaCalculo;

public class DadosUsuario {
    private final String NOME = "ABC";
    private final int SENHA = 12345;

    public String getNome() {
        return NOME;
    }

    public int getSenha() {
        return SENHA;
    }

    public boolean Login(String nome,int senha) {
        if(nome.equals(getNome()) && getSenha() == senha) {
            return true;
        }
        System.out.println("-----------------------------------");
        System.out.println("Login inserido com informações incorretas!");
        System.out.println("-----------------------------------");
        return false;
    }
}