/*
 * DrinkQueue
 * Represents Queue of Drinks
 * Author: Daniel Hubmann, Caroline Meixner
 * Last Change: 29.06.2023
 */

package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * A DrinkQueue object represents a queue containing Drink objects.
 * 
 * It contains methods to add, remove and return the first element (in the
 * front) of the queue.
 * 
 * @author Daniel Hubmann, Caroline Meixner
 *
 */
public class DrinkQueue {
	/**
	 * List of Drink objects to store the elements of the queue
	 */
	private List<Drink> drinks = new ArrayList<Drink>();
	/**
	 * Maximum size of the queue
	 */
	private int maxSize = 5;

	/**
	 * Constructs a new StringQueue object with the specified size
	 * 
	 * @author Daniel Hubmann
	 * @param maxSize The maximum size of the queue
	 */
	public DrinkQueue(int maxSize) {
		this.maxSize = maxSize;
	}

	/**
	 * Adds the specified Drink to the end of the queue, if the queue is not full.
	 * 
	 * @author
	 * @param drink The Drink object to be added
	 * @return true if Drink was added successfully, false otherwise
	 */
	public boolean offer(Drink drink) {
		if (drinks.size() != maxSize) {
			drinks.add(drink);
			return true;
		}
		return false;
	}

	/**
	 * Returns and removes first element in the front of the queue.
	 * 
	 * @author Daniel Hubmann
	 * @return The first element in the queue or null if the queue is empty
	 */
	public Drink poll() {
		Drink drink = peek();
		
		if(drinks.size() > 0) {
			drinks.remove(0);
		}
		
		return drink;
	}

	/**
	 * Returns and removes first element in the front of the queue.
	 * 
	 * @author Daniel Hubmann
	 * @return The first element in the queue
	 * @throws NoSuchElementException if the queue is empty
	 */
	public Drink remove() {
		Drink drink = poll();
		if(drink == null) {
			throw new NoSuchElementException("there's no element anymore");
		}
		return drink;
	}

	/**
	 * Returns first element in front of the queue.
	 *
	 * @author Caroline Meixner
	 * @return first element in queue, null if empty
	 */
	public Drink peek() {
		Drink drink;
		if (drinks.get(0) != null) {
			drink = drinks.get(0);
			return drink;
		} else {
			drink = null;
			return drink;
		}
	}

	/**
	 * Return first element in front of the queue.
	 *
	 * @author Caroline Meixner
	 * @return first element in queue
	 * @throws NoSuchElementException if queue is empty
	 */
	public Drink element() {
		Drink drink = peek();
		if (drink == null) {
			throw new NoSuchElementException("there's no element any more");
		}
		return drink;
	}

}
