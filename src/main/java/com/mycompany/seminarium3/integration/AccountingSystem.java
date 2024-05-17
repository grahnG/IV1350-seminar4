/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seminarium3.integration;
import com.mycompany.seminarium3.model.*;
import java.util.List;
import java.util.ArrayList;
/**
 * Represents an accounting system that manages accounting records for sales.
 */
public class AccountingSystem {
    private List<SaleDTO> accountingRecords = new ArrayList<>();
    /**
    * Constructs a new AccountingSystem object.
    */
    public AccountingSystem(){}
    /**
    * Updates the accounting records with information from a sale.
    *
    * @param saleDTO The SaleDTO object containing sale information.
    */
    public void updateAccounting(SaleDTO saleDTO){

        accountingRecords.add(saleDTO);        
    }
    
}
