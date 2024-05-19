/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.seminarium3.integration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for the InvalidItemIdentifierException class.
 */
public class InvalidItemIdentifierExceptionTest {
    
    private InvalidItemIdentifierException exception;
    
    /**
     * Sets up the test environment before each test.
     * Initializes an InvalidItemIdentifierException instance with a test message.
     */
    @BeforeEach
    public void setUp() {
        exception = new InvalidItemIdentifierException("Invalid item identifier provided");
    }
    
    /**
     * Cleans up the test environment after each test.
     */
    @AfterEach
    public void tearDown() {
    }
    
    /**
     * Tests if the exception message is correctly passed and retrieved.
     * Ensures that the message set during exception instantiation matches the expected message.
     */
    @Test
    public void testExceptionMessage() {
        assertEquals("Invalid item identifier provided", exception.getMessage());
    }
    
    /**
     * Tests if the exception is correctly recognized as an instance of the Exception class.
     * Ensures that InvalidItemIdentifierException is properly extending the Exception class.
     */
    @Test
    public void testExceptionInstance() {
        assertTrue(exception instanceof Exception);
    }

    /**
     * Tests if the InvalidItemIdentifierException is thrown under simulated conditions where an invalid identifier is used.
     */
    @Test
    public void testExceptionThrown() {
        try {
            checkItemIdentifier("123ABC");
            fail("InvalidItemIdentifierException was expected but not thrown.");
        } catch (InvalidItemIdentifierException ex) {
            assertEquals("Invalid item identifier provided", ex.getMessage(), "The exception message should match the expected message.");
        }
    }

    /**
     * A helper method to simulate checking an item identifier that throws InvalidItemIdentifierException
     * if the identifier does not meet specific criteria.
     */
    private void checkItemIdentifier(String identifier) throws InvalidItemIdentifierException {
        if (!identifier.matches("\\d+")) {  
            throw new InvalidItemIdentifierException("Invalid item identifier provided");
        }
    }
}


