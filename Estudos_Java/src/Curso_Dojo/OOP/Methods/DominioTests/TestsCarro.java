package Curso_Dojo.OOP.Methods.DominioTests;

import Curso_Dojo.OOP.Methods.Dominio.Functions.Carro;

public class TestsCarro {
    public static void main(String[] args) {
        //Definindo valores ao Objeto
        Carro C1 = new Carro("BMW", 280);
        Carro C2 = new Carro("Mercedes", 275);
        Carro C3 = new Carro("Audi", 290);

        //Alterando o valor stático para todos os demais veículos
        Carro.setVelLimite(270);
        //Não é possível acessar pelo Objeto, devido ao valor limite ser statico, pertencente a classe e não mais ao Objeto

        //Imprimindo os valores de carro
        C1.Imprime();
        C2.Imprime();
        C3.Imprime();


    }
}
