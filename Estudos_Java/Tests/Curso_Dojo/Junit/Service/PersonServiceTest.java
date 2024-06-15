package Curso_Dojo.Junit.Service;

import Curso_Dojo.Junit.Dominio.Person;
import org.junit.jupiter.api.*;


class PersonServiceTest {
    private Person Adultperson;
    private Person NotAdultperson;
    private PersonService ps;

    @BeforeEach
    public void setUp(){
        Adultperson = new Person(18);
        NotAdultperson = new Person(15);
        ps = new PersonService();
    }

    @Test
    @DisplayName("A person should be not adult when age is lower then 18")
    void isAdult_ReturnFalse_WhenAgeIsLowerThen18() {
        Assertions.assertFalse(ps.isAdult(NotAdultperson));
    }

    @Test
    @DisplayName("A person should be adult when age is greater or equals to 18")
    void isAdult_ReturnTrue_WhenAgeIsGreaterOrEqualsTo18() {
        Assertions.assertFalse(ps.isAdult(Adultperson));
    }

    @Test
    @DisplayName("Should throw null pointer exception with message when person is null")
    void isAdult_ShouldThrowException_WhenPersonIsNull() {
        Assertions.assertThrows(NullPointerException.class, () -> ps.isAdult(null), "Person can't be null");
    }
}