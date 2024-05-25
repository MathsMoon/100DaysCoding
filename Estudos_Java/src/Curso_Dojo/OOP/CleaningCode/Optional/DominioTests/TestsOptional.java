package Curso_Dojo.OOP.CleaningCode.Optional.DominioTests;

import java.util.List;
import java.util.Optional;

/*
    Para contornar os possíveis erros que podem existir ao procurar um
    valor que não existe na lista, podemos utilizar o Optional como
    uma forma de tratar estes erros, ou seja, ele vai retornar
    valores como forma de evitar um Runtime error quando for buscar
    valores dentro de uma lista.
*/


public class TestsOptional {
    public static void main(String[] args) {
        //Maneiras de receber um Optional vazio
        Optional<String> o1 = Optional.ofNullable(null);
        Optional<String> o2 = Optional.empty();

        /*
            A estrutura do Optional abaixo usa ofNullable para caso
            ele receba um null como resultado da busca, e o orElse
            como uma resposta a um nome não encontrado da Lista
            assim ele trata o possível erro que iria ocorrer devido
            ao valor não ter sido encontrado dentro da Lista.
         */

        Optional<String> nameOptional = Optional.ofNullable(findName("Layla"));
        String empty = nameOptional.orElse("Não Encontrado");
        System.out.println(empty);
    }

    private static String findName(String name){
        List<String> listNames = List.of("Layla", "Collei", "Shinobu", "Sucrose");

        int i = listNames.indexOf(name);
        if(i != -1){ //Ele usa o -1 devido o IndexOf retornar ou o index ou -1 caso n exista.
            return listNames.get(i);
        }
        return null;
    }

    //Método correto para usar junto ao Optional:
    private static Optional<String> findNameOp(String name){
        List<String> listNames = List.of("Layla", "Collei", "Shinobu", "Sucrose");

        int i = listNames.indexOf(name);
        if(i != -1){ //Ele usa o -1 devido o IndexOf retornar ou o index ou -1 caso n exista.
            return Optional.of(listNames.get(i));
        }
        return Optional.empty();
    }
}