/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seminarium3.view;

import com.mycompany.seminarium3.model.SaleObserver;
import java.io.*;

/**
 * Observes finalized sales and writes total revenue to a file.
 * This class implements the SaleObserver interface to update and log the total revenue
 * from all sales to a file named "revenue.txt".
 */
public class TotalRevenueFileOutput implements SaleObserver {
    private double totalRevenue;
    private PrintWriter file;

    /**
     * Creates a new instance of TotalRevenueFileOutput.
     * Initializes the PrintWriter to write to "revenue.txt".
     * If the file cannot be created or accessed, an error message is printed to the console.
     */
    public TotalRevenueFileOutput() {
        try {
            this.file = new PrintWriter(new FileWriter("revenue.txt"), true);
        } catch(IOException exception) {
            System.out.println("Could not create file");
            exception.printStackTrace(); 
        }
    }
/**
 * Updates the total revenue and writes it to a file if initialized, otherwise prints a message to the console.
 * 
 * @param totalAmount the total price of the sale (including VAT)
 */
    @Override
   public void finalizedSale(double totalAmount) {
        this.totalRevenue += totalAmount;
        if (file != null) {
            file.println("Total Revenue: " + this.totalRevenue);
            file.flush();
        } else {
            System.out.println("File writer not initialized");
        }
    }
}