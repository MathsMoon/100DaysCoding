package CFB_CursoJava.Math_Java;
import java.util.ArrayList;
// import java.util.function.Consumer;

public class lambda_in {
    public static void main(String[] args) {
        //Criando listas para trabalhar o Lambda
        ArrayList<Integer> values = new ArrayList<Integer>();
        ArrayList<Integer> dobro = new ArrayList<Integer>();
        ArrayList<Integer> par = new ArrayList<Integer>();
        ArrayList<Integer> impar = new ArrayList<Integer>();

        //preenchendo a Lista referência:
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        values.add(6);

        //Usando o conceito da Lambda direto no ForEach => Lambda: () -> {};
        // values.forEach((v) -> {dobro.add(v * 2);}); 

        //Condição com a Lambda que usa todos de uma vez:
        values.forEach((v) -> {
            dobro.add(v * 2);

            if(v%2 == 0) {
                par.add(v);
            } else {
                impar.add(v);
            } 
        });
        

        //Criando um consumer para realizar a Lambda fora do ForEach
        // Consumer<Integer> dobrar = (v) -> {dobro.add(v * 2);};
        // values.forEach(dobrar);

        //Mostrando as listas
        System.out.println(values);
        System.out.println(dobro);
        System.out.println(par);
        System.out.println(impar);
    }   
}