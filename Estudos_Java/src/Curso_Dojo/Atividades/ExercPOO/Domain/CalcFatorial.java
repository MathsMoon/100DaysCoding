package Curso_Dojo.Atividades.ExercPOO.Domain;

public class CalcFatorial {

    public static void CalculosFatorialRecursivo(int n){
        long result = 1;

        if (n == 0) {
            System.out.println("Resultado é: 1");
        } else {
            for (int i = n; i > 0; i--) {
                result *= i;
                System.out.printf("%nFatorial de %d * %d = %d", n, i, result);
            }
            System.out.printf("%nO fatorial Total de %d é %d", n, result);
        }
    }
}