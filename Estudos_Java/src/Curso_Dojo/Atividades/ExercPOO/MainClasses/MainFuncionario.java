package Curso_Dojo.Atividades.ExercPOO.MainClasses;
import Curso_Dojo.Atividades.ExercPOO.Domain.Funcionario;

public class MainFuncionario {
    public static void main(String[] args) {
        Funcionario FuncObj = new Funcionario();

        //Inserindo informações do Funcionário
        FuncObj.Nome = "ABC";
        FuncObj.Idade = 22;
        //FuncObj.Salario; //Quando você cria um array pode inicializar desta forma em outra classe.

        //Utilizando as funções da classe funcionário
        FuncObj.FuncInfo();
        FuncObj.MediaSalario();

    }
}
