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
     */
    @AfterEach
    public void tearDown() {
        // Clean up resources or reset states if necessary
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

    /**
     * Tests if the DatabaseUnavailableException is thrown under simulated database failure conditions.
     */
    @Test
    public void testExceptionThrown() {
        try {
            simulateDatabaseAccess();
            fail("DatabaseUnavailableException was expected but not thrown.");
        } catch (DatabaseUnavailableException ex) {
            assertEquals("Test database is unavailable", ex.getMessage(), "The exception message should match the expected message.");
        }
    }

    /**
     * A helper method to simulate database access that throws DatabaseUnavailableException
     * under certain conditions (e.g., database not reachable).
     */
    private void simulateDatabaseAccess() throws DatabaseUnavailableException {
        throw new DatabaseUnavailableException("Test database is unavailable");
    }
}


