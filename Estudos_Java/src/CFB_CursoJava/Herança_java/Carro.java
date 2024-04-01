package CFB_CursoJava.Herança_java;

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
    public String getNome(){ //Método que retornar o Nome setado na variável nome.
        return this.nome;
    }
    public Boolean getLigado(){ //Retorna o valor booleano de ligado respondendo se a condição é True or false.
        return this.ligado;
    }
    public void setLigado(Boolean ligado){ //Seta o valor de Ligado com o valor booleano de True or false.
        this.ligado = ligado;
    }
    public Boolean getDestruido(){//Retorna a condição booleana para saber se o carro está destruido ou não
        return this.destruido;
    }
    public Boolean getArmamento(){//Retorna a condição booleana para saber se o carro possui armamento ou não
        return this.armamento;
    }
    public void setArmamento(Boolean armamento){//Confirmando que a condição de armamento é true, seta o armamento de acordo com o que já está na variável.
        this.armamento = armamento;
    }
    public int getBlindagem(){//Retorna o valor da blindagem de acordo com o que foi setado na variável
        return this.blindagem;
    }
  public void setBlindagem(int blindagem){//Seta o valor da blindagem de acordo com o que o usuário colocou no objeto
        this.blindagem = blindagem;
  }
    public void sofrerDano(int dano){//Método que define como funciona o Dano no carro
        this.blindagem -= dano;

        if(this.blindagem <= 0){//Para carros sem blindagem a destruição é instantânea
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