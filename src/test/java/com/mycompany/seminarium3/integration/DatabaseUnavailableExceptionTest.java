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
 * Tests for the DatabaseUnavailableException class.
 */
public class DatabaseUnavailableExceptionTest {
    private DatabaseUnavailableException exception;
    
    /**
     * Sets up the test environment before each test.
     * Initializes a DatabaseUnavailableException instance with a test message.
     */
    @BeforeEach
    public void setUp() {
        exception = new DatabaseUnavailableException("Test database is unavailable");
    }
    
    /**
     * Cleans up the test environment after each test.
     * Currently, no specific cleanup is required, but the method is included for completeness.
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
        assertEquals("Test database is unavailable", exception.getMessage());
    }
    
    /**
     * Tests if the exception is correctly recognized as an instance of the RuntimeException class.
     * Ensures that DatabaseUnavailableException is properly extending the RuntimeException class.
     */
    @Test
    public void testExceptionInstance() {
        assertTrue(exception instanceof Exception);
    }
}

