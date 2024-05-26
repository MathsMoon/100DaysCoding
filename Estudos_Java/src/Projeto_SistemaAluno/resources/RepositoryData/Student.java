package Projeto_SistemaAluno.resources.RepositoryData;

import java.util.Objects;

/*
    Preciso rever o código para construir melhor a classe
    e atribuir corretamente os valores.
*/


public class Student {
    private int ID;
    private String Nome;
    private int Turma;
    private long NotasAvaliativas;
    private long Presenca;

    public Student(int id, String nome, int turma) {
        ID = id;
        Nome = nome;
        Turma = turma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return ID == student.ID && Turma == student.Turma && Objects.equals(Nome, student.Nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, Nome, Turma);
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", Nome='" + Nome + '\'' +
                ", Turma=" + Turma +
                ", NotasAvaliativas=" + NotasAvaliativas +
                ", Presenca=" + Presenca +
                '}';
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getTurma() {
        return Turma;
    }

    public void setTurma(int turma) {
        Turma = turma;
    }

    public long getNotasAvaliativas() {
        return NotasAvaliativas;
    }

    public void setNotasAvaliativas(long notasAvaliativas) {
        NotasAvaliativas = notasAvaliativas;
    }

    public long getPresenca() {
        return Presenca;
    }

    public void setPresenca(long presenca) {
        Presenca = presenca;
    }
}