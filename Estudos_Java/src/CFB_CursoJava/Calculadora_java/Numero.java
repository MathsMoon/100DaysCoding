//Package que se encontra o arquivo: Dentro da pasta CFB e da Calculadora.
package CFB_CursoJava.Calculadora_java;

public class Numero {//Classe que manipulará os números
    private float valor;

    public Numero() {//Define o Objeto que vai ser criado como 0 ou qualquer outro valor que vai ser inserido
        this.valor=0;
    }
    
    public void setValor(float valor) {//Recebe o valor do Objeto instânciado e o guarda em valor
        this.valor = valor;
    }
    
    public float getValor () {//Pega o valor setado do objeto e permite manipularmos o valor do objeto
        return this.valor;
    }
}