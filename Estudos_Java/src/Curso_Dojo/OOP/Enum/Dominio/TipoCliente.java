package Curso_Dojo.OOP.Enum.Dominio;
/*
    O tipo Enum funciona como um limitador de informações, já que ele fornece de antemão
    as possibilidades específicas de uma informação, assim previnindo possíveis erros de
    código devido a erro de digitação ou associação.

    O uso da enumeração é necessário em casos que existem múltiplas escolhas conhecidas e
    é preciso forçar ao usuário ou sistema a definir esse tipo de informação.

    Funções da Enum:
    - Podemos enumerar os valores para criar um index de possibilidades que são acessadas
    e escolhidas pelo usuário.
    -

 */
public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    public final int VALOR;
    public final String TIPOCLIENTE;
    TipoCliente(int valor, String tipocliente) {
        VALOR = valor;
        TIPOCLIENTE = tipocliente;
    }

    //Caso seja necessário a busca pelos tipos de enums dentro do projeto pode usar este comando retornando ou um tipo específico
    //ou buscando quais os valores setados para o Enum
    public static TipoCliente ClientTypebyName(String nomeRelatorio) {
        for (TipoCliente tipoCliente: TipoCliente.values()) {
            if(tipoCliente.getTIPOCLIENTE().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }

    public int getVALOR() {
        return VALOR;
    }

    public String getTIPOCLIENTE() {
        return TIPOCLIENTE;
    }
}