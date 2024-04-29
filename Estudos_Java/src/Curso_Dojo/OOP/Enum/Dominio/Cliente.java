package Curso_Dojo.OOP.Enum.Dominio;

public class Cliente {
    //É possível a criação do Enum dentro de uma classe, mas para organização é bom ter um arquivo próprio
    private String Nome;
    private TipoCliente Tipo;
    private TipoPagamento TipoPagamento;

    public Cliente(String nome, TipoCliente tipo, TipoPagamento tipoPagamento) {
        Nome = nome;
        Tipo = tipo;
        this.TipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Nome='" + Nome + '\'' +
                ", Tipo=" + Tipo.getTIPOCLIENTE() +
                ", Tipoint=" + Tipo.getVALOR() +
                ", TipoPagamento=" + TipoPagamento +
                '}';
    }
}