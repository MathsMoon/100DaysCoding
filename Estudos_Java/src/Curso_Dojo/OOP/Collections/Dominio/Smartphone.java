package Curso_Dojo.OOP.Collections.Dominio;

public class Smartphone {
    private String SerialNumber;
    private String Marca;

    public Smartphone(String marca, String serialNumber) {
        Marca = marca;
        SerialNumber = serialNumber;
    }

    /*
        Regras para modificação da função Equals:
        - Ser Reflexivo: x.equals(y) tem que ser true para tudo diferente de null
        - Ser Simétrico: para x e y diferentes de null, independente da posição
        dos valores o valor deve ser true para ambos.
        - Ser Transitivo: para x,y,z diferentes de null, se x.equals(y) == true,
        y.equals(z) == true, logo x.equals(z) também é true, pela simetridicidade
        dos valores.
        - Ser Consistente: em todos os casos se x apresentar um resultado, este resultado
        não muda enquanto seu valor permancer o mesmo, ou seja x = 1 é true, ele deve sempre
        ser true.
        - se utilizando a lógica o x for apontado como != de null, usando o x.equals(null) o
        valor retornado deve ser falso, respeitando também a consistência e reflexão.
     */
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false; //Primeiro vê se o Objeto é Nulo
        if(this == obj) return true; //Depois compara para saber se são iguais
        if(this.getClass() != obj.getClass()) return false; //Compara se são da mesma classe
        Smartphone smartphone = (Smartphone) obj; //Converte o Objeto para ser um Smartphone e associa o endereço na variável
        //Por fim retorna o resultado da Igualdade caso ambos tenham o mesmo Número de Serial por mais que sejam 2 objetos distintos.
        return SerialNumber != null && SerialNumber.equals(smartphone.SerialNumber);
    }

    /*
        Da mesma forma que é importante a definição das regras para sobrescrever o equals
        também é fundamental saber o funcionamento do HashCode para melhor implementa-lo
        tornando eficaz as buscas e também o armazenamento das informações.

        - se x.equals(y) == true, então y.HashCode() == x.HashCode();
        - se y.HashCode == x.HashCode(), não necessariamente o y.equals(x), eles estão no mesmo lugar
        no hash, mas não são necessariamente o mesmo objeto.
        - se x.equals(y) é false, então seus Hashcodes também são false.
     */

    @Override
    public int hashCode() {
        //Operação ternária que com a igualdade do Serial fornece um HashCode
        return SerialNumber == null ? 0 : this.SerialNumber.hashCode();
    }


    @Override
    public String toString() {
        return "Smartphone{" +
                "SerialNumber='" + SerialNumber + '\'' +
                ", Marca='" + Marca + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        SerialNumber = serialNumber;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }
}