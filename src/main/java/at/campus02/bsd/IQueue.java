/*
 * IQueue
 * Represents Queue Interface
 * Author: Daniel Hubmann, Caroline Meixner
 * Last Change: 22.06.2023
 */

package at.campus02.bsd;

/**
 * The IQueue interface represents the functionality of a queue data structure.
 * 
 * It contains signatures for methods to add, remove and return the first
 * element (in the front) of the queue.
 * 
 * @author Daniel Hubmann
 *
 */
public interface IQueue {
	/**
	 * Adds object to queue and returns true if successful
	 * 
	 * @author Daniel Hubmann
	 * @param obj String object to add
	 * @return true if successful, false otherwise
	 */
	public abstract boolean offer(String obj);

	/**
	 * Returns and deletes the first element.
	 * 
	 * @author Daniel Hubmann
	 * @return String object at the front of the queue
	 */
	public abstract String poll();

	/**
	 * Returns and deletes the first element. If queue is empty a
	 * NoSuchElementException should be thrown.
	 * 
	 * @author Daniel Hubmann
	 * @return String object at the front of the queue
	 * @throws NoSuchElementException if queue is empty (depending on
	 *                                implementation)
	 */
	public abstract String remove();

	/**
	 * Returns the first element.
	 * 
	 * @author Daniel Hubmann
	 * @return String object at the front of the queue
	 */
	public abstract String peek();

	/**
	 * Returns the first element. If queue is empty a NoSuchElementException should
	 * be thrown.
	 * 
	 * @author Daniel Hubmann
	 * @return String object at the front of the queue
	 * @throws NoSuchElementException if queue is empty (depending on
	 *                                implementation)
	 */
	public abstract String element();
}