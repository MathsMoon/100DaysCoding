package conceitos_java.Herança_java;

public class Carro {
    //Criação dos atributos comuns a classe, private por só poder ser alterado e manipulado dentro da classe Carro
    private String nome;
    private Boolean ligado;
    private Boolean destruido;
    private int blindagem;
    private Boolean armamento;

    public Carro(String nome){ //Método Construtor que define a base do Carro
        this.nome = nome;
        this.ligado = false;
        this.destruido = false;
        this.blindagem = 0;
        this.armamento = false;
    }
    public String getNome(){ //Método que pega o nome do Carro e insere ele na String Nome 
        return this.nome;
    }
    public Boolean getLigado(){ //Preencher depois de entender sobre GET and SET
        return this.ligado;
    }
    public void setLigado(Boolean ligado){ //Preencher depois de entender sobre GET and SET
        this.ligado = ligado;
    }
    public Boolean getDestruido(){//Preencher depois de entender sobre GET and SET
        return this.destruido;
    }
    public Boolean getArmamento(){//Preencher depois de entender sobre GET and SET
        return this.armamento;
    }
    public void setArmamento(Boolean armamento){//Preencher depois de entender sobre GET and SET
        this.armamento = armamento;
    }
    public int getBlindagem(){//Preencher depois de entender sobre GET and SET
        return this.blindagem;
    }
  public void setBlindagem(int blindagem){//Preencher depois de entender sobre GET and SET
        this.blindagem = blindagem;
  }
    public void sofrerDano(int dano){//Método que define como funciona o Dano no carro
        this.blindagem -= dano;

        if(this.blindagem <= 0){
            this.blindagem = 0;
            this.ligado = false;
            this.destruido = true;
        }
    }
    public void info(){ //Método que mostra todas as informações setadas sobre o carro.
        System.out.println("-------------------------------");
        System.out.printf("Nome....:%s%n",this.nome);
        System.out.printf("Ligado....:%s%n",this.ligado ? "Sim" : "Nao");
        System.out.printf("Destruido.....%s%n",this.destruido ? "Sim" : "Nao");
        System.out.printf("Blindagem.....:%d%n",this.blindagem);
        System.out.printf("Armamento.....:%s%n",this.armamento ? "Sim" : "Nao");
    }
}