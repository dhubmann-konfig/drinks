/*
 * StringQueueTest
 * Represents JUnit Test for String Queue
 * Author: Daniel Hubmann, Caroline Meixner
 * Last Change: 03.07.2023
 */

package at.campus02.bsd;

import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;

/**
 * JUnit Test class for StringQueue class.
 *
 * Contains test cases for offer(), poll(), remove(),
 * peek(), element() methods.
 *
 * @author Caroline Meixner
 *
 */

public class StringQueueTest {

    /**
     * Declaration of the StringQueue object
     */
    StringQueue stringQueue;

    /**
     * Test string
     */
    String string = "text";

    /**
     * Creates new StringQueue object with max size of 1
     */
    @BeforeEach
    public void setUp() {
        stringQueue = new StringQueue(1);
    }


    /**
     * Tests if a new string can be added to an empty queue
     */
    @Test
    public void offerTest_HasSpace() {
        boolean result = stringQueue.offer(string);
        Assertions.assertTrue(result);
    }

    /**
     * Tests if a new string can be added to a full queue
     */
    @Test
    public void offerTest_Full() {
        stringQueue.offer(string);
        boolean result = stringQueue.offer(string);
        Assertions.assertFalse(result);
    }

    /**
     * Tests return value of poll() method with a filled queue
     */
    @Test
    public void pollTest_Filled() {
        stringQueue.offer(string);
        String result = stringQueue.poll();
        Assertions.assertEquals(string, result);
    }

    /**
     * Tests return value of poll() method with an empty queue
     */
    @Test
    public void pollTest_Empty() {
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            stringQueue.poll();
        });
    }

    /**
     * Tests return value of remove() method with a filled queue
     */
    @Test
    public void removeTest_Filled() {
        stringQueue.offer(string);
        String result = stringQueue.remove();
        Assertions.assertEquals(string, result);
    }

    /**
     * Tests return value of remove() method with an empty queue
     */
    @Test
    public void removeTest_Empty() {
        Assertions.assertThrows(NoSuchElementException.class, () -> {
            string = null;
            stringQueue.offer(string);
            stringQueue.remove();
        });
    }

    /**
     * Tests return value of peek() method with a filled queue
     */
    @Test
    public void peekTest_Filled() {
        stringQueue.offer(string);
        String result = stringQueue.peek();
        Assertions.assertEquals(string, result);
    }

    /**
     * Tests return value of peek() method with an empty queue
     */
    @Test
    public void peekTest_Empty() {
        String result = stringQueue.peek();
        Assertions.assertNull(result);
    }

    /**
     * Tests return value of element() method with a filled queue
     */
    @Test
    public void elementTest_Filled() {
        stringQueue.offer(string);
        String result = stringQueue.element();
        Assertions.assertEquals(string, result);
    }

    /**
     * Tests return value of element() method with an empty queue
     */
    @Test
    public void elementTest_Empty() {
        Assertions.assertThrows(NoSuchElementException.class, () -> {
            string = null;
            stringQueue.offer(string);
            stringQueue.element();
        });
    }

}
