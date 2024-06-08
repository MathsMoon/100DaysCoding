package Curso_Dojo.OOP.DesignPatterns.Dominio;

public interface Currency {
    String getSymbol();
}

class Real implements Currency{
    @Override
    public String getSymbol() {
        return "R$";
    }
}

class UsDollar implements Currency{
    @Override
    public String getSymbol() {
        return "US$";
    }
}

class Yen implements Currency{
    @Override
    public String getSymbol() {
        return "¥";
    }
}