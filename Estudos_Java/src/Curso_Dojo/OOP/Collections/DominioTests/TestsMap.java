package Curso_Dojo.OOP.Collections.DominioTests;

import java.util.HashMap;
import java.util.Map;

public class TestsMap {
    public static void main(String[] args) {
        /*
        Funciona através de uma linkagem de 2 valores
        a String chave e seu valor, desta forma podemos declarar abaixo
        a

         */
        Map<String, String> map = new HashMap<>();
        map.put("teklado","teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.putIfAbsent("vc", "você2"); //Caso o valor já não exista no Map ele inserer.
        System.out.println(map);

        for (String key:map.keySet()){
            System.out.println(key);
        }
    }
}