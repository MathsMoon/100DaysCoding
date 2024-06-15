package Curso_Dojo.JDBC.Introduction.Dominio;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Mangaka {
    Integer id;
    String Name;
}