package Curso_Dojo.OOP.AbstractsClasses.Dominio;

public abstract class Pessoa {

    /*
        Neste caso estou declarando uma classe Superior ao Funcionário que é a classe pessoa e coloquei nesta classe
        a função de imprimir, como funcionário herda de herança está função existem 2 formas de fazer funcionar o código
        ou todas as classes que herdam funcionário implementam está função, ou você cria por padrão um template de impressão
        dentro da classe funcionário e deixa que as demais classes abaixo usem esta função, mas é interessante pensar
        que podemos sobrescrever qualquer método das classes abstratas, portanto caso seja necessário alterar o print
        de Funcionário, basta alterarmos nas classes netas o seu respectivo resultado.
     */

    public abstract void Imprime();
}
