package Curso_Dojo.Atividades.ExercAssociation.Domain;

public class GenshinCharList {
    private String Nome;
    private String Regiao;

    public GenshinCharList() {}

    public void Imprime() {
        System.out.println(Nome);
        if(Regiao == null) {
            System.out.println("Região não preenchida");
        }
        else {
            System.out.println(getRegiao());
        }
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getRegiao() {
        return Regiao;
    }

    public void setRegiao(String regiao) {
        Regiao = regiao;
    }
}