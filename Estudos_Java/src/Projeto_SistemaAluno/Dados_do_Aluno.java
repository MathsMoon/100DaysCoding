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

    public void ValidacaoDados(int senha, int ra) {
        if(senha == getRA() && ra == getSenha()) {
            SistemaAluno.Sistema(); //Meio de acessar o Método da classe Sistema_Aluno
        } if (senha != getRA()) {
            System.out.println("Login está incorreto, por favor reescreva!");
            int a = 1;
            SistemaAluno.EscolhendoAcesso(a);

        } else if(ra != getSenha()) {
            System.out.println("Senha está incorreto, por favor reescreva!");
            int a = 1;
            SistemaAluno.EscolhendoAcesso(a);
        }
    }


    public void InfoAluno(){
        System.out.println("-------------------------------");
        System.out.printf("%nNome Aluno:%s", getNome());
        System.out.printf("%nClasse Aluno:%s", getClasseAluno());
        System.out.printf("%nEscola do Aluno:%s%n", getEscola());
        // System.out.printf("%nNome Aluno:%s%n", );
        System.out.println("-------------------------------");
    }
}