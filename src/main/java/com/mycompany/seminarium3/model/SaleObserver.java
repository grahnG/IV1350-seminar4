/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.seminarium3.model;

/**
 * Interface for observing finalized sales.
 * Implementing classes will be notified when a sale is completed.
 * 
 * @param totalAmount The total amount of the finalized sale.
 */
public interface SaleObserver {
    /**
     * Invoked when a sale has been finalized
     * 
     * @param totalAmount the total amount that will observed and passed through the classes
     */
    void finalizedSale(double totalAmount);
}
