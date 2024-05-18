package Curso_Dojo.OOP.Collections.DominioTests;

import Curso_Dojo.OOP.Collections.Dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class TestsLists2 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("Iphone", "1x#BC002");
        Smartphone s2 = new Smartphone("Samsung", "5x#FW089");
        Smartphone s3 = new Smartphone("Motorola", "3x#RP090");
        Smartphone s4 = new Smartphone("Redmi", "0x#AA001");

        List<Smartphone> smartphones = new ArrayList<>();
        //Se não for declarado sua posição de index, o java organiza por ordem de chamada
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);
        smartphones.add(s4);
        //smartphones.clear() => Apaga todos itens da lista.

        System.out.println("------------- LOOP PHONES ----------------");
        for (Smartphone sm: smartphones){
            System.out.println(sm);
        }

        System.out.println("------------- SEARCHING S5 ---------------");
        //Realizando Pesquisa na Lista:
        Smartphone s5 = new Smartphone("Redmi", "0x#AA001");

        //Operação ternária que retorna o Index de onde pode estar o s5 que contém informações do s4.
        System.out.println(smartphones.contains(s5) ? "Index do s5: "+ smartphones.indexOf(s5) : "Não encontrado");
        System.out.println("Os objetos s4 e s5 são iguais? " + s4.equals(s5)); //Mostrando que os dois são os mesmos por mais que sejam diferentes objetos.
    }
}