package Curso_Dojo.OOP.UtilityClasses;


import java.util.Locale;

public class LocaleClass02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isocountrys = Locale.getISOCountries();
        String[] isolanguages = Locale.getISOLanguages();

        for(String isoc: isocountrys) {
            System.out.println(isoc+" ");
        }
        System.out.println(" ");
        for (String isol : isolanguages) {
            System.out.println(isol+" ");
        }
    }
}
