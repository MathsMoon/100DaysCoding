package Atividades_avulso;

import java.util.Scanner;

public class ManipulandoStrings {

    public static void PickingFirstAndLastName(String nome){
        if(nome.contains(" ")) {
            String[] arrayofname = nome.split(" ");

            System.out.println("------------------------------");
            System.out.println("Seu primeiro nome: " + arrayofname[0]);
            System.out.println("Seu último nome: " + (arrayofname[arrayofname.length - 1]));
        } else {
            System.out.println("Nome escrito de forma Incorreta, por favor utilize espaço entre nos nomes!");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite Seu Nome Completo espaçando entre cada nome: ");
        String nome = scan.nextLine();

        PickingFirstAndLastName(nome);
    }
}