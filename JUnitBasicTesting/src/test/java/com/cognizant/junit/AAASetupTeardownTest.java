package com.cognizant.junit;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AAASetupTeardownTest {

    private int a;
    private int b;

    @Before
    public void setUp() {
        a = 10;
        b = 20;
        System.out.println("Setup completed");
    }

    @Test
    public void testAddition() {

        // Arrange
        int expected = 30;

        // Act
        int actual = a + b;

        // Assert
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() {
        System.out.println("Teardown completed");
    }
}