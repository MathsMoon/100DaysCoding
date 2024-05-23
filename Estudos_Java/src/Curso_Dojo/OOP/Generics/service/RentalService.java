package Curso_Dojo.OOP.Generics.service;

import java.util.List;

/*
    O maior problema de mexer com diversas classes é a necessidade de um ambiente
    específico para cada uma, para que adequadamente seus objetos sejam manipulados
    da melhor forma possível, e para não ocorrer como nos Generics feitos, tendo que
    construir um ambiente para ambos os veículos, temos como Generalizar a pesquisa
    através do comando <T> que representa tipo, este tipo genérico é identificado na
    hora da compilação e consegue adequar o objeto ao tipo específico na hora que está
    rodando.

    reformulando tudo para o T, estamos generalizando o Tipo para que ele encontre durante
    a pesquisa, afinal quando passarmos o objeto também identificamos seu tipo e fazemos
    uso de suas funcionalidades. Para usar classes que extedem elementos como o Comparable
    ou Comparator basta usar o extends ao T para aplicar também a generalização, mas cuidando
    para que não afete as classes que não usem este princípio.
*/

public class RentalService<T> {
    private final List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscaObjetoDisponivel(){
        System.out.println("Buscando Objeto disponível.........");
        T t = objetosDisponiveis.removeFirst();
        System.out.println("Alugando o Objeto: "+ t);
        System.out.println("Objetos disponíveis para alugar: ");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarObjetoAlugado(T t){
        System.out.println("Devolvendo objeto: " + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponíveis para alugar: ");
        System.out.println(objetosDisponiveis);
    }
}