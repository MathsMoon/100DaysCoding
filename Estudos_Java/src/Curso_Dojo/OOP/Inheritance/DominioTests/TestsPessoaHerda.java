package Curso_Dojo.OOP.Inheritance.DominioTests;
import Curso_Dojo.OOP.Inheritance.Dominio.Endereco;
import Curso_Dojo.OOP.Inheritance.Dominio.Funcionario;
import Curso_Dojo.OOP.Inheritance.Dominio.Pessoa;

public class TestsPessoaHerda {
    public static void main(String[] args) {
        //Definindo valores ao Endereço
        Endereco endereco = new Endereco();
        endereco.setRua("moriōchō hokutō-bu no bessō chitai ni ari");
        endereco.setCEP(20210404);

        //Definindo valores a Pessoa
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Kira, Yoshigake");
        pessoa.setCPF(44444444);
        pessoa.setEndereco(endereco);

        //Definindo valores ao Funcionário
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(pessoa.getNome());
        funcionario.setEndereco(pessoa.getEndereco());
        funcionario.setCPF(pessoa.getCPF());
        funcionario.setSalario(3000);
        funcionario.setEmpresa("kameyūchēn-ten");

        //Mostrando informações
        funcionario.Imprime();
    }
}