/*
 * DrinkQueueTest
 * Represents JUnit Test for Drink Queue
 * Author: Daniel Hubmann, Caroline Meixner
 * Last Change: 03.07.2023
 */

package at.campus02.bsd;

import org.junit.jupiter.api.*;
import java.util.NoSuchElementException;

/**
 * DrinkQueueTest represents the JUnit test class for the DrinkQueue class.
 * 
 * It contains test cases for the methods offer(), poll(), peek(), remove() and
 * element().
 * 
 * @author Daniel Hubmann
 *
 */
public class DrinkQueueTest {

	/**
	 * Declaration of the DrinkQueue object
	 */
	DrinkQueue drinkQueue;

	/**
	 * Creates the DrinkQueue object being tested
	 */
	@BeforeEach
	public void setUp() {
		drinkQueue = new DrinkQueue(1);
	}

	/**
	 * Tests if a new drink object can be added to the empty queue
	 */
	@Test
	public void offerTest_HasSpace() {
		Liquid liquid = new Liquid("Gin", 0.06, 37.5);
		SimpleDrink simpleDrink = new SimpleDrink("Martini", liquid);
		boolean result = drinkQueue.offer(simpleDrink);
		Assertions.assertTrue(result);
	}

	/**
	 * Tests if a new drink object can be added to a full queue
	 */
	@Test
	public void offerTest_IsFull() {
		Liquid liquid = new Liquid("Gin", 0.06, 37.5);
		SimpleDrink simpleDrink = new SimpleDrink("Martini", liquid);
		drinkQueue.offer(simpleDrink);
		boolean result = drinkQueue.offer(simpleDrink);
		Assertions.assertFalse(result);
	}

	/**
	 * Tests the return value of the poll() method with a filled queue
	 */
	@Test
	public void pollTest_HasDrink() {
		Liquid liquid = new Liquid("Gin", 0.06, 37.5);
		SimpleDrink simpleDrink = new SimpleDrink("Martini", liquid);
		drinkQueue.offer(simpleDrink);
		Drink result = drinkQueue.poll();
		Assertions.assertEquals(simpleDrink, result);
	}

	/**
	 * Tests the return value of the poll() method with an empty queue
	 */
	@Test
	public void pollTest_EmptyQueue() {
		SimpleDrink simpleDrink = null;
		drinkQueue.offer(simpleDrink);
		Drink result = drinkQueue.poll();
		Assertions.assertNull(result);
	}

	/**
	 * Tests the return value of the element() method with a filled queue
	 */
	@Test
	public void elementTest_HasDrink() {
		Liquid liquid = new Liquid("Gin", 0.06, 37.5);
		SimpleDrink simpleDrink = new SimpleDrink("Martini", liquid);
		drinkQueue.offer(simpleDrink);
		Drink result = drinkQueue.element();
		Assertions.assertEquals(simpleDrink, result);
	}

	/**
	 * Tests the return value of the element() method with an empty queue
	 */
	@Test
	public void elementTest_EmptyQueue() {
		Assertions.assertThrows(NoSuchElementException.class, () -> {
			SimpleDrink simpleDrink = null;
			drinkQueue.offer(simpleDrink);
			drinkQueue.element();
		});
	}

	/**
	 * Tests the return value of the remove() method with a filled queue
	 */
	@Test
	public void removeTest_HasDrink() {
		Liquid liquid = new Liquid("Gin", 0.06, 37.5);
		SimpleDrink simpleDrink = new SimpleDrink("Martini", liquid);
		drinkQueue.offer(simpleDrink);
		Drink result = drinkQueue.remove();
		Assertions.assertEquals(simpleDrink, result);
	}

	/**
	 * Tests the return value of the remove() method with an empty queue
	 */
	@Test
	public void removeTest_EmptyQueue() {
		Assertions.assertThrows(NoSuchElementException.class, () -> {
			SimpleDrink simpleDrink = null;
			drinkQueue.offer(simpleDrink);
			drinkQueue.remove();
		});
	}
}
