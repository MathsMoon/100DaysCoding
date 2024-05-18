package Curso_Dojo.OOP.Collections.DominioTests;

import Curso_Dojo.OOP.Collections.Dominio.Smartphone;

public class TestsEqual {
    public static void main(String[] args){
        /*
        String nome = "William";
        String nome2 = "William";


            O resultado do sout abaixo é verdadeiro devido a limitação do Pool
            de Strings, quando se cria uma String ela é colocada dentro desta
            pool que será guardada e referenciada tanto por nome quanto nome2
            pelo simples fato de que os dois tem como resultado a mesma String
            desta forma o java compreende que não se deve ter redundância de
            criar mais uma String para pool que significa a mesma coisa e faz
            com que os objetos nome e nome2 façam referência a mesma String
            "William"

        System.out.println(nome == nome2);
        */

        /*
            Entretanto ao utilizarmos o mesmo princípio para os Objetos o re-
            sultado é diferente, por mais que os produtos sejam iguais, dife-
            rente das Strings são criados 2 objetos da classe Smartphone que
            possuem o mesmo valor, por mais que os dois devessem apontar para
            o mesmo objeto, devido a equalidade dos valores de referência,
            isso não ocorre por conta de declararmos esses objetos de forma
            distinta, ignorando as informações dentro.

         */
        Smartphone cellphone = new Smartphone("Iphone", "1ABC1");
        Smartphone cellphone2 = new Smartphone("Iphone", "1ABC1");

        System.out.println(cellphone.equals(cellphone2));

    }
}