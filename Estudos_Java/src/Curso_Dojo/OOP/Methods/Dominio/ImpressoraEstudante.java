package Curso_Dojo.OOP.Methods.Dominio;

public class ImpressoraEstudante {
    public void Imprime(EstudanteParametros estudante) {
        //Mostrando as informações guardadas dentro do Objeto que manipula a classe estudante
        System.out.println(estudante.getNome());
        System.out.println(estudante.getIdade());
        System.out.println(estudante.getSexo());

        //estudante.Nome = "A";
        /* Diferente do tipo primitivo que cria um cópia e não é possível alterar o original, o objeto é referenciado
        * ou seja: ele é criado e pode ser utilizado em uma função mostrando seus valores como é possível também altera-los
        * por não ser uma cópia, mas o Objeto original referenciado que está sendo usado.*/

    }
}
