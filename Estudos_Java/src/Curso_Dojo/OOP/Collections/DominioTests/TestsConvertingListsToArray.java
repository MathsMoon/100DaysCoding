package Curso_Dojo.OOP.Collections.DominioTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestsConvertingListsToArray {
    public static void main(String[] args) {

        System.out.println("------- LISTAS PARA ARRAY ----------");
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println("Mostrando a Lista de Nums: "+ nums);
        //Inserindo os valores da Lista em um Arrays de um Wrapper inteiro
        Integer[] ListToArray = nums.toArray(new Integer[0]); //Pode usar zero como um padrão para o java definir ou usar o nums.size
        System.out.println("Mostrando a Array de Nums: "+ Arrays.toString(ListToArray));

        System.out.println("------- ARRAY PARA LISTAS ----------");

        Integer[] NumsArray = new Integer[3];
        NumsArray[0] = 1;
        NumsArray[1] = 2;
        NumsArray[2] = 3;

         /*
            List<Integer> ArrayToList = Arrays.asList(NumsArray);

            O maior problema desta conversão é o fato de que passando de Array para List
            essas duas coleções ficam interligadas impossibilitando de adicionar valores
            ou altera-los sem que o Array também seja alterado, por tanto para contornar
            esta situação, temos abaixo a maneira correta de declaração da Lista para
            que não ocorra essa interligação:
         */

        List<Integer> ArrayToList = new ArrayList<>(Arrays.asList(NumsArray));
        ArrayToList.set(0, 0); //desta forma agora posso colocar o 0 na primeira posição e não alterara o NumArray

        System.out.println("Mostrando o Array de Nums: " + Arrays.toString(NumsArray));
        System.out.println("Mostrando a Lista de Nums: "+ArrayToList);
    }
}