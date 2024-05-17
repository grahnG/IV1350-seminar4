/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seminarium3.integration;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a discount system that determines discount 
 * eligibility based on customer IDs.
 */
public class DiscountSystem{

    private List<Integer> customerIDs = new ArrayList<>();
    private List<Integer> discountRates =  new ArrayList<>();
    /**
    * Constructs a new DiscountSystem object.
    */
    public DiscountSystem(){}
    /**
    * Checks if a customer with the specified ID is eligible for a discount.
    *
    * @param ID The ID of the customer to check.
    * @return true if the customer is eligible for a discount, false otherwise.
    */
    public boolean discountEligibility(int ID){
        boolean eligible = false;
        if(customerIDs.contains(ID)){
            eligible = true;
        }
        return eligible;
    }
}

