package Curso_Dojo.Atividades.ExercAssociation.Domain;

public class GenshinRegionList {
    private final String Nome;

    public GenshinRegionList(String nome) {
        Nome = nome;
    }

    public String getNome() {
        return Nome;
    }

    @Override
    public String toString() {
        return "GenshinRegionList{" +
                "Nome='" + Nome + '\'' +
                '}';
    }
}