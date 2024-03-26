package conceitos_java.Herança_java;

public class Carro_Combate extends Carro { //Método que chama a classe Carro e entrega seus atributos como herança ao Carro_Combate
    private final int MAX_ARMAMENTO = 100; //Bom costume colocar constante em full capslock 
    private final int MIN_ARMAMENTO = 0;
    private int qtdArmamento;

    public Carro_Combate(String nome, int blindagem) { //Método que adiciona informações a mais do carro da classe base Carro.
        //super(); Função que insere o valor que se espera do método Construtor da classe Carro. 
        //Como lá está String Nome, com o super você consegue inserir aqui na classe filho assim herdando tudo do Carro.
        //Mas o super pode também ser utilizado para inserir outras informações dentro do construtor, exemplo:
        super(nome);
        setArmamento(true); //Em caso de métodos dentro da classe Carro, não é necessário o uso do super.NomedaClasse
        setBlindagem(blindagem);
        this.qtdArmamento = 100;

    }

    public void setqtdArmamento(int qtdArmamento) { //Método que define como funciona as munições 
        this.qtdArmamento += qtdArmamento; //Armamento dentro do método set recebe o valor completo do qtdArmamento.

        if (this.qtdArmamento > MAX_ARMAMENTO) {
            this.qtdArmamento = MAX_ARMAMENTO;            
        } else if(this.qtdArmamento < MIN_ARMAMENTO) {
            this.qtdArmamento = MIN_ARMAMENTO;
        }
    }

    public int getqtdArmamento() { //Método que me permite pegar a quantidade de armamento
        return this.qtdArmamento;
    }

    public void atirar() { //Método que me permite atirar caso tenha munição 
        if(this.qtdArmamento > MIN_ARMAMENTO) {
            setqtdArmamento(-1); //Pega o valor atual do armamento e subtrai por -1
        } else {
            System.out.println("Sem Munição.");
        }
    }

    public void info() { //Imprime a info da classe Carro + Armamento
        super.info();
        System.out.printf("Quantidade Arm.........: %d%n", this.qtdArmamento);
    }
}