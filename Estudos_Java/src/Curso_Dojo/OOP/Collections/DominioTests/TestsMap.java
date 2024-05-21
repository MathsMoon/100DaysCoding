package Curso_Dojo.OOP.Collections.DominioTests;

import java.util.HashMap;
import java.util.Map;

public class TestsMap {
    public static void main(String[] args) {
        /*
            Funcionamento do Map:
            Map funciona como o nome diz, realizando um mapeamento de valores
            através de uma associação que ele faz através da Key e Value
            desta forma podemos organizar uma coleção entre 2 valores
            que não se repetem, abaixo temos um exemplo de uma coleção com map.
         */
        Map<String, String> map = new HashMap<>();
        map.put("teklado","teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.putIfAbsent("vc", "você2"); //Caso o valor já não exista no Map ele inserer.
        System.out.println(map);

        //Métodos de leitura do Map:
        for (String key:map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("------------------");

        for(String key:map.values()){
            System.out.println(key);
        }

        System.out.println("------------------");

        for (Map.Entry<String, String> entry:map.entrySet()){
            System.out.println(entry.getKey() +" - " + entry.getValue());
        }
    }
}