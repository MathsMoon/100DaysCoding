package Curso_Dojo.OOP.UtilityClasses.Dominio.LocaleClass;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleClass {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages_en_US", new Locale("pt", "BR"));

        boolean sasa = bundle.containsKey("sasa");
        System.out.println(bundle.getString("hello"));


        System.out.println(sasa);
    }
}