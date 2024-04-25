package CFB_CursoJava.Strings_in_Java;

public class strings {
    public static void main(String[] args) {
        //A String além de uma classe serve também como um array de char
        char[] texto_c = {'c', 'u', 'r', 's', 'o', ' ', 'd', 'e', ' ', 'J', 'a', 'v', 'a'};
        String texto_s = "CFB Cursos";

        //Manipulando os objetos s1 e s2.
        String s0 = "CFB";
        String s1 = "cUrso CFB";
        String s2 = texto_s; //recebe o texto_s
        String s3 = new String(texto_c); //Não precisa de conversão afinal a String além de ser uma classe ela também recebe chars em sequência como um Array
        String s4 = new String(texto_c, 0, 5); //recebe "curso" do texto_c
        String s5 = " curso de Java";


        //mostrando os resultados
        System.out.println(s1); //Vazio
        System.out.println(s2); //Recebe o texto normal
        System.out.println(s3); //Recebe a Array de Char
        System.out.println(s4); //Recebendo os primeiros 5 valores do Array de char

        //Métodos do String:
        // System.out.println("Tamanho da String s2: " + s2.length()); //Lengt(Mostra quantidade de caracteres dentro da String)
        // System.out.println("O \"c\" desta string está na posição: " + s2.indexOf("C")); //mostrando a posição de um caractere específico dentro da String PS: para saber outro C dentro da mesma string você informa qual é o número dele de index:
        //Exemplo: s2.indexOf("C", 2) => ele retorna o 3º C da string começando pelo 0.
        // System.out.println("Na posição 7 dentro do texto_c está o caractere: " + s3.charAt(7)); //mostrando qual o caractere está em um determinado número da String
        
        /* texto_s.getChars(0, 0, texto_c, 0) => Mesmo princípio do CopyArray: basta informar inicio de onde copiar até o fim para o inicio da copia e aonde para 
        onde salvar tudo que foi copiado da String base.
        */

        /*  Funções com String  */

        //equals vs == (quando usar um ou outro?)
        // if(s0 == s1) {//O resultado é Não são iguais, devido a serem diferentes Objetos, já que o s1 é um objeto instanciado da classe String.
        //     System.out.println("São iguais");
        // } else {
        //     System.out.println("Não são iguais");
        // }

        // if(s0.equals(s1)) {//O resultado agora diz que são iguais, por não compararem os objetos, mas os valores contidos dentro de cada um deles.
        //     System.out.println("São iguais");
        // } else {
        //     System.out.println("Não são iguais");
        // }

        //EqualsIgnoreCase
        // if(s5.equals(s2)) { //O resultado dá errado, por mais que o conteúdo seja o mesmo, a diferença de 1 letra maiuscula ou não afeta a "igualdade" dos termos.
        //     System.out.println("São iguais");
        // } else {
        //     System.out.println("Não são iguais");
        // }

        // if(s5.equalsIgnoreCase(s2)) { //O resultado agora dá iguais, devido justamente a ignorar as diferenças na escrita, considerando apenas o conteúdo.
        //     System.out.println("São iguais");
        // } else {
        //     System.out.println("Não são iguais");
        // }

        //CompareTo
        /*System.out.println(s0.compareTo(s1));
        Retorna um número inteiro como resposta da comparação, um número negativo caso o primeiro membro é menor que o segundo, o positivo inverte o caso 
        e 0 para a igualdade de ambos */

        //regionMatches => Compara apenas partes de uma String com partes de outra, funciona de forma similar ao CompareTo
        // if(s3.regionMatches(true, 0, s5, 0, 0)) {
        //     System.out.println(true);
        // } else {
        //     System.out.println(false);
        // }

        //startsWiths and endsWith => Retorna um valor booleano de True or False para a pergunta, precisa ser o caractere escrito da mesma forma.
        // if(s2.startsWith("C")  && s2.endsWith("s")) {
        //     System.out.println(true);
        // } else {
        //     System.out.println(false);
        // }

        //substring => Retira parte de uma string, semelhante ao match para pegar apenas parte de uma String.
        // System.out.println(s1.substring(1, 9));

        //Concat => Concatena duas Strings
        System.out.println(s0.concat(s5)); 

        //Replace => função que substitui o que estiver de parâmetro por outro, seja um conteúdo completo ou apenas parte dele, exemplo:
        String a = s0.replace("C", "D");
        System.out.println(a); //=> mostra como resultado DFB

        //toLowerCase - toUpperCase => altera todo o conteúdo para Maísculo ou Mínusculo, bom para usar com o == em condições.
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        
        //trim => Remove qualquer espaço seja antes ou depois do contéudo, ele reconheço esses grandes espaços e os remove.
        String b = "    aaaa    ";
        System.out.println(b);
        System.out.println(b.trim()); //Resultado: "aaaa" sem espaços

        //toCharArray => Converte a String em um Array de Char
        char[] Ch_array = s0.toCharArray();
        System.out.println(Ch_array);

        //Split => divide uma String em elementos dentro de um Array.
        String[] split = s5.split(" ");
        
        for(String c:split) {
            System.out.println(c);
        }
    }
}
