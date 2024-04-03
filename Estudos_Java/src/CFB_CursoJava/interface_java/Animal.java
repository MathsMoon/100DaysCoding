abstract class Animal implements SerVivo{
    
    //Atributos da Classe animal
    private boolean vivo;
    private int massa;
    private int x, y;
    private int forca, vel;


    public Animal(int vel, int massa, int forca) { //Método Construtor que define como será o Animal
        this.vivo = true;
        this.forca = forca;
        this.massa = massa;
        this.vel = vel;
        this.x = 0;
        this.y = 0;
    }

    public void setVivo(boolean vivo) {//Setando a condição de vivo ou morto
        this.vivo = vivo;
    }

    public boolean getVivo() {//Mostrando o resultado da condição anterior
        return this.vivo;
    }

    public void setForca(int forca) {//Setando a condição de força do animal
        this.forca = forca;
    }

    public int getForca() {//Mostrando o resultado da condição anterior
        return this.forca;
    }

    public void setMassa(int massa) {//Setando a condição de massa do animal
        this.massa = massa;
    }

    public int getMassa() {//Mostrando o resultado da condição anterior
        return this.massa;
    }

    public void Atacar(Animal a) {//Método de ataque de um Animal para outro
        if(this.vivo) {
            if(this.forca > a.forca) {
                this.forca += a.getMassa();
                a.vivo = false;
            } else {
                this.vivo = false;
                a.forca += this.massa;
            }
        } else {
            System.out.println("--------------------------");
            System.out.println(this.getClass().toGenericString() + " Está morto, não pode atacar.");
            System.out.println("--------------------------");
        }
    }

    public void Mover() { //Método que move o animal 
        if(this.vivo) {
            this.x += this.vel;
            this.y += this.vel;
        } else {
            System.out.println("--------------------------");
            System.out.println(this.getClass().toGenericString() + " Está morto, não pode Mover.");
            System.out.println("--------------------------");
        }
    }

    public void Comer(int a) {//Método para o animal comer
        if(this.vivo) {
            this.forca += massa;
        } else {
            System.out.println("--------------------------");
            System.out.println(this.getClass().toGenericString() + " Está morto, não pode Comer.");
            System.out.println("--------------------------");
        }
    }
    
    public void info() { //Método das informações do Animal.
        System.out.println("--------------------------");
        System.out.printf("Tipo: %s%n", getClass().toString());
        System.out.printf("Vivo: %s%n", this.getVivo() ? "Sim" : "Não");
        System.out.printf("Massa: %d%n", this.massa);
        System.out.printf("Força: %d%n", this.forca);
        System.out.printf("Velocidade: %d%n", this.vel);
    }
}