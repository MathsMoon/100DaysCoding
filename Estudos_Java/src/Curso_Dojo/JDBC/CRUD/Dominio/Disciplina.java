package Curso_Dojo.JDBC.CRUD.Dominio;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Disciplina {
    Integer ID_disciplina;
    String nome_disciplina;
    String descricao_disciplina;
    Integer carga_horaria;
    String ementa_disciplina;
    String bibliografia_disciplina;
    Professor professor;
}