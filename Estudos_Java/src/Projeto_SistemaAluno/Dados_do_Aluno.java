package Projeto_SistemaAluno;
public class Dados_do_Aluno { //Classe Dedicada ao Cadastro de Alunos ou da sua validação
    //Definindo o padrão do Cadastro Aluno para a classe de cadastro.
    private String NOME_ALUNO;
    private String CLASSE_ALUNO;
    private int RA;
    private int SENHA_ALUNO;
    private String ESCOLA;


    public void setNome(String nome) {
        this.NOME_ALUNO = nome;
    }

    public String getNome() {
        return this.NOME_ALUNO;
    }

    public void setClasseAluno(String classeAl) {
        this.CLASSE_ALUNO = classeAl;
    }

    public String getClasseAluno() {
        return this.CLASSE_ALUNO;   
    }

    public void setRA(int ra) {
        this.RA = ra;
    }

    public int getRA() {
        return this.RA;
    }

    public void setSenha(int senha) {
        this.SENHA_ALUNO = senha;
    }

    public int getSenha() {
        return this.SENHA_ALUNO;
    }

    public void setEscola(String escola) {
        this.ESCOLA = escola;
    }

    public String getEscola() {
        return this.ESCOLA;
    }

    // public void ValidacaoDados() {
    //     Object[] dados = (Object[]) new Object();
        
    // }


    public void InfoAluno(){
        System.out.println("-------------------------------");
        System.out.printf("%nNome Aluno:%s", this.NOME_ALUNO);
        System.out.printf("%nClasse Aluno:%s", this.CLASSE_ALUNO);
        System.out.printf("%nEscola do Aluno:%s", this.ESCOLA);
        System.out.printf("%nNome Aluno:%s%n", this.NOME_ALUNO);
        System.out.println("-------------------------------");
    }

}