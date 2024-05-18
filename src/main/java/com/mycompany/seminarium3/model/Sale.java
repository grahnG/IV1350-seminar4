/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seminarium3.model;
import com.mycompany.seminarium3.integration.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
* Represents a sale transaction, managing sale details and generating receipts.
*/
public class Sale {
    private SaleDTO saleDTO;
    private Receipt receipt;
    private InventorySystem inventorySystem;
    private AccountingSystem accountingSystem;
    private double totalAmount;
    
    private List<SaleObserver> saleObservers = new ArrayList<>();

    /**
    * Constructs a new Sale object with the specified InventorySystem and AccountingSystem.
    *
    * @param inventorySystem The inventory system to manage inventory.
    * @param accountingSystem The accounting system to manage accounting.
    */
    public Sale(InventorySystem inventorySystem, AccountingSystem accountingSystem) {
        this.inventorySystem = inventorySystem;
        this.accountingSystem = accountingSystem;
        this.saleDTO = new SaleDTO(); 
    }
    /**
    * Initializes a new sale by re-initializing the SaleDTO.
    */
    public void startNewSale() {  
        this.saleDTO = new SaleDTO();
    }
    
    /**
    * Adds or updates an item in the sale, and recalculates financial totals.
    * Verifies item availability, updates quantity if existing, or adds new item.
    * Calculates and updates the total price and VAT based on the item and quantity added.
    *
    * @param item The item to be added or updated in the sale.
    * @param quantity The number of this item to add.
    * @throws InvalidItemIdentifierException if the item identifier is invalid.
    * @throws DatabaseUnavailableException if the database is unavailable.
    */
    public void addItemToSale(ItemDTO item, int quantity) throws InvalidItemIdentifierException {
    inventorySystem.checkItemStatus(item);

    int index = saleDTO.getItemIndex(item);
    if (index != -1) {
        saleDTO.updateItemQuantity(index, quantity);
    } else {
        saleDTO.addItem(item, quantity);
    }

    double itemTotalPrice = item.getPrice() * quantity;
    double itemTotalVAT = itemTotalPrice * item.getVAT() / 100;
    saleDTO.updateFinancialDetails(itemTotalPrice, itemTotalVAT);
}
    /**
     * Finalizes the sale by generating a receipt, updating inventory, and accounting.
     *
     * @param saleDTO The sale data transfer object containing details of the sale.
     */
    public void endSale(SaleDTO saleDTO) {
        this.receipt = new Receipt();
        String receiptString = receipt.generateReceipt(saleDTO);
        this.totalAmount = saleDTO.getTotalAmount();
        inventorySystem.updateInventory(saleDTO);
        accountingSystem.updateAccounting(saleDTO);
        notifyObservers();
        
    }

    
    /**
     * Finalizes the sale by generating a receipt, updating inventory, and accounting.
     * @return SaleDTO the current state of the sale transaction.
     */
    public SaleDTO getSaleDTO(){
        return this.saleDTO;
    }
    
    private void notifyObservers(){
        for(SaleObserver obs : saleObservers){
            obs.finalizedSale(totalAmount);
        }
    }
    /**
    * Registers an observer to be notified when a sale is finalized.
    * Observers added here will be alerted at the end of a sale transaction.
    *
    * @param obs The observer to add to the list of notified entities.
    */
    public void addFinalizedSale(SaleObserver obs) {
        saleObservers.add(obs);
    }
}