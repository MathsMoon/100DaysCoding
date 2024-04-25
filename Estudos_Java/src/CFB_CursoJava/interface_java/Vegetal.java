public class Vegetal {

    private boolean vivo;
    private final int massa;
    
    public Vegetal(int massa) { //método construtor da classe Vegetal
        this.vivo = true;
        this.massa = massa;
    }
    
    public int getMassa() { //Pegando a Massa do vegetal (ela já foi setada no construtor, logo n precisa de um Set)
        return this.massa;
    }

    public boolean getVivo() {//Conferindo se o vegetal está vivo
        return this.vivo;
    }
    public void setVivo(boolean vivo) {//Setando a condição de vida do vegetal
        this.vivo = vivo;
    }

    public void info() {//Informações do vegetal
        System.out.println("--------------------------");
        System.out.printf("Tipo: %s%n", getClass());
        System.out.printf("Vivo: %s%n", this.getVivo() ? "Sim" : "Não");
        System.out.printf("Massa: %d%n", this.massa);
        System.out.println("--------------------------");
    }
}
