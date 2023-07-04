/*
 * LiquidTest
 * Represents JUnit Test for Liquid
 * Author: Daniel Hubmann, Caroline Meixner
 * Last Change: 03.07.2023
 */

package at.campus02.bsd;

import org.junit.jupiter.api.*;

/**
 * LiquidTest represents the JUnit test class for the Liquid class.
 * 
 * It contains test cases for the getter and setter of the name, the volume and
 * alcohol percent attributes.
 * 
 * @author Daniel Hubmann
 *
 */
public class LiquidTest {

	/**
	 * Declaration of a Liquid object
	 */
	Liquid liquid;

	/**
	 * Creates the liquid object being tested
	 */
	@BeforeEach
	public void setUp() {
		liquid = new Liquid("Gin", 0.06, 37.5);
	}

	/**
	 * Tests the getter method of the name attribute
	 */
	@Test
	public void getNameTest() {
		String expectedName = "Gin";
		String result = liquid.getName();
		Assertions.assertEquals(expectedName, result);
	}

	/**
	 * Tests the setter method of the name attribute
	 */
	@Test
	public void setNameTest() {
		String expectedName = "Gin";
		liquid.setName(expectedName);
		String result = liquid.getName();
		Assertions.assertEquals(expectedName, result);
	}

	/**
	 * Tests the getter and setter method of the volume attribute
	 */
	@Test
	public void setVolumeTest() {
		double expectedVolume = 0.06;
		liquid.setVolume(expectedVolume);
		double result = liquid.getVolume();
		Assertions.assertEquals(expectedVolume, result);
	}

	/**
	 * Tests the getter and setter method of the alcohol percent attribute
	 */
	@Test
	public void setAlcoholPercentTest() {
		double expectedAlcoholPercent = 37.5;
		liquid.setAlcoholPercent(expectedAlcoholPercent);
		double result = liquid.getAlcoholPercent();
		Assertions.assertEquals(expectedAlcoholPercent, result);
	}

}
