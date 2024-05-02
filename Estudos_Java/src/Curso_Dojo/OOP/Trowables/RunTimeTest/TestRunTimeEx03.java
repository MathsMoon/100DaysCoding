package Curso_Dojo.OOP.Trowables.RunTimeTest;

/*
    O finally é utilizado quando é necessário finalizar um bloco códi
    -go mesmo que tenha erro, este comando continua o bloco de código
    mesmo após capturar algum erro, ajudando em caso de precisar fechar
    conexões (como foi imaginado no exemplo abaixo) ou demais funcionali
    -dades usadas, por tanto pode-se usar tanto com ou sem o Catch, por
    mais que seja recomendado sempre especificar o erro para tornar fácil
    a visualização e correção do código.
 */


public class TestRunTimeEx03 {

    public static String Connection() {
        try {
            System.out.println("Abrindo Arquivo");
            System.out.println("Escrevendo no Arquivo");
            return "Conexão Aberta";
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("Salvando Informações do Arquivo");
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Connection());
    }
}