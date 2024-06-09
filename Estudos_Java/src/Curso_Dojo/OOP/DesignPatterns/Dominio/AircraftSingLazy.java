package Curso_Dojo.OOP.DesignPatterns.Dominio;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingLazy {
    private static AircraftSingLazy INSTANCE;

    private final Set<String> availableSeat = new HashSet<>();
    private final String Name;

    private AircraftSingLazy(String name) {
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

    /*
        Caso a operação não seja declarada via Final na classe
        para evitar conflitos de Threads ou de simultanêamente
        ocorrer de a instância ser criada 2 vezes, podemos usar
        temporariamente o double lock para fechar a possbilidade
        de ocorrência deste caso, usando a forma abaixo como
        exemplo:
     */
    public static AircraftSingLazy getInstance(){
        if(INSTANCE == null){
          synchronized (AircraftSingLazy.class){
              if(INSTANCE == null){
                  INSTANCE = new AircraftSingLazy("Embraer 190");
              }
          }
        }
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