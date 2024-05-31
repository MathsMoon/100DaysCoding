package Projeto_SistemaAluno.resources.JavaClasses;

import java.util.Objects;

public class Person {
    private String Name;
    private String PhoneNumber;
    private PersonType PType;
    private int ID;

    public Person(String name, String phoneNumber, PersonType PType) {
        Name = name;
        PhoneNumber = phoneNumber;
        this.PType = PType;
    }

    public Person(String name, String phoneNumber, PersonType PType, int ID) {
        Name = name;
        PhoneNumber = phoneNumber;
        this.PType = PType;
        this.ID = ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return ID == person.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ID);
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", PType=" + PType +
                ", ID=" + ID +
                '}';
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public PersonType getPType() {
        return PType;
    }

    public void setPType(PersonType PType) {
        this.PType = PType;
    }
}