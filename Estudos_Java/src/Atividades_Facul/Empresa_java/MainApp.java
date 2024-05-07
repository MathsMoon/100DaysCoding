package Atividades_Facul.Empresa_java;

import Atividades_Facul.Empresa_java.Dominio.Empregado;
import Atividades_Facul.Empresa_java.Dominio.Gerente;
import Atividades_Facul.Empresa_java.Dominio.Secretaria;
import Atividades_Facul.Empresa_java.Dominio.Telefonista;


public class MainApp {
    public static void main(String[] args) {
        //Manipulando as informações do Empregado
        Empregado empregado1 = new Gerente("Hélio", 8000,800,"Manutenção Corporativa");
        Empregado empregado2 = new Secretaria("Ana", 2000, 300);
        Empregado empregado3 = new Telefonista("Pedro", 1200, 150);

        //Mostrando as informações dos Empregados:
        empregado1.InfoEmpregado();
        empregado2.InfoEmpregado();
        empregado3.InfoEmpregado();
    }   
}