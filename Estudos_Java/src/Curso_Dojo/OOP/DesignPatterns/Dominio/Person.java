package Curso_Dojo.OOP.DesignPatterns.Dominio;

public class Person {
    private String firstName;
    private String lastName;
    private String username;
    private String email;

    private Person(String firstName, String lastName, String username, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    /*
            Construindo uma Inner class com Padrão Builder:
            O processo a ser compreendido aqui é a forma que temos os
            Getters and Setters, para que não reste dúvida ao criarmos
            uma padronização para setarmos e pegarmos estes dados, em vez
            do padrão void retornado pela classe, usamos a própria InnerClass
            para retornar o tipo do objeto para que ele responde o que o contém
            ou o que ele faz.
         */
    public static class PersonBuilder{
        private String firstName;
        private String lastName;
        private String username;
        private String email;

        public PersonBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder username(String username){
            this.username = username;
            return this;
        }

        public PersonBuilder email(String email){
            this.email = email;
            return this;
        }

        public Person builder(){
            return new Person(firstName, lastName, username, email);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}