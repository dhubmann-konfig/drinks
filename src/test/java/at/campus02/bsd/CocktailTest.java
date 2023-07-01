/*
 * CocktailTest
 * Represents JUnit Test for Cocktail
 * Author: Daniel Hubmann, Caroline Meixner
 * Last Change: 01.07.2023
 */

package at.campus02.bsd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CocktailTest {

    Cocktail cocktail;

    @Nested
    public class NestedBlock {

        @BeforeEach
        void setup() {
            Liquid alcoholicLiquid = new Liquid("Gin", 0.06, 37.5);
            Liquid nonalcoholicLiquid = new Liquid("Tonic Water", 0.12, 0);
            List<Liquid> liquidList = new ArrayList<Liquid>();
            liquidList.add(alcoholicLiquid);
            liquidList.add(nonalcoholicLiquid);
            cocktail = new Cocktail("Gin Tonic", liquidList);
        }

        @Test
        void volumeTest() {
            double volume = cocktail.getVolume();
            Assertions.assertEquals(0.18, volume);
        }

        @Test
        void alcoholPercentTest() {
            double alcoholPercent = cocktail.getAlcoholPercent();
            Assertions.assertEquals(12.5, alcoholPercent);
        }

        @Test
        void isAlcoholicTest_True() {
            boolean isAlcoholic = cocktail.isAlcoholic();
            Assertions.assertTrue(isAlcoholic);
        }
    }

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
