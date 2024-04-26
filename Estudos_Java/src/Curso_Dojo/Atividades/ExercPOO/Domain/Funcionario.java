package Curso_Dojo.Atividades.ExercPOO.Domain;

public class Funcionario {
    public String Nome;
    public int Idade;
    public float[] Salario;

    public void FuncInfo() {
        System.out.println(this.Nome);
        System.out.println(this.Idade);
        if (Salario != null) {
            for(int i = 0; i < 3; i++) {
                System.out.printf("%n%d Salário: %.2f", i + 1, this.Salario[i]);
            }
        } else {
            System.out.println("Não existe Salário cadastrado!");
        }
    }

    public void MediaSalario() {
        System.out.println("\n-----------------------");
        System.out.println("Cálculo de Média Salarial:");
        if(Salario != null) {
            float media = 0;
            for (float i : Salario) {
                media += i;
            }
            media /= Salario.length; //Media recebe o tamanho do array dividindo todo valor somado dentro da média
            System.out.println("A média salárial é de: " + media);
        } else {
            System.out.println("Não existe Salário cadastrado!");
        }
    }
}