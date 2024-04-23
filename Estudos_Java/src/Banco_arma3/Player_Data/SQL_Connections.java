package Banco_arma3.Player_Data;
import java.io.IOException;
import Banco_arma3.App;
// import Banco_arma3.Functionality;

public class SQL_Connections {
    
    /* Quando aprender a realizar conexões BackEnd 
    
        Enquanto não sei criar uma conexão via Spring ou qualquer outra API. 
        
        Problemas:
        - Refazer funções para receber as informações e verificar se condizem com as regras de criação
        - 

    */

    private String PlayerName = "";
    private String PlayerLogin = "";
    private String PlayerPassWord = "";
    private int PlayerBalance;
    private int PlayerCollectedDogTags;
    Players_Register Database = new Players_Register();

    public void SQL_Connections(String Login, String PassWord, String Nickname, int Dogtag, int ActualBalance) {
        this.PlayerName = Nickname;
        this.PlayerLogin = Login;
        this.PlayerPassWord = PassWord;
        this.PlayerBalance = ActualBalance;
        this.PlayerCollectedDogTags = Dogtag;

        //Crie a Condição para essas informações irem para o Banco de dados

    }


    public void VerifyUserLoginRegister(String s) {
        /*
            Função irá realizar dois testes, o primeiro é a regra que estabeleci para criar um Usuário
            (Mais de 5 letras, contenha números e 1 caractere especial) Ao mesmo tempo que realiza um
            teste de Leitura das infomrações já guardadas no Register para confirmar que o Login é disponível para este usuário
        */
    }

    public void VerifyUserPassWordRegister(String s) {
        //A função irá realizar um teste para que a Senha contenha no mínimo 8 Caracteres (espaço n incluso)
    }

    public void setUserName(String s) {
    }

    public void setUserActualBalance(int i) {
    }

    public void setUserNumDogTags(int i) {
    }

    public String getUserName() {
        return this.PlayerName;
    }
}