package Projeto_SistemaAluno.resources.JavaClasses;

import java.util.Arrays;

public class Student extends Person {
    private double Presence;
    private double[] notas;

    public Student(String name, String phoneNumber, PersonType PType, int Matricula) {
        super(name, phoneNumber, PType);
        super.setID(Matricula);
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "Presence=" + Presence +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }

    public void setPresence(double presence) {
        Presence = presence;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double getPresence() {
        return Presence;
    }

    public double[] getNotas() {
        return notas;
    }
}