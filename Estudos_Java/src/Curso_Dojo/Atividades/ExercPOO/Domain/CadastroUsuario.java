package Curso_Dojo.Atividades.ExercPOO.Domain;

public class CadastroUsuario {
    private String Nome;
    private String Senha;
    private int idade;

    public CadastroUsuario(String nome, String senha, int idade) {
        Nome = nome;
        Senha = senha;
        this.idade = idade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        char ch;
        boolean HasSpace = true;
        boolean HasCapitalLetter = false;
        boolean setname = false;

        while (!setname) {

            for(int i = 0; i < nome.length(); i++) {
                ch = toString().charAt(i);

                if(Character.isUpperCase(ch)) {
                    HasCapitalLetter = true;
                } else {
                    System.out.println("Nome não possui uma letra em Maíusculo");
                }
                if (!Character.isWhitespace(ch)) {
                    HasSpace = false;
                } else {
                    System.out.println("Nome possui espaço, siga as regras!");
                }
            }

            if(HasCapitalLetter && !HasSpace) {
                Nome = nome;
                setname = true;
            }
        }
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}