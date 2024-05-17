/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seminarium3.view;

import com.mycompany.seminarium3.model.SaleObserver;

/**
 * This class represents a sale observer that tracks total revenue and prints it to the console.
 * It implements the SaleObserver interface.
 */
class TotalRevenueView implements SaleObserver {
    private double totalRevenue;
    
    /**
    * Prints a specific String to console.
    * 
    * @param totalAmount receives the total price of the sale (including VAT)
    */
    @Override
    public void finalizedSale(double totalAmount){
        totalRevenue += totalAmount;
        System.out.println("Total revenue: " + totalRevenue);
    }
}