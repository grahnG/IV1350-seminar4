/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package com.mycompany.seminarium3.controller;
import com.mycompany.seminarium3.model.*;
import com.mycompany.seminarium3.integration.*;
import com.mycompany.seminarium3.view.*;
import java.util.ArrayList;
import java.util.List;

/**
* Controller class responsible for managing interactions between the system components.
*/
public class Controller {
    private SystemCreator systemCreator;
    private Sale sale;
    private Printer printer;
    private Receipt receipt;
    private List<SaleObserver> saleObservers = new ArrayList<>();
    private FileLogger logger;
   
   
    /**
    * Constructs a new Controller object with the specified SystemCreator.
    *
    * @param systemCreator The SystemCreator object used to create and access system components.
    */
    public Controller(SystemCreator systemCreator){
        this.systemCreator = systemCreator;
        this.sale = new Sale(systemCreator.getInventory(), systemCreator.getAccounting()); 
        this.printer = new Printer();
        this.receipt = new Receipt();
        this.logger = new FileLogger();
        
    }
    /**
    * Starts a new sale by delegating to the Sale object.
    */
    public void startNewSale(){
        sale.startNewSale();
    }
    /**
    * Ends the current sale by delegating to the Sale object.
    */
    public void endSale() {
        for(SaleObserver obs : saleObservers){
            sale.addFinalizedSale(obs);
        
        }
        sale.endSale(sale.getSaleDTO());

    }
    
    /**
    * Prints a receipt for the current sale.
    */
    public void print(){
        String receiptInfo = receipt.generateReceipt(sale.getSaleDTO());
        printer.print(receiptInfo);
    }
    /**
    * Adds an item to the current sale by delegating to the Sale object.
    *
    * @param item The item to add to the sale.
    * @param quantity The quantity of the item to add.
    * @throws InvalidItemIdentifierException if the item identifier is invalid.
    * @throws DatabaseUnavailableException if the database is unavailable.
    */
   public void addItemToSale(ItemDTO item, int quantity) throws InvalidItemIdentifierException, DatabaseUnavailableException {
    try {
        systemCreator.getInventory().checkItemStatus(item);

        sale.addItemToSale(item, quantity);
    } catch (InvalidItemIdentifierException | DatabaseUnavailableException exception) {
        logger.log("DEVELOPER (log): " + exception.getMessage());
        throw exception; 
    }
}

   /**
    * Registers a new observer for sale finalization notifications.
    * 
    * @param obs The observer to add.
    */
   public void addSaleObserver(SaleObserver obs){
       saleObservers.add(obs);
   }
}
