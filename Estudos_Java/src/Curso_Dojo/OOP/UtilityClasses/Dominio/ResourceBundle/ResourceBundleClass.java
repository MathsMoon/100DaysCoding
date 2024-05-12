package Curso_Dojo.OOP.UtilityClasses.Dominio.ResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleClass {

    /*
        Resource Bundle mexe com as configurações de sistema de acordo com a região do usuário, dependendo
        da lingua as Chaves destacadas dentro do Resource Bundle de configurações alteram palavras chave
        para o idioma correspodende te acordo com a escolha do Usuário.

     */

    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages_en_US", new Locale("en", "US"));
        ResourceBundle bundle1 = ResourceBundle.getBundle("messages_pt_BR", new Locale("pt", "BR"));

        System.out.println("------------ENGLISH-------------");
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println("-------------PORTUGUESE------------");
        System.out.println(bundle1.getString("hello"));
        System.out.println(bundle1.getString("good.morning"));
    }
}