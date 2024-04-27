package Curso_Dojo.OOP.Methods.Dominio.Associacao1;

public class PersonagemGenshin {
    private String Nome;
    private RegiaoGenshin regiaoGenshin;
    //Podemos criar um objeto que recebe um valor que é da classe RegiaoGenshin desta forma.

    public PersonagemGenshin(String nome) {
        Nome = nome;
    }

    public void Imprime() {
        System.out.println("---------------");
        System.out.println(Nome);
        if(regiaoGenshin !=null) {
            System.out.println(regiaoGenshin.getNome());
        }
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public RegiaoGenshin getsetRegiaoGenshin() {
        return regiaoGenshin;
    }

    public void setRegiaoGenshin(RegiaoGenshin regiaoGenshin) {
        this.regiaoGenshin = regiaoGenshin;
    }
}
