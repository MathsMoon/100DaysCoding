package Curso_Dojo.OOP.DesignPatterns.Dominio;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingEager {
    //Eager Initialization
    private static final AircraftSingEager INSTANCE = new AircraftSingEager("Embraer 190");

    private final Set<String> availableSeat = new HashSet<>();
    private final String Name;

    private AircraftSingEager(String name) {
        Name = name;
    }

    {
        availableSeat.add("1A");
        availableSeat.add("2A");
        availableSeat.add("3A");
        availableSeat.add("1B");
        availableSeat.add("2B");
        availableSeat.add("3B");
    }

    //Método que retorna a instância final da Classe
    public static AircraftSingEager getInstance(){
        return INSTANCE;
    }

    public Boolean bookSeat(String seat){
        return availableSeat.remove(seat);
    }

    public Set<String> getAvailableSeat() {
        return availableSeat;
    }

    public String getName() {
        return Name;
    }
}