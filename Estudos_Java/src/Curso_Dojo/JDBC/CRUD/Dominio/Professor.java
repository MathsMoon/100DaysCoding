package Curso_Dojo.JDBC.CRUD.Dominio;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Professor {
    Integer ID_Professor;
    String nome_Professor;
    String endereco_Professor;
    String telefone_Professor;
    //Titulação Interface/Enum.
}