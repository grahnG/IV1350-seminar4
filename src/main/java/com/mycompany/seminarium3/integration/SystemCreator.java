/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seminarium3.integration;
import java.util.Arrays;
import java.util.List;

/**
* Creates and provides access to various systems used in the application.
*/
public class SystemCreator {
    private DiscountSystem discountSystem;
    private AccountingSystem accountingSystem;
    private InventorySystem inventorySystem;
    /**
    * Constructs a new SystemCreator object and initializes the systems.
    */
    public SystemCreator(){
        inventorySystem = new InventorySystem();
        discountSystem = new DiscountSystem();
        accountingSystem = new AccountingSystem();
    }
    /**
    * Retrieves the accounting system.
    *
    * @return The accounting system.
    */
    public AccountingSystem getAccounting(){
        return accountingSystem;
    }
    /**
    * Retrieves the inventory system.
    *
    * @return The inventory system.
    */
    public InventorySystem getInventory(){
        return inventorySystem;
    }

    /**
    * Retrieves the discount system.
    *
    * @return The discount system.
    */
    public DiscountSystem getDiscount(){
        return discountSystem;
    }
}