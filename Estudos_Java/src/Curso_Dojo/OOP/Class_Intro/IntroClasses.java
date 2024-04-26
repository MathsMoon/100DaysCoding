package Curso_Dojo.OOP.Class_Intro;
import Curso_Dojo.OOP.Class_Intro.Dominio.Estudante;
import Curso_Dojo.OOP.Class_Intro.Dominio.Professor;

public class IntroClasses {
    public static void main(String[] args) {
       //Criando uma variável de referência a classe estudante
        Estudante estudObj = new Estudante();
        //a variável de referência é importante para realizar o link do acesso a memória das informações e para manipular esses dados

        //Inserindo atributos a Classe EstudanteParametros
        estudObj.nome = "Abc";
        estudObj.idade = 10;
        estudObj.sexo = 'M';

//        System.out.println(estudObj.nome);
//        System.out.println(estudObj.idade);
//        System.out.println(estudObj); //Resultado: endereço de memória do Objeto: Curso_Dojo.OOP.Class_Intro.Dominio.EstudanteParametros@5f184fc6

        /*  Manipulando a classe Professor */
        Professor prof1 = new Professor();

        prof1.nome = "Cba";
        prof1.idade = 32;
        prof1.sexo = 'F';

        System.out.printf("%s%n%c%n%d",prof1.nome, prof1.sexo, prof1.idade);
    }
}
