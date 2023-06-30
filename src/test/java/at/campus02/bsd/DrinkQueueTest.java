/*
 * DrinkQueueTest
 * Represents JUnit Test for Drink Queue
 * Author: Daniel Hubmann, Caroline Meixner
 * Last Change: 30.06.2023
 */

package at.campus02.bsd;

import org.junit.jupiter.api.*;

public class DrinkQueueTest {

	DrinkQueue drinkQueue;

	@BeforeEach
	public void setUp() {
		drinkQueue = new DrinkQueue(5);
	}

	@Test
	public void offerTest_MaxSize() {

	}

	@Test
	public void offerTest_LessThanMaxSize() {

	}

}
