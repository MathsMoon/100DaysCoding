package Curso_Dojo.OOP.UtilityClasses.Dominio.NumberClasses;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatClass {
    public static void main(String[] args) {
        
        Locale localdefault = Locale.getDefault();
        Locale localJp = Locale.JAPAN;
        Locale localKr = Locale.KOREA;
        
        NumberFormat[] nbf = new NumberFormat[4];
        nbf[0] = NumberFormat.getInstance();
        nbf[1] = NumberFormat.getInstance(localdefault);
        nbf[2] = NumberFormat.getInstance(localJp);
        nbf[3] = NumberFormat.getInstance(localKr);

        double valor = 10_000.230;

        for (NumberFormat nf: nbf) {
            System.out.println(nf.format(valor));
        }
    }
}