package Curso_Dojo.Junit.Service;

import Curso_Dojo.Junit.Dominio.Person;

import java.util.Objects;

public class PersonService {
    public boolean isAdult (Person person){
        Objects.requireNonNull(person, "Person can't be null");
        return person.getAge() >= 18;
    }
}