/*
 * StringQueue
 * Represents Queue of Strings
 * Author: Daniel Hubmann, Caroline Meixner
 * Last Change: 22.06.2023
 */

package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * A StringQueue object represents a queue containing String objects.
 * 
 * It implements the IQueue interface and therefore contains methods to add,
 * remove and return the first element (in the front) of the queue.
 * 
 * @author Daniel Hubmann
 *
 */
public class StringQueue implements IQueue {

	/**
	 * List of String objects to store the elements of the queue
	 */
	private List<String> elements = new ArrayList<String>();

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
	public StringQueue(int maxSize) {
		this.maxSize = maxSize;
	}

	/**
	 * Adds the specified String to the end of the queue, if the queue is not full.
	 * 
	 * @author Daniel Hubmann
	 * @param obj The String object to be added.
	 * @return true if object was added successfully, false otherwise
	 */
	@Override
	public boolean offer(String obj) {
		if (elements.size() != maxSize)
			elements.add(obj);
		else
			return false;

		return true;
	}

	/**
	 * Returns and removes first element in the front of the queue.
	 * 
	 * @author Daniel Hubmann
	 * @return The first element in the queue or null if the queue is empty
	 */
	@Override
	public String poll() {
		String element = peek();

		if (elements.size() > 0) {
			elements.remove(0);
		}
		return element;
	}

	/**
	 * Returns and removes first element in the front of the queue.
	 * 
	 * @author Daniel Hubmann
	 * @return The first element in the queue
	 * @throws NoSuchElementException if the queue is empty
	 */
	@Override
	public String remove() {
		String element = poll();
		if (element == null)
			throw new NoSuchElementException("there's no element any more");

		return element;
	}

	/**
	 * Returns the first element in the front of the queue if it is not empty, or
	 * null if it is empty.
	 * 
	 * @author Daniel Hubmann
	 * @return The first element in the queue or null if the queue is empty
	 */
	@Override
	public String peek() {
		String element;
		if (elements.size() > 0)
			element = elements.get(0);
		else
			element = null;

		return element;
	}

	/**
	 * Returns the first element in the front of the queue.
	 * 
	 * @author Daniel Hubmann
	 * @return The first element in the queue
	 * @throws NoSuchElementException if the queue is empty
	 */
	@Override
	public String element() {
		String element = peek();
		if (element == null)
			throw new NoSuchElementException("there's no element any more");

		return element;
	}

}