/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seminarium3.model;
import com.mycompany.seminarium3.integration.*;

/**
* Represents a payment with a specific amount.
*/
public class Payment{
    private double amount;
    /**
    * Constructs a new Payment object with the specified amount.
    *
    * @param amount The amount of the payment.
    */
    public Payment(double amount){
        this.amount = amount;
    }

    /**
    * Retrieves the amount of the payment.
    *
    * @return The amount of the payment.
    */
    public double getAmount(){
        return amount;
    }

}
