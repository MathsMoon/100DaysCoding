package Curso_Dojo.OOP.Methods.Dominio.Associacao1;

public class RegiaoGenshin {
    private String Nome;
    //Para criar uma associação bidirecional começamos criando um array que relaciona a Região -> Personagens
    private PersonagemGenshin[] Personagens;

    public RegiaoGenshin(String nome) {
        Nome = nome;
    }

    public RegiaoGenshin(String nome, PersonagemGenshin[] personagens) {
        Nome = nome;
        Personagens = personagens;
    }

    public void Imprime() {
        System.out.println("---------------");
        System.out.println(Nome);
        if(Personagens == null) return;
        for (PersonagemGenshin personagem : Personagens) {
            System.out.println(personagem.getNome());
        }
    }

    public PersonagemGenshin[] getPersonagens() {
        return Personagens;
    }

    public void setPersonagens(PersonagemGenshin[] personagens) {
        Personagens = personagens;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
}
