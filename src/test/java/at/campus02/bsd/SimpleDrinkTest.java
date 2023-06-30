/*
 * SimpleDrinkTest
 * Represents JUnit Test for Simple Drink
 * Author: Daniel Hubmann, Caroline Meixner
 * Last Change: 30.06.2023
 */

package at.campus02.bsd;

import org.junit.jupiter.api.*;

public class SimpleDrinkTest {

	SimpleDrink simpleDrink;
	Liquid liquid;

	@BeforeEach
	public void setUp() {
		liquid = new Liquid("Gin", 0.06, 37.5);
		simpleDrink = new SimpleDrink("Martini", liquid);
	}

	@Test
	public void getVolumeTest() {
		double expectedVolume = 0.06;
		liquid.setVolume(expectedVolume);
		double result = simpleDrink.getVolume();
		Assertions.assertEquals(expectedVolume, result, 0.0);
	}

	@Test
	public void getAlcoholPercentTest() {
		double expectedAlcoholPercent = 37.5;
		liquid.setAlcoholPercent(expectedAlcoholPercent);
		double result = simpleDrink.getAlcoholPercent();
		Assertions.assertEquals(expectedAlcoholPercent, result, 0.0);
	}

	@Test
	public void isAlcoholicTest_AlcoholPercentGreaterThanZero() {
		double alcoholPercent = 37.5;
		liquid.setAlcoholPercent(alcoholPercent);
		boolean result = simpleDrink.isAlcoholic();
		Assertions.assertTrue(result);
	}

	@Test
	public void isAlcoholicTest_AlcoholPercentIsZero() {
		double alcoholPercent = 0.0;
		liquid.setAlcoholPercent(alcoholPercent);
		boolean result = simpleDrink.isAlcoholic();
		Assertions.assertFalse(result);
	}

}
