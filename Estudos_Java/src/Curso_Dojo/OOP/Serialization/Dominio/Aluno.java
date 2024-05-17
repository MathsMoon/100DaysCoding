package Curso_Dojo.OOP.Serialization.Dominio;

import java.io.*;

/*
    Alguns problemas sobre a Serialização:
    - Para serializar dados sensíveis mantendo a proteção destas informações
    quando forem transformadas em texto é necessário a utilização de um mesmo
    Serial para que o Java reconheça o comando Transient que protege a informa-
    ção durante a serialização.
    - Constantes não serializadas por padrão devido a fazerem parte da Classe e
    não do Objeto.
    - Perante também a Objetos com Associações, neste caso temos a Turma que se
    associa com Aluno, como ela não implementa o mesmo princípio de Serialização
    ela fica causa um erro toda vez que tentamos Serializar o Objeto Aluno, para
    contornar essa situação basta adicionar a função de Transient para que o Java
    Igonore esta função ou constitua ela também como um objeto a ser serializado
    utilizando outras funções para tal.

     Revisar Aula 160;
 */

public class Aluno implements Serializable {
    /*
        Ativiando a construção automática do Serial criamos uma Constante que recebe
        o valor da versão UID permitindo o arquivo ser serializado e retornar ao seu estado comum
    */
    @Serial
    private static final long serialVersionUID = 2675640427401772476L;

    private int ID;
    private String Nome;
    private transient String Password; //Dizendo ao java não serializar esta informação
    private static final String NOME_ESCOLA = "Hope's Peak Academy";
    private transient Turma turma; //Ignorando o Turma por ser uma classe terceira de fora que não implementa Serialização



    public Aluno(int ID, String nome, String password) {
        this.ID = ID;
        Nome = nome;
        Password = password;
    }

    /*Desta forma estou transformando a informação do nome em um item
    Serializavél para ser impresso junto com o Objeto, por mais que ele
    em si não tenha esta mesma implementação.*/
    @Serial
    private void WriteObject(ObjectOutputStream oos){
        try {
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    //Serial não existe no Java 8, ele foi implementado na versão 14
    @Serial
    private void ReadObject(ObjectInputStream ois){
        try {
            ois.defaultReadObject();
            String NomeTurma = ois.readUTF();
            turma = new Turma(NomeTurma); //Revisar depois o código, o resultado da Turma está refenciando o local do objeto e n seu nome
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }



    @Override
    public String toString() {
        return "Aluno{" +
                "ID=" + ID +
                ", Nome='" + Nome + '\'' +
                ", Password='" + Password + '\'' +
                ", Nome Escola ='" + NOME_ESCOLA + '\'' +
                ", Turma ='" + turma + '\'' +
                '}';
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}