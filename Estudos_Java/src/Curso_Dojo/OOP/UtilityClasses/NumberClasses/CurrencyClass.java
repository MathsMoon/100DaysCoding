package Curso_Dojo.OOP.UtilityClasses.NumberClasses;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyClass {
    public static void main(String[] args) {

        Locale localdefault = Locale.getDefault();
        Locale localJp = Locale.JAPAN;
        Locale localKr = Locale.KOREA;

        NumberFormat[] nbf = new NumberFormat[4];
        nbf[0] = NumberFormat.getCurrencyInstance();
        nbf[1] = NumberFormat.getCurrencyInstance(localdefault);
        nbf[2] = NumberFormat.getCurrencyInstance(localJp);
        nbf[3] = NumberFormat.getCurrencyInstance(localKr);

        double valor = 10_000.230;

        for (NumberFormat nf: nbf) {
            System.out.println(nf.format(valor));
        }
    }
}