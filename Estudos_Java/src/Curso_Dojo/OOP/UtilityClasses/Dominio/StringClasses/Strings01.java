package Curso_Dojo.OOP.UtilityClasses.Dominio.StringClasses;

public class Strings01 {
    public static void main(String[] args) {
        /*
            As string são imutavéis até que se realize uma nova associação
            os valores dentro das variáveis permancem os mesmos, apesar de forçarmos
            mudança.
         */

        String nome = "Luis";
        String nome2 = "    Luis";

        //Nome 3 é um objeto que referência ao Luis dentro da Pool de Strings, então é uma referência que referencia a Luis.
        String nome3 = new String("Luis");
        System.out.println(nome2);
        System.out.println(nome == nome3.intern()); //Resultado é true, devido ao nome3 fazer referência ao Luis da Pool

        //Tentando alterar o nome:
        nome.concat("Alves"); //Concat não vai alterar o nome por ser imutável
        System.out.println(nome);

        //Apenas criando essa nova associação ocorre a alteração do valor da variável
        nome = "    Luis alves  ";
        //Mostrando resultados:
        System.out.println(nome.trim()); // Ele ignora os espaços entre o nome, mas apaga os espaços a mais
        System.out.println(nome == nome2); //Verificando se a referência de nome é igual a referência do nome2

        /* Possíveis comandos para a String:
        nome.chartAt(); retorna o caractere na posição designada.
        nome.lenght(); retorna o tamanho da String.
        nome.replace(target, replacement); retorna uma String após trocar um Caractere por outro.
        nome.ToLowerCase()/ToUpperCase(); retorna a String toda em maíusculo ou minusculo
        nome.substring(); retorna a String de acordo com os index que você definiu.
        caso você não coloque o segundo valor na substring ela compreende que é apartir daquele ponto até o fim da String
        nome.trim(); retorna uma String sem qualquer espaço em branco a mais que tiver.
        */
    }
}