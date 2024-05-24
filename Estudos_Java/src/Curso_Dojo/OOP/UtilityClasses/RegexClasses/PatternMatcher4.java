package Curso_Dojo.OOP.UtilityClasses.RegexClasses;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher4 {
    /*
        O Pattern Matcher é utilizado como um match de informações dentro de um texto
        é usado para encontrar dentro de algum parâmetro valores colocados na regex,
        desta forma o padrão é compilado e o Matcher encontra este padrão dentro de
        uma estrutura designada.
     */
    public static void main(String[] args) {
        /*Meta Caracteres:
            \d => Todos os dígitos;
            \D => Tudo que não for dígito;
            \s => Espaços em branco (\t \n \f \r);
            \S => Todos os caracteres exceto os brancos;
            \w => A-Z e a-z, dígitos e _ (sem espaço em branco)
            \W => Retorna todos os caracteres especiais e espaços em branco
            [] => Usado para retornar letras ou caracteres específicados;
            ? => Zero ou uma ocorrência
            * => Zero ou mais ocorrências
            + => Uma ou mais ocorrências
            {n,n} => de n até n
            () => Agrupamento
            | o(v|c)o => Retorna o agrupamento tanto de Ovo como Oco, o | separa os elementos do agrupamento
            $ => Fim da Linha
            . => o ponto retorna os valores que contenha inicio x e final y, exemplo (1.2 -> retorna tudo que tiver 1 e 2 como início ou fim)
            ^ => Aponta tudo que é começo da linha e usado com [] pode negar os caracteres especificados.
         */

        //Encontrando e-mails válidos:
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String text = "awawawa@uwu.com, a.gmail.com, lucasS%@gmail.com.br, W.10@gmail.com.us, %20oi.@gamil.com";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("E-mails: "+ Arrays.toString(text.split(",")));
        System.out.println("Regex: "+ regex);
        System.out.println("Posições encontradas: ");

        while (matcher.find()) {
            System.out.println(matcher.start()+" "+matcher.group()+" ");
        }

        //Criar código que mostra os e-mails Inválidos:

//        System.out.println("E-mails Inválidos: ");
//        for (int i = matcher.groupCount(); i > 0; i--){
//            if(matcher.find()){
//                System.out.println(matcher.start()+" "+matcher.group()+" ");
//            }
//        }
    }
}