/*
 * LiquidTest
 * Represents JUnit Test for Liquid
 * Author: Daniel Hubmann, Caroline Meixner
 * Last Change: 30.06.2023
 */

package at.campus02.bsd;

import org.junit.jupiter.api.*;

public class LiquidTest {

	Liquid liquid;

	@BeforeEach
	public void setUp() {
		liquid = new Liquid("Gin", 0.06, 37.5);
	}

	@Test
	public void getNameTest() {
		String expectedName = "Gin";
		String result = liquid.getName();
		Assertions.assertEquals(expectedName, result);
	}

	@Test
	public void setNameTest() {
		String expectedName = "Gin";
		liquid.setName(expectedName);
		String result = liquid.getName();
		Assertions.assertEquals(expectedName, result);
	}

	@Test
	public void setVolumeTest() {
		double expectedVolume = 0.06;
		liquid.setVolume(expectedVolume);
		double result = liquid.getVolume();
		Assertions.assertEquals(expectedVolume, result);
	}

	@Test
	public void setAlcoholPercentTest() {
		double expectedAlcoholPercent = 37.5;
		liquid.setAlcoholPercent(expectedAlcoholPercent);
		double result = liquid.getAlcoholPercent();
		Assertions.assertEquals(expectedAlcoholPercent, result);
	}

}
