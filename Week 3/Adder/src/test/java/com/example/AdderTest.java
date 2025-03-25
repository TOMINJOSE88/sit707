package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdderTest {

    private Adder adder = new Adder();

    @Test
    void testAddPositiveNumbers() {
        assertEquals(5, adder.add(2, 3));
    }

    @Test
    void testAddNegativeNumbers() {
        assertEquals(-5, adder.add(-2, -3));
    }

    @Test
    void testAddZero() {
        assertEquals(5, adder.add(5, 0));
        assertEquals(-5, adder.add(-5, 0));
    }

    @Test
    void testAddMixedSigns() {
        assertEquals(2, adder.add(5, -3));
        assertEquals(-2, adder.add(-5, 3));
    }

    // New Subtract Tests
    @Test
    void testSubtractPositiveNumbers() {
        assertEquals(1, adder.subtract(4, 3));
    }

    @Test
    void testSubtractNegativeNumbers() {
        assertEquals(1, adder.subtract(-2, -3));
    }

    @Test
    void testSubtractWithZero() {
        assertEquals(5, adder.subtract(5, 0));
        assertEquals(-5, adder.subtract(-5, 0));
    }

    @Test
    void testSubtractMixedSigns() {
        assertEquals(8, adder.subtract(5, -3));
        assertEquals(-8, adder.subtract(-5, 3));
    }
}
