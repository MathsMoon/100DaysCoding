package CFB_CursoJava.Metodos_java;

public class Args {
    public static void main(String[] args) {
        /*
         
        O Args dentro do método main() recebe valores e guarda dentro da
        Array de String, então podemos utilizar o args para realizar 
        alguma função devido a ele guardar os valores passados.


        Funções do Terminal:
        cls = limpa o terminal.
        javac = compila o arquivo java
        java = executa um arquivo java
        dir = mostra a Estrutura atual do Diretório 
        echo %cd% = mostra a pasta principal atual
        cd (nome) = entra na pasta determinada
        cd .. = recua 1 pasta do link
        mkdir = cria uma pasta no diretório atuak
        mkdir meus_projetos\repositorios\java = cria essa sequência de pastas dentro do diretório atual
        copy = copia um arquivo (duplicando)
        del = deleta um arquivo
        move = pode mover um arquivo ou renomear
        rmdir = apaga uma pasta vazia do diretório
        rmdir /s = apaga uma pasta que contém arquivos
        type = exibe conteúdo de um arquivo
        
        */

        int soma = 0;

        if(args.length == 0) {
            System.out.printf("%s%n", "Sem valores para Mostrar");
            return; //Ao retornar
        }

        for(String n:args) {
            int v = Integer.valueOf(n);
            soma+=v;
        }

        System.out.printf("Soma dos valores é: %d%n", soma);
    }
}
