package Atividades_avulso;

public class CompareToExe {
    public static void main(String[] args) {
        String[] nomes = {"Roberto", "Alisson", "Bruno", "Marcos", "Ana"};
        String a = "a";

//        for (String nome:nomes) {
//            if(nome.startsWith(a.toUpperCase())) {
//                System.out.println("Nomes da lista que começam com a Letra \"A\": " + nome+".");
//            }
//        }

        /*TODO
            Revisar depois este código, era para a lista de nomes aparecer 2 vezes de forma contrária, mas tem
            nomes que se repetem mais de uma vez e não é claro o motivo, resultado do último teste:

    Loop i Ana
    ----------
    Loop l Roberto
    Loop i Marcos
    ----------
    Loop l Roberto
    Loop i Bruno
    ----------
    Loop l Roberto
    Loop i Alisson
    ----------
    Loop l Roberto
    Loop i Ana
    ----------
    Loop l Alisson
    Loop i Marcos
    ----------
    Loop l Alisson
    Loop i Bruno
    ----------
    Loop l Alisson
    Loop i Alisson
    ----------
    Loop l Alisson
    Loop i Ana
    ----------
    Loop l Bruno
    Loop i Marcos
    ----------
    Loop l Bruno
    Loop i Bruno
    ----------
    Loop l Bruno
    Loop i Alisson
    ----------
    Loop l Bruno
    Loop i Ana
    ----------
    Loop l Marcos
    Loop i Marcos
    ----------
    Loop l Marcos
    Loop i Bruno
    ----------
    Loop l Marcos
    Loop i Alisson
    ----------
    Loop l Marcos
    Loop i Ana
    ----------
    Loop l Ana
    Loop i Marcos
    ----------
    Loop l Ana
    Loop i Bruno
    ----------
    Loop l Ana
    Loop i Alisson
    ----------
    Loop l Ana
    */
        for (int l= 0; l < nomes.length; l++) {
            for (int i = nomes.length - 1; i > 0; i--) {
                System.out.println("Loop i " + nomes[i]);
                System.out.println("----------");
                System.out.println("Loop l " + nomes[l]);
            }
        }
    }
}