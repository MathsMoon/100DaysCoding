package Projeto_SistemaAluno;

public class Dados_do_Aluno { //Classe Dedicada ao Cadastro de Alunos ou da sua validação
    //Definindo o padrão do Cadastro Aluno para a classe de cadastro.
    String NOME_ALUNO;
    String CLASSE_ALUNO;
    int RA;
    int SENHA_ALUNO;

    public void cadastrandoAluno(String Nome, String ca, int ra, int senha) {//Criando cadastro de Aluno
       this.CLASSE_ALUNO = ca;
       this.SENHA_ALUNO = senha;
       this.RA = ra;
       this.NOME_ALUNO = Nome;
    }

    public void getCadastroAluno(int ra, int senha) { //Método de validação das informações do cadastro Aluno.
        if (ra == this.RA && senha == this.SENHA_ALUNO) {
            System.out.println("-------------------------------");
            System.out.printf("Seja Bem-Vindo: %s!", this.NOME_ALUNO);
        } else if (ra != this.RA || senha != this.SENHA_ALUNO ) {
            System.out.println("Login ou Senha Incorretos");
        } else {
            System.out.println("Por favor fazer cadastro.");
        }
    }
    

    public void InfoAluno() {
        System.out.println("-------------------------------");
        System.out.printf("Dados do Aluno: %s", this.NOME_ALUNO);
        System.out.printf("%nSérie.......: %s", this.CLASSE_ALUNO);
        System.out.printf("%nRA.......: %d", this.RA);
        /* Depois acrescento mais info
        System.out.printf("Série.......: %d", this.CLASSE_ALUNO);
        System.out.printf("Série.......: %d", this.CLASSE_ALUNO);*/
    }

}