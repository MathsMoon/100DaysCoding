package Curso_Dojo.OOP.Enum.DominioTests;

import Curso_Dojo.OOP.Enum.Dominio.Cliente;
import Curso_Dojo.OOP.Enum.Dominio.TipoCliente;
import Curso_Dojo.OOP.Enum.Dominio.TipoPagamento;

public class TestsClienteEnum {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Layla", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Collei", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

//        System.out.println(cliente1);
//        System.out.println(cliente2);
//        System.out.println(TipoPagamento.DEBITO.CalculoDesconto(100));
//        System.out.println(TipoPagamento.CREDITO.CalculoDesconto(100));

        //Função que chama os valores que existem nos tipos clientes
        TipoCliente clientType = TipoCliente.ClientTypebyName("Pessoa Física");
        System.out.println(clientType);

    }
}