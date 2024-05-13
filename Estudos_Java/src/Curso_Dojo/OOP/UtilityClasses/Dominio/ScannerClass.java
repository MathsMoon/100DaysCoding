package Curso_Dojo.OOP.UtilityClasses.Dominio;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        //Retirando deste texto tudo que não é nome
        String texto = "Yelan,Furina,Navia,true,200";
        Scanner scan = new Scanner(texto);
        scan.useDelimiter(",");

        while (scan.hasNext()) {
            if(scan.hasNextInt()){
                int num = scan.nextInt();
                System.out.println("Int: "+ num);
            } else if(scan.hasNextBoolean()){
                boolean bool = scan.nextBoolean();
                System.out.println("Boolean: "+bool);
            } else {
                System.out.println(scan.next());
            }
        }


//        String[] nomes = texto.split(",");
//        for (String nome:nomes){
//            System.out.println(nome.trim());
//        }
    }
}