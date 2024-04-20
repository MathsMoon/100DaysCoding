package Banco_arma3.Player_Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import Banco_arma3.Functionality;

public class Players_Register {
    /* Esqueleto para a criação de um cadastro Geral tanto para o Banco como para o Mercado 
     
    Problemas:
    - Refazer a função de Database_info (preciso mostrar quais os itens guardados)
    - Refazer a função de Database (Para receber as informações de outros arquivos e guarda-lá)
    - Criar uma função para Receber um Index que procurará dentro da lista um Array em específico
    
    */

    //Criando a Lista:
    static List<String> Players_Lists = new ArrayList<String>(Arrays.asList());


    // SQL_Connections pObj = new SQL_Connections();

    // public Object QueryIndexOfPlayersDB(String index) {
    //     //Método funcionará como uma busca pelo banco de dados se orientando pelo index que é o login
    //     //O login será o ID para destacar os players.
    //     return index;
    // }

    public static void DATABASE_INFO() {
        for(String a:Players_Lists) {
            System.out.println(a);
        }
    }


    public static void DATABASE(String[] Player_Info) {
        //Recebendo as informações e colocando dentro de um Array referência
        String[] Player_Data = Player_Info;

        //Método de criação de registro na Lista
        for(int i = 0; i<Players_Lists.size(); i++) {
            if(!Player_Data.equals(Players_Lists.get(i))) {
                Players_Lists.addAll(Players_Lists);
                System.out.println("Cadastro realizado!");
            } else {
                System.out.println("Cadastro já existe, por favor realize o login");
                Functionality.Login();
            }
        }
    }
}