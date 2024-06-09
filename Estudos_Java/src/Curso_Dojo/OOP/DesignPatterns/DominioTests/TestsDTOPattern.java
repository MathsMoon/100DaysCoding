package Curso_Dojo.OOP.DesignPatterns.DominioTests;

import Curso_Dojo.OOP.DesignPatterns.Dominio.*;

public class TestsDTOPattern {
    public static void main(String[] args) {
        AircraftSingEager instance = AircraftSingEager.getInstance();
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person person = new Person.PersonBuilder().
                firstName("Helena").
                lastName("Assis").
                email("helenassissouza@gmail.com").
                username("helen").builder();

        ReportDto reportDto = ReportDto.ReportDtoBuilder.builder().
                aircraftName(instance.getName()).
                country(country).
                currency(currency).
                personName(person.getFirstName()).
                build();

        System.out.println(reportDto);
    }
}