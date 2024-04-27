package Curso_Dojo.OOP.Methods.DominioTests;
import Curso_Dojo.OOP.Methods.Dominio.Associacao1.PersonagemGenshin;
import Curso_Dojo.OOP.Methods.Dominio.Associacao1.RegiaoGenshin;

public class TestsGenshinChr {
    public static void main(String[] args) {
        //Declaração dos Objetos da classe PersonagemGenshin
        PersonagemGenshin PG1 = new PersonagemGenshin("Jean");
        PersonagemGenshin PG2 = new PersonagemGenshin("Sara");
        PersonagemGenshin PG3 = new PersonagemGenshin("Furina");
        PersonagemGenshin PG4 = new PersonagemGenshin("Navia");
        PersonagemGenshin PG5 = new PersonagemGenshin("Mona");
        PersonagemGenshin PG6 = new PersonagemGenshin("Yoimiya");


        //Declarando os Objetos da classe regiaoGenshin
        RegiaoGenshin regiaoGenshin = new RegiaoGenshin("Mondstad");
        RegiaoGenshin regiaoGenshin2 = new RegiaoGenshin("Inazuma");
        RegiaoGenshin regiaoGenshin3 = new RegiaoGenshin("Fontaine");

        //Associação unidirecional entre Objetos. Personagem -> Região
        PG1.setRegiaoGenshin(regiaoGenshin);
        PG2.setRegiaoGenshin(regiaoGenshin2);
        PG3.setRegiaoGenshin(regiaoGenshin3);
        PG4.setRegiaoGenshin(regiaoGenshin3);
        PG5.setRegiaoGenshin(regiaoGenshin);
        PG6.setRegiaoGenshin(regiaoGenshin2);

        //Associação Bidirecional: Junta o de cima + Região -> Personagem
        PersonagemGenshin[] Pgs = {PG1, PG5};
        regiaoGenshin.setPersonagens(Pgs);

        PersonagemGenshin[] Pgs2 = {PG2, PG6};
        regiaoGenshin2.setPersonagens(Pgs2);

        PersonagemGenshin[] Pgs3 = {PG3, PG4};
        regiaoGenshin3.setPersonagens(Pgs3);


        //Mostrando os resultados:
        System.out.println("--- Personagens ---");

        //Criando o Array de Personagens
        PersonagemGenshin[] Characters = new PersonagemGenshin[]{PG1, PG2, PG3};
        //Usando a Array de Personagens:
        for (PersonagemGenshin i: Characters) {
            i.Imprime();
        }

        System.out.println("--- Regiões ---");

        //Criando o Array de Regiões
        RegiaoGenshin[] regioesg = new RegiaoGenshin[]{regiaoGenshin, regiaoGenshin2, regiaoGenshin3};
        //Usando o Array das regiões
        for (RegiaoGenshin rg : regioesg) {
            rg.Imprime();
        }
    }
}