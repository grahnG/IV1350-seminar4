/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.seminarium3.integration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for the SystemCreator class to ensure it properly initializes system components like 
 * AccountingSystem, InventorySystem, and DiscountSystem, and verifies their readiness for use.
 */
public class SystemCreatorTest {
    
    private SystemCreator systemCreator;

    /**
     * Sets up the testing environment before each test.
     * Initializes the SystemCreator to ensure a fresh system state for each test.
     */
    @BeforeEach
    public void setUp() {
        systemCreator = new SystemCreator();
    }
    
    /**
     * Cleans up the testing environment after each test.
     * Nullifies the SystemCreator reference to prevent test interference.
     */
    @AfterEach
    public void tearDown() {
        systemCreator = null;
    }

    /**
     * Test of getAccounting method, of class SystemCreator.
     */
    @Test
    public void testGetAccounting() {
        assertNotNull(systemCreator.getAccounting(), "getAccounting should not return null.");
        assertTrue(systemCreator.getAccounting() instanceof AccountingSystem, "getAccounting should return an instance of AccountingSystem.");
    }

    /**
     * Test of getInventory method, of class SystemCreator.
     */
    @Test
    public void testGetInventory() {
        assertNotNull(systemCreator.getInventory(), "getInventory should not return null.");
        assertTrue(systemCreator.getInventory() instanceof InventorySystem, "getInventory should return an instance of InventorySystem.");
    }

    /**
     * Test of getDiscount method, of class SystemCreator.
     */
    @Test
    public void testGetDiscount() {
        assertNotNull(systemCreator.getDiscount(), "getDiscount should not return null.");
        assertTrue(systemCreator.getDiscount() instanceof DiscountSystem, "getDiscount should return an instance of DiscountSystem.");
    }
    
}

