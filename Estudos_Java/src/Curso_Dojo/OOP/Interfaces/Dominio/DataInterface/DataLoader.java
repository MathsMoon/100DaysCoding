package Curso_Dojo.OOP.Interfaces.Dominio.DataInterface;

public interface DataLoader {
    //Por padrão do Java todas as funções da Interface São Public, Abstratc e Constantes
    void Load();

    default void CheckPermission(){
        System.out.println("Fazendo checagem de Permissões");
    }

    //Não pode ser sobreescrito por ser static, ou seja, pertence a Interface
    static void retriveMaxDataSize() {
        System.out.println("Dentro da Interface");
    }
}