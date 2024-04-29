package Curso_Dojo.OOP.Enum.Dominio;

/*
    Podemos utilizar o Override para especificar funções para cada alternativa
    oferecendo funcionalidades a mais dentro da escolha que foi feita. Abaixo
    podemos ver um cálculo de desconto que é sobrescrito para os dois tipos
    de pagamento existentes.
*/

public enum TipoPagamento{
    DEBITO {
        @Override
        public double CalculoDesconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO {
        @Override
        public double CalculoDesconto(double valor) {
            return valor * 0.05;
        }
    };
    //Este método só existe para ser sobreescrito, portanto para bom uso deve-se criar da seguinte forma:
    public abstract double CalculoDesconto(double valor);
}