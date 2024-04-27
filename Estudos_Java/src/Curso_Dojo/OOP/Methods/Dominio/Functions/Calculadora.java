package Curso_Dojo.OOP.Methods.Dominio.Functions;

public class Calculadora {

    public void MultiplyNumbs(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double DividedNumbs(double a, double b) {
        return a/b;
    }

    public float Soma(float a, float b) {return a+b;}

    public void SubNums(int a, int b) {
        if(a < 0 || b < 0) {
            System.out.println("Não é possível realizar a subtração desses números");
            return; //O return pode ser usado em voids como o break é utilizado para os Loops, desta forma ele para a leitura do código e impede a leitura do print abaixo.
        }
        System.out.println(a - b);
    }

    public void SomaArrays(int... numeros) {//Não recebe nada após o VarArgs
        int soma = 0;

        for(int num:numeros) {
            soma += num;
        }

        System.out.println("A soma dos números da Array é: " + soma);
    }
}