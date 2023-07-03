/*
 * CocktailTest
 * Represents JUnit Test for Cocktail
 * Author: Daniel Hubmann, Caroline Meixner
 * Last Change: 03.07.2023
 */

package at.campus02.bsd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * JUnit Test class for Cocktail class.
 *
 * Contains test cases for getVolume(), getAlcoholPercent(),
 * isAlcoholic() methods.
 *
 * @author Caroline Meixner
 *
 */

public class CocktailTest {

    /**
     * Declaration of the Cocktail object
     */
    Cocktail cocktail;

    /**
     * Tests for alcoholic drinks
     */
    @Nested
    public class NestedBlock {

        /**
         * Creates liquid objects and liquidList to create
         * new Cocktail object for testing
         */
        @BeforeEach
        void setup() {
            Liquid alcoholicLiquid = new Liquid("Gin", 0.06, 37.5);
            Liquid nonalcoholicLiquid = new Liquid("Tonic Water", 0.12, 0);
            List<Liquid> liquidList = new ArrayList<Liquid>();
            liquidList.add(alcoholicLiquid);
            liquidList.add(nonalcoholicLiquid);
            cocktail = new Cocktail("Gin Tonic", liquidList);
        }

        /**
         * Tests return value of getVolume() method
         */
        @Test
        void volumeTest() {
            double volume = cocktail.getVolume();
            Assertions.assertEquals(0.18, volume);
        }

        /**
         * Tests return value of getAlcoholPercent() method
         */
        @Test
        void alcoholPercentTest() {
            double alcoholPercent = cocktail.getAlcoholPercent();
            Assertions.assertEquals(12.5, alcoholPercent);
        }

        /**
         * Tests return value of isAlcoholic() method with alcoholic drink
         */
        @Test
        void isAlcoholicTest_True() {
            boolean isAlcoholic = cocktail.isAlcoholic();
            Assertions.assertTrue(isAlcoholic);
        }

        /**
         * Tests setter and return value of getName() method
         */
        @Test
    	public void getNameTest() {
    		String expectedResult = "Gin Tonic";
    		cocktail.setName(expectedResult);
    		String result = cocktail.getName();
    		Assertions.assertEquals(expectedResult, result);
    	}
    }

    /**
     * Tests return value of isAlcoholic() method with non-alcoholic drink
     */
    @Test
    public void isAlcoholicTest_False() {
        Liquid pineappleJuice = new Liquid("Pineapple Juice", 0.15, 0);
        Liquid coconutMilk = new Liquid("Coconut Milk", 0.05, 0);
        Liquid limeJuice = new Liquid("Lime Juice", 0.025, 0);
        List<Liquid> liquidList = new ArrayList<>();
        liquidList.add(pineappleJuice);
        liquidList.add(coconutMilk);
        liquidList.add(limeJuice);
        Cocktail cocktail = new Cocktail("Virgin Pina Colada", liquidList);

        boolean isAlcoholic = cocktail.isAlcoholic();
        Assertions.assertFalse(isAlcoholic);
    }
    
    

}
