package CFB_CursoJava.Jogo_da_Velha;

public class Campo {
    //Criando o simbolo que vai receber o X, O e o 0
    private char simbolo;

    public Campo() {//O Método construtor define que o campo do jogo é vazio por padrão
        this.simbolo = ' ';
    }

    public char getSimbolo() {
        return this.simbolo;
    }

    public void setSimbolo(char simbolo) {//Função que pega o Simbolo do jogador
        //A condição If verifica se o campo está vazio para receber ou n o símbolo do jogador.
        if(this.simbolo == ' '){
            this.simbolo = simbolo;
        } else {
            System.out.println("Campo já Usado");
        }
    }
}
