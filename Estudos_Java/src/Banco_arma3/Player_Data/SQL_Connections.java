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
    private int PlayerBalance = 0;
    private int PlayerCollectedDogTags = 0;
    Players_Register Database = new Players_Register();


    public void CreatingNewRegisterInBank() {
        String[] PlayersInfo = {getUserName(), String.valueOf(getUserActualBalance()), getUserLogin(), getUserPassWord(), String.valueOf(getUserNumDogTags())};
        
        Players_Register.DATABASE(PlayersInfo);
    }

    public void setUserActualBalance(int balance) {
        this.PlayerBalance = balance;
    }

    public int getUserActualBalance() {
        return this.PlayerBalance;
    }

    public void setUserName(String nome) {
        this.PlayerName = nome;
    }

    public String getUserName() {//Retorna o nome do Player (NickName)
        return this.PlayerName;
    }


    public boolean getVerifyUserCredentials(String[] credentials) {
        
        return true;
    }

    public void VerifyUserLoginRegister(String string) {
        //Realizar uma leitura da variável e retornar se é maior que 5 e se contém número e um caracterer especial.
    }

    public String getUserLogin() {
        return this.PlayerLogin;
    }

    public String getUserPassWord() {
        return this.PlayerPassWord;
    }



    public void VerifyUserPassWordRegister(String nextLine) {
        //Realizar teste de variável para saber se contém no mínimo 8 caracteres.
    }

    public void setUserNumDogTags(int dogtags) {
        if(dogtags < 0 || dogtags > 100) {
            System.out.println("Insira um valor correto");
            try {
                App.Register();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else {
            this.PlayerCollectedDogTags = dogtags;
        } 
    }   

    public int getUserNumDogTags() {
        return this.PlayerCollectedDogTags;
    }

}
