import java.util.Scanner;

public class NotasSys {

    public static void Aluno (int Aluno, int Senha) {
        /*Por hora vou deixar como apenas números, para que depois eu veja como é 
        a criação de um statement na qual o If pergunta se o objeto aluno é igual a String "Matheus", 
        apenas objetos podem ter valores comparados quando se fala em String.
        
        if (Aluno.equals("Matheus") && Senha == 123) {
            System.out.printf("Seja Bem-vindo ao Programa de suas notas %s", Aluno);
        } else {   
            System.out.println("Login Errado");
        }
        */
        /* Mantém aqui enquanto eu testo o While
        String a = "MATHEUS";

        if (Aluno == 111111 && Senha == 1234) {
            System.out.printf("Seja Bem-Vindo %s!\n", a);
        } else if (Aluno != 111111 || Senha != 1234 ) {
            System.out.println("Usuário ou Senha incorreto");
            
        } else {
            System.out.println("Usuário não existe!");
        }
        */
        String a = "MATHEUS";

        while (true) {
            if (Aluno == 111111 && Senha == 1234) {
                System.out.printf("Seja Bem-Vindo %s!\n", a);
            } else if (Aluno != 111111 || Senha != 1234 ) {
                System.out.println("Usuário ou Senha incorreto");
                
            } else {
                System.out.println("Usuário não existe!");
            }
        }
    }

    public static float Notas (float n1,float n2, float n3, float n4) {

        if ((n1 + n2 + n3 + n4)/4 >= 6.6) {
            System.out.println("Aprovado");
        } else if ((n1 + n2 + n3 + n4)/4 <= 6.5 && (n1 + n2 + n3 + n4)/4 > 6) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        return n1;
    }

    public static void main(String[] args) {
        //Criação de variáveis:
        int RA;
        int senha;
        Float a, b, c, d;

        //Criação de Objeto de Scanner
        Scanner scan = new Scanner(System.in);

        //introdução do sistema e inserção de dados
        System.out.println("Seja Bem-vindo para prosseguir escreva seu RA e senha.");
        System.out.println("RA:");
        RA = scan.nextInt();
        System.out.println("Senha: ");
        senha = scan.nextInt();
        

        //Confirmação de Login e Senha
        Aluno(RA, senha);

        //Estrtura do programa em si
        System.out.println("Escreva em sequência suas notas: ");
        String notas = scan.nextLine();

        a = Float.parseFloat(notas.split(" ")[0]);
        b = Float.parseFloat(notas.split(" ")[1]);
        c = Float.parseFloat(notas.split(" ")[2]);
        d = Float.parseFloat(notas.split(" ")[3]);

        //Cálculo e resultado
        Notas(a, b, c, d);
        scan.close();
    }
}