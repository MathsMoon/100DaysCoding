package Curso_Dojo.OOP.DesignPatterns.Dominio;

import java.util.HashSet;
import java.util.Set;

public class Aircraft {
    private final Set<String> availableSeats = new HashSet<>();

    {
        availableSeats.add("1A");
        availableSeats.add("2A");
    }



}