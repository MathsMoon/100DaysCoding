package Curso_Dojo.OOP.CleaningCode.Streams.DominioTests;

import Curso_Dojo.OOP.CleaningCode.Streams.Dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class TestsReduce2 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("그녀가 공작저로 가야 했던 사정", 4.22),
            new LightNovel("Hina to Bambi", 2.99),
            new LightNovel("Renai Daikou", 1.50),
            new LightNovel("Renai Daikou", 1.50),
            new LightNovel("Sakurasou no pet na Kanojo", 5)
    ));

    public static void main(String[] args) {
       /*
            Realizando uma consulta na stream dos objetos que somam mais de 3 reais,
            assim retornando a soma dos valores destes produtos.

            primeiro se mapea buscando organizar a lista pelo preço,
            usando o filtro em uma lista já organizada é economizado processamento,
            após a filtragem é feito o reduce que é a recursão da função soma para cada elemento da lista
            por fim se este último passo deu certo e existe na lista, ele é mostrado na tela
        */
        lightNovelList.stream().
               map(LightNovel::getPrice).
               filter(price -> price > 3).
               reduce(Double::sum).
               ifPresent(System.out::println);

        /*
            O maior problema do código acima é a perca de rendimento
            devido a macissa troca de objeto do tipo Opcional para
            Wrapper constantemente, assim tornando a aplicação
            mais lenta para softwares mais robustos, para contornar
            isso é necessário se utilizar os métodos Streams dos tipos
            primitivos como: DoubleStream, IntStream, LongStream e etc..

            para acessar esses valores basta mapear utilizando o mapTo(tipo)
            assim ele já organiza esses valores como mostrado abaixo:


            após a filtragem só utilizar o sum que já transforma este elemento para o
            tipo que você está mexendo, assim cria uma variável que recebe e retorna
            este mesmo valor.
        */

        double sum = lightNovelList.stream().
                mapToDouble(LightNovel::getPrice).
                filter(price -> price > 3).
                sum();

        System.out.println(sum);
    }
}