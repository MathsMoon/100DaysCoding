package Curso_Dojo.OOP.Methods.DominioTests;

import Curso_Dojo.OOP.Methods.Dominio.Associacao2.Escola;
import Curso_Dojo.OOP.Methods.Dominio.Associacao2.Professor;

public class TestsEscola {
    public static void main(String[] args) {
        //Criação e manipulação dos objetos
        Professor professor = new Professor("Lisa");
        Professor professor1 = new Professor("Collei");
        //Para inserir os professores ao construtor da Escola precisa converter em um Array de Objetos
        Professor[] professores = {professor, professor1};

        //Criando o objeto Escola
        Escola school = new Escola("Akademia", professores);

        //Mostrando o resultado
        school.Imprime();
    }
}
