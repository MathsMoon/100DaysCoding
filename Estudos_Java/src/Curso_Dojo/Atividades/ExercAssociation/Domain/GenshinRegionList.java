package Curso_Dojo.Atividades.ExercAssociation.Domain;

public class GenshinRegionList {
    private final String Nome;
    private GenshinCharList[] Personagens;

    //Construtor da Classe Genshin region:
    public GenshinRegionList(String nome,GenshinCharList[] personagens) {
        Nome = nome;
        Personagens = personagens;
    }

    public void Imprime() {//Função que retorna as informações da Região
        System.out.println(Nome);
        if(Personagens == null) return;
       for (GenshinCharList characters:Personagens) {
           System.out.println(characters.getNome());
       }
    }

    public String getNome() {
        return Nome;
    }

    public GenshinCharList[] getPersonagens() {
        return Personagens;
    }

    public void setPersonagens(GenshinCharList[] personagens) {
        Personagens = personagens;
    }
}