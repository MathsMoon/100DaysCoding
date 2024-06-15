package Curso_Dojo.Junit.Dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {


    @Test
    public void instanceOf_ExecutesChildClassMethod_WhenObjectsIsOfChildType(){
        Employee employeeDev = new Developer("1", "Java");
        Employee employee2 = new Employee("2");
        if(employeeDev instanceof Developer){
            Developer dev = (Developer) employeeDev;
            Assertions.assertEquals("Java", dev.getMainLanguage());
        }

        if(employee2 instanceof Developer developer){
            Assertions.assertEquals("Java", developer.getMainLanguage());
        }
    }
}