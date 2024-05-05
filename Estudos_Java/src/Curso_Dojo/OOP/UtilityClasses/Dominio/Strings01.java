package Curso_Dojo.OOP.UtilityClasses.Dominio;

public class Strings01 {
    public static void main(String[] args) {
        /*
            As string são imutavéis até que se realize uma nova associação
            os valores dentro das variáveis permancem os mesmos, apesar de forçarmos
            mudança.
         */

        String nome = "Luis";
        String nome2 = "Luis";

        //Nome 3 é um objeto que referência ao Luis dentro da Pool de Strings, então é uma referência que referencia a Luis.
        String nome3 = new String("Luis");
        System.out.println(nome == nome3.intern()); //Resultado é true, devido ao nome3 fazer referência ao Luis da Pool

        //Tentando alterar o nome:
        nome.concat("Alves"); //Concat não vai alterar o nome por ser imutável
        System.out.println(nome);

        //Apenas criando essa nova associação ocorre a alteração do valor da variável
        nome = "Luis alves";

        //Mostrando resultados:
        System.out.println(nome);
        System.out.println(nome == nome2); //Verificando se a referência de nome é igual a referência do nome2
    }
}