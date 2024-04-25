public class Aranha extends Animal{

    private final int veneno;

    public Aranha(int vel, int massa, int forca, int veneno) {
        super(vel, massa, forca);
        this.veneno = veneno;
    }

    @Override //Função que serve para reenscrever um método em específico para uma classe.
    
    public void Atacar(Animal a) {
        if(this.getVivo()) {
            if ((this.getForca() + this.veneno) > a.getForca()) {
                this.setForca(this.getForca() + a.getMassa());
                a.setVivo(false);
            } else {
                this.setVivo(false);
            }
        } else {
            System.out.println("--------------------------");
            System.out.println(this.getClass().toGenericString() + " Está morto, não pode atacar.");
            System.out.println("--------------------------");
        }
    }
}
