package Curso_Dojo.OOP.Inheritance.Dominio;

public class Endereco {
    private String Rua;
    private int CEP;

//    public Endereco(String rua, int CEP) {
//        Rua = rua;
//        this.CEP = CEP;
//    }

    public void Imprime() {
        System.out.println("jitaku wa: " + Rua);
        System.out.println("CEP: " + CEP);
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String rua) {
        Rua = rua;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }
}