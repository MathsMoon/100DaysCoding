package Curso_Dojo.OOP.UtilityClasses.RegexClasses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher3 {
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
         */

        //Encontrando valores inseridos corretamente de forma Hexadecimal
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        /*
        A estrutura acima lê-se: Pegue todo número que começa com 0 e tenha x depois,
        que possua caracteres de 0 a 9, de a - f maíusculo ou minúsculo 1 ou mais vezes e que
        termine ou com espaço em branco ou no fim da linha(texto).
        */

        String text = "8329A4138 B1821 1s 01 0x3 0x1 0x2012f 0x1d";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("Texto: " + text);
        System.out.println("Regex: "+ regex);
        System.out.println("Posições encontradas: ");

        while (matcher.find()) {
            System.out.println(matcher.start()+" "+matcher.group()+" ");
        }
    }
}