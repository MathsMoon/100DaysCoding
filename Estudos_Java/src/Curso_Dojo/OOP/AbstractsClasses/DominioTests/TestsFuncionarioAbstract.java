package Curso_Dojo.OOP.AbstractsClasses.DominioTests;
import Curso_Dojo.OOP.AbstractsClasses.Dominio.Desenvolvedor;
import Curso_Dojo.OOP.AbstractsClasses.Dominio.Gerente;

public class TestsFuncionarioAbstract {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Yelan",5000);
        System.out.println(gerente);
        Desenvolvedor dev = new Desenvolvedor("Layla", 3500);

        System.out.println(dev);
    }
}