package Curso_Dojo.JDBC.CRUD.Dominio;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Aluno {
    Integer ID_Aluno;
    String nome_Aluno;
    String endereco_Aluno;
    String telefone_Aluno;
    String situacao_Aluno;
    //Materia do Curso.
}