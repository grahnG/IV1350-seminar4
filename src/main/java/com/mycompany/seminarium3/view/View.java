/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seminarium3.view;

import com.mycompany.seminarium3.controller.*;
import com.mycompany.seminarium3.integration.*;

/**
 * This is a placeholder for the real view. It contains a hardcoded execution with calls to all
 * system operations in the controller.
 * @author gusta
 */
public class View {
    private Controller contr;
    private FileLogger logger;

    /**
     * Creates a new instance, that uses the specified controller for all calls to other layers.
     * 
     * @param contr The controller to use for all calls to other layers. 
     */
    public View(Controller contr){
        this.contr = contr;
        this.logger = new FileLogger();
        contr.addSaleObserver(new TotalRevenueFileOutput());
        contr.addSaleObserver(new TotalRevenueView());
        
    }

    /**
    * Simulates a sale by calling all relevant system operations in the controller.
    * Initiates a new sale, adds items to the sale, and handles exceptions with appropriate logging and user messages.
    */
    public void runFakeExecution(){
        contr.startNewSale();
        System.out.println("A new sale has been started.");
        ItemDTO oatmeal = new ItemDTO(29.90, 123456, 6, "BigWheel Oatmeal 500 ml, whole grain oats,"
                + " high fiber, gluten free", "BigWheel Oatmeal");
        ItemDTO YouGoGo = new ItemDTO(14.90, 4568, 6, "YouGoGo Blueberry 240 g, low sugar yogurt,"
                + " blueberry flavour", "YouGoGo Blueberry");
        
        try{
            contr.addItemToSale(oatmeal, 2);
            contr.addItemToSale(YouGoGo, 1);
        } catch(InvalidItemIdentifierException exception){
            logger.log("Invalid item idenfitier!");
            System.err.println("Error: Invalid item identifier!");
        } catch (DatabaseUnavailableException exception){
            logger.log("Database is currently unavailable, please contact the IT department");
            System.err.println("Error: Database is currently unavailable, please contact the IT department");
        }
    }
    
    /**
     * Completes the current sale process by finalizing all transactions and triggering the receipt generation.
     */
    public void genReceipt(){
        contr.endSale();
        contr.print();   
    }
}
