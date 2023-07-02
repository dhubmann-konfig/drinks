/*
 * StringQueueTest
 * Represents JUnit Test for String Queue
 * Author: Daniel Hubmann, Caroline Meixner
 * Last Change: 01.07.2023
 */

package at.campus02.bsd;

import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

public class StringQueueTest {

    StringQueue stringQueue;
    String string = "text";

    @BeforeEach
    public void setUp() {
        stringQueue = new StringQueue(1);
    }

    @Test
    public void offerTest_HasSpace() {
        boolean result = stringQueue.offer(string);
        Assertions.assertTrue(result);
    }

    @Test
    public void offerTest_Full() {
        stringQueue.offer(string);
        boolean result = stringQueue.offer(string);
        Assertions.assertFalse(result);
    }

    @Test
    public void pollTest_Filled() {
        stringQueue.offer(string);
        String result = stringQueue.poll();
        Assertions.assertEquals(string, result);
    }

    @Test
    public void pollTest_Empty() {
        string = null;
        stringQueue.offer(string);
        String result = stringQueue.poll();
        Assertions.assertNull(result);
    }

    @Test
    public void removeTest_Filled() {
        stringQueue.offer(string);
        String result = stringQueue.remove();
        Assertions.assertEquals(string, result);
    }

    @Test
    public void removeTest_Empty() {
        Assertions.assertThrows(NoSuchElementException.class, () -> {
            string = null;
            stringQueue.offer(string);
            stringQueue.remove();
        });
    }

    @Test
    public void peekTest_Filled() {
        stringQueue.offer(string);
        String result = stringQueue.peek();
        Assertions.assertEquals(string, result);
    }

    @Test
    public void peekTest_Empty() {
        string = null;
        stringQueue.offer(string);
        String result = stringQueue.peek();
        Assertions.assertNull(result);
    }

    @Test
    public void elementTest_Filled() {
        stringQueue.offer(string);
        String result = stringQueue.element();
        Assertions.assertEquals(string, result);
    }

    @Test
    public void elementTest_Empty() {
        Assertions.assertThrows(NoSuchElementException.class, () -> {
            string = null;
            stringQueue.offer(string);
            stringQueue.element();
        });
    }

}
