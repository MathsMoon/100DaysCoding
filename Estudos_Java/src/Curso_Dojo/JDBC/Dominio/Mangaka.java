package Curso_Dojo.JDBC.Dominio;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Mangaka {
    Integer id;
    String Name;
}