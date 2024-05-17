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
 * Tests the ItemDTO class to check if it correctly handles item details like price, identifier, and descriptions.
 */
public class ItemDTOTest {

    private ItemDTO itemDTO;

    /**
     * Sets up the testing environment before each test.
     * Initializes the ItemDTO with predefined values to be used in all tests.
     */
    @BeforeEach
    public void setUp() {

        itemDTO = new ItemDTO(199.99, 123456, 25, "High-quality steel hammer", "Steel Hammer");
    }

    /**
     * Cleans up the testing environment after each test.
     * Ensures that the ItemDTO object is ready for garbage collection.
     */
    @AfterEach
    public void tearDown() {
        itemDTO = null;
    }

    /**
     * Test of getItemIdentifier method, of class ItemDTO.
     */
    @Test
    public void testGetItemIdentifier() {
        assertEquals(123456, itemDTO.getItemIdentifier(), "getItemIdentifier should return the correct identifier.");
    }

    /**
     * Test of getPrice method, of class ItemDTO.
     */
    @Test
    public void testGetPrice() {
        assertEquals(199.99, itemDTO.getPrice(), 0.01, "getPrice should return the correct price.");
    }

    /**
     * Test of getVAT method, of class ItemDTO.
     */
    @Test
    public void testGetVAT() {
        assertEquals(25, itemDTO.getVAT(), "getVAT should return the correct VAT rate.");
    }

    /**
     * Test of getItemDescription method, of class ItemDTO.
     */
    @Test
    public void testGetItemDescription() {
        assertEquals("High-quality steel hammer", itemDTO.getItemDescription(), "getItemDescription should return the correct description.");
    }

    /**
     * Test of getName method, of class ItemDTO.
     */
    @Test
    public void testGetName() {
        assertEquals("Steel Hammer", itemDTO.getName(), "getName should return the correct name.");
    }
}

