/*
 * DrinkQueueTest
 * Represents JUnit Test for Drink Queue
 * Author: Daniel Hubmann, Caroline Meixner
 * Last Change: 30.06.2023
 */

package at.campus02.bsd;

import org.junit.jupiter.api.*;
import java.util.NoSuchElementException;

public class DrinkQueueTest {

	DrinkQueue drinkQueue;

	@BeforeEach
	public void setUp() {
		drinkQueue = new DrinkQueue(1);
	}

	@Test
	public void offerTest_HasSpace() {
		Liquid liquid = new Liquid("Gin", 0.06, 37.5);
		SimpleDrink simpleDrink = new SimpleDrink("Martini", liquid);
		boolean result = drinkQueue.offer(simpleDrink);
		Assertions.assertTrue(result);
	}

	@Test
	public void offerTest_IsFull() {
		Liquid liquid = new Liquid("Gin", 0.06, 37.5);
		SimpleDrink simpleDrink = new SimpleDrink("Martini", liquid);
		drinkQueue.offer(simpleDrink);
		boolean result = drinkQueue.offer(simpleDrink);
		Assertions.assertFalse(result);
	}

	@Test
	public void pollTest_HasDrink() {
		Liquid liquid = new Liquid("Gin", 0.06, 37.5);
		SimpleDrink simpleDrink = new SimpleDrink("Martini", liquid);
		drinkQueue.offer(simpleDrink);
		Drink result = drinkQueue.poll();
		Assertions.assertEquals(simpleDrink, result);
	}

	@Test
	public void pollTest_EmptyQueue() {
		SimpleDrink simpleDrink = null;
		drinkQueue.offer(simpleDrink);
		Drink result = drinkQueue.poll();
		Assertions.assertNull(result);
	}

	@Test
	public void elementTest_HasDrink() {
		Liquid liquid = new Liquid("Gin", 0.06, 37.5);
		SimpleDrink simpleDrink = new SimpleDrink("Martini", liquid);
		drinkQueue.offer(simpleDrink);
		Drink result = drinkQueue.element();
		Assertions.assertEquals(simpleDrink, result);
	}

	@Test
	public void elementTest_EmptyQueue() {
		Assertions.assertThrows(NoSuchElementException.class, () -> {
			SimpleDrink simpleDrink = null;
			drinkQueue.offer(simpleDrink);
			drinkQueue.element();
		});
	}
	
	@Test
	public void removeTest_HasDrink() {
		Liquid liquid = new Liquid("Gin", 0.06, 37.5);
		SimpleDrink simpleDrink = new SimpleDrink("Martini", liquid);
		drinkQueue.offer(simpleDrink);
		Drink result = drinkQueue.remove();
		Assertions.assertEquals(simpleDrink, result);
	}
	
	@Test
	public void removeTest_EmptyQueue() {
		Assertions.assertThrows(NoSuchElementException.class, () -> {
			SimpleDrink simpleDrink = null;
			drinkQueue.offer(simpleDrink);
			drinkQueue.remove();
		});
	}
}
