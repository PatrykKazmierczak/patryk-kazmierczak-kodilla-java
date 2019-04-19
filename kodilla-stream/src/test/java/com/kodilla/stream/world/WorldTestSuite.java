package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){

        Country country1 = new Country("Spain",new BigDecimal("7456774738293834"));
        Country country2 = new Country("Poland",new BigDecimal("577744574738293834"));
        Country country3 = new Country("Germany",new BigDecimal("733334738293834"));

        Country country4 = new Country("China",new BigDecimal("97456774738293834"));
        Country country5 = new Country("Japan",new BigDecimal("77445747383834"));
        Country country6 = new Country("South Korea",new BigDecimal("733334738293834"));

        Country country7 = new Country("Chile",new BigDecimal("7456774738293834"));
        Country country8 = new Country("Brasil",new BigDecimal("377744738293834"));
        Country country9 = new Country("Peru",new BigDecimal("733334738293834"));

        List<Country> europaList = new ArrayList<>();
        europaList.add(country1);
        europaList.add(country2);
        europaList.add(country3);

        List<Country> asiaList = new ArrayList<>();
        europaList.add(country4);
        europaList.add(country5);
        europaList.add(country6);

        List<Country> southAmericaList = new ArrayList<>();
        europaList.add(country7);
        europaList.add(country8);
        europaList.add(country9);

        Continent europa = new Continent(europaList);
        Continent asia = new Continent(asiaList);
        Continent southAmerica = new Continent(southAmericaList);

        List<Continent> worldList = new ArrayList<>();
        worldList.add(europa);
        worldList.add(asia);
        worldList.add(southAmerica);

        World world = new World(worldList);

        //When
        BigDecimal allPeopleAroundTheWorld = world.getPeopleQuantity();
        //Given
        Assert.assertEquals(new BigDecimal("235478564216"), allPeopleAroundTheWorld);






    }
}
