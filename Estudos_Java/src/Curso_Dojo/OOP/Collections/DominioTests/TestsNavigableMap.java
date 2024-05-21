package Curso_Dojo.OOP.Collections.DominioTests;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TestsNavigableMap {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("a", "Letra A");
        map.put("b", "Letra B");
        map.put("c", "Letra C");
        map.put("d", "Letra D");
        map.put("e", "Letra E");

        for (Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

        //Funções do NavigableMap:
        System.out.println(map.headMap("d")); //Retorna valores anteriores a key d no map

    }
}