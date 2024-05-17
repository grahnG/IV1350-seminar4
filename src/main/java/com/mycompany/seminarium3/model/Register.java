/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seminarium3.model;
import java.util.*;
/**
 * Represents a register for managing payments and transactions.
 */

public class Register {
    private List<Payment> paymentHistory;
    private double totalAmountCollected;

    
    /**
    * Constructs a new Register object.
    */
    public Register() {
        this.paymentHistory = new ArrayList<>();  
    }
    /**
    * Registers a payment and adds it to the payment history.
    *
    * @param payment The payment to register.
    */
    public void registerAmount(Payment payment) {
        paymentHistory.add(payment);
        totalAmountCollected += payment.getAmount();  
    }
    /**
    * Calculates the change to be given for a payment.
    *
    * @param amountToPay The amount to be paid. 
    * @return A Payment object representing the change.
    */
    public Payment calculateChange(double amountPaid, double totalCost) {
        double changeAmount = amountPaid - totalCost;
        return new Payment(changeAmount);
    }
    /**
    * Calculates the payment amount based on the total amount of the sale.
    *
    * @param saleDTO The SaleDTO object containing sale information.
    * @return A Payment object representing the amount to pay.
    */
    public Payment amountToPay(SaleDTO saleDTO) {
        double totalAmount = saleDTO.getTotalAmount();
        return new Payment(totalAmount);
    }
} 
