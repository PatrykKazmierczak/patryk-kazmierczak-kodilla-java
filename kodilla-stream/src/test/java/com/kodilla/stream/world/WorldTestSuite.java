package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        Country Spain = new Country("Spain",new BigDecimal("1000001"));
        Country Poland = new Country("Poland",new BigDecimal("1000001"));
        Country Germany = new Country("Germany",new BigDecimal("1000001"));

        Country China = new Country("China",new BigDecimal("1000001"));
        Country Japan = new Country("Japan",new BigDecimal("1000001"));
        Country SouthKorea = new Country("South Korea",new BigDecimal("1000001"));

        Country Chile = new Country("Chile",new BigDecimal("1000001"));
        Country Brasil = new Country("Brasil",new BigDecimal("1000001"));
        Country Peru = new Country("Peru",new BigDecimal("1000001"));

        Continent Europa = new Continent();
        Continent Asia = new Continent();
        Continent SouthAmerica = new Continent();

        //When
        Europa.addCountry(Spain);
        Europa.addCountry(Poland);
        Europa.addCountry(Germany);

        Asia.addCountry(China);
        Asia.addCountry(Japan);
        Asia.addCountry(SouthKorea);

        SouthAmerica.addCountry(Chile);
        SouthAmerica.addCountry(Brasil);
        SouthAmerica.addCountry(Peru);

        World World = new World();
        World.addContinent(Europa);
        World.addContinent(Asia);
        World.addContinent(SouthAmerica);

        BigDecimal calculateTotalPeople = World.getPeopleQuantity();

        //Then
        BigDecimal expectedTotalPeople = new BigDecimal("9000009");
        Assert.assertEquals(expectedTotalPeople,calculateTotalPeople);
    }
}
