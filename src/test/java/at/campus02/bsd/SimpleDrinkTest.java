/*
 * SimpleDrinkTest
 * Represents JUnit Test for Simple Drink
 * Author: Daniel Hubmann, Caroline Meixner
 * Last Change: 03.07.2023
 */

package at.campus02.bsd;

import org.junit.jupiter.api.*;

/**
 * SimpleDrinkTest represents the JUnit test class for the SimpleDrink class.
 * 
 * It contains test cases for the getter and setter of the name, the volume and
 * alcohol percent attributes and wether the drink is alcoholic or not.
 * 
 * @author Daniel Hubmann
 *
 */
public class SimpleDrinkTest {

	/**
	 * Declaration of a SimpleDrink object
	 */
	SimpleDrink simpleDrink;
	
	/**
	 * Declaration of a Liquid object
	 */
	Liquid liquid;

	/**
	 * Creates the SimpleDrink object being tested
	 */
	@BeforeEach
	public void setUp() {
		liquid = new Liquid("Gin", 0.06, 37.5);
		simpleDrink = new SimpleDrink("Martini", liquid);
	}

	/**
	 * Tests the getter and setter method of the volume attribute
	 */
	@Test
	public void getVolumeTest() {
		double expectedVolume = 0.06;
		liquid.setVolume(expectedVolume);
		double result = simpleDrink.getVolume();
		Assertions.assertEquals(expectedVolume, result, 0.0);
	}

	/**
	 * Tests the getter and setter method of the alcohol percent attribute
	 */
	@Test
	public void getAlcoholPercentTest() {
		double expectedAlcoholPercent = 37.5;
		liquid.setAlcoholPercent(expectedAlcoholPercent);
		double result = simpleDrink.getAlcoholPercent();
		Assertions.assertEquals(expectedAlcoholPercent, result, 0.0);
	}

	/**
	 * Tests if the SimpleDrink object is alcoholic 
	 */
	@Test
	public void isAlcoholicTest_AlcoholPercentGreaterThanZero() {
		double alcoholPercent = 37.5;
		liquid.setAlcoholPercent(alcoholPercent);
		boolean result = simpleDrink.isAlcoholic();
		Assertions.assertTrue(result);
	}

	/**
	 * Tests if the SimpleDrink object is non-alcoholic
	 */
	@Test
	public void isAlcoholicTest_AlcoholPercentIsZero() {
		double alcoholPercent = 0.0;
		liquid.setAlcoholPercent(alcoholPercent);
		boolean result = simpleDrink.isAlcoholic();
		Assertions.assertFalse(result);
	}
	
	/**
	 * Tests the getter and setter method of the name attribute
	 */
	@Test
	public void getNameTest() {
		String expectedResult = "Martini";
		simpleDrink.setName(expectedResult);
		String result = simpleDrink.getName();
		Assertions.assertEquals(expectedResult, result);
	}

}
