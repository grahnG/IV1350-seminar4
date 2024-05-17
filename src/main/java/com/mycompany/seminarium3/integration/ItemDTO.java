/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seminarium3.integration;

/**
 * Represents a data transfer object (DTO) for an item.
 */
public class ItemDTO {
    private int itemIdentifier;
    private double price;
    private int VAT;
    private String itemDescription;
    private String Name;
    /**
    * Constructs a new ItemDTO object with the specified attributes.
    *
    * @param price The price of the item.
    * @param itemIdentifier The identifier of the item.
    * @param VAT The VAT (Value Added Tax) rate of the item.
    * @param itemDescription The description of the item.
    * @param name The name of the item.
    */
    public ItemDTO(double price, int itemIdentifier, int VAT, String itemDescription, String Name){
        this.VAT = VAT;
        this.itemDescription = itemDescription;
        this.itemIdentifier = itemIdentifier;
        this.price = price;
        this.Name = Name;

    }
    /**
    * Retrieves the identifier of the item.
    *
    * @return The item identifier.
    */
    public int getItemIdentifier() {
        return itemIdentifier;
    }

    /**
    * Retrieves the price of the item.
    *
    * @return The item price.
    */
    public double getPrice() {
        return price;
    }
    /**
    * Retrieves the VAT rate of the item.
    *
    * @return The VAT rate.
    */
    public int getVAT() {
        return VAT;
    }
    /**
    * Retrieves the VAT rate of the item.
    *
    * @return The VAT rate.
    */
    public String getItemDescription() {
        return itemDescription;
    }
    /**
    * Retrieves the name of the item.
    *
    * @return The item name.
    */
    public String getName(){
            return Name;
    }

}


