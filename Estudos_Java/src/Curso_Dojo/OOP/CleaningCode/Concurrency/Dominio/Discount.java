package Curso_Dojo.OOP.CleaningCode.Concurrency.Dominio;

//Classe de Desconto que possuem um Enumerador para trabalhar com os descontos.
public class Discount {
    public enum Code {
        NONE(0), TIER1(10), TIER2(15), TIER3(25);
        private final int percentage;

        Code(int percentage) {
            this.percentage = percentage;
        }

        public int getPercentage() {
            return percentage;
        }
    }
}