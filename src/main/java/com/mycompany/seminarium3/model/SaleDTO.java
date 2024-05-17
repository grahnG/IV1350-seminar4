/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seminarium3.model;
import com.mycompany.seminarium3.integration.*;
import java.util.*;
import java.time.*;

/**
 * Groups all data related to a sale
 */
public class SaleDTO{
        private double totalVAT;
        private List<ItemDTO> items = new ArrayList<>();
        private List<Integer> quantities = new ArrayList<>();
        private double totalAmount;
        private InventorySystem inventorySystem;
        private LocalDateTime timeAndDate;
        /**
        * Constructs a new SaleDTO object with the current date and time.
        */
        public SaleDTO() {
            this.inventorySystem = inventorySystem;
            this.timeAndDate = LocalDateTime.now();
        }
        /**
        * Retrieves the index of the specified item in the list of items.
        *
        * @param item The item to search for.
        * @return The index of the item, or -1 if not found.
        */
        public int getItemIndex(ItemDTO item) {
            return items.indexOf(item);
        }
        /**
        * Adds an item with the specified quantity to the sale.
        *
        * @param item The item to add.
        * @param quantity The quantity of the item to add.
        */
        public void addItem(ItemDTO item, int quantity) {
            items.add(item);
            quantities.add(quantity);
        }
        /**
        * Updates the quantity of an item in the sale.
        *
        * @param index The index of the item to update.
        * @param additionalQuantity The additional quantity to add to the item.
        */
        public void updateItemQuantity(int index, int additionalQuantity) {
            int currentQuantity = quantities.get(index);
            quantities.set(index, currentQuantity + additionalQuantity);
        }
        /**
        * Updates the total amount and total VAT of the sale based on the price and VAT of an item.
        *
        *  @param itemTotalPrice The total price of the item.
        * @param itemTotalVAT The total VAT of the item.
        */
        public void updateFinancialDetails(double itemTotalPrice, double itemTotalVAT) {
            totalAmount += itemTotalPrice;
            totalVAT += itemTotalVAT;
        }
        /**
        * Retrieves the total amount of the sale.
        *
        * @return The total amount of the sale.
        */
        public double getTotalAmount(){
            return totalAmount;
        }
        /**
        * Retrieves the total VAT of the sale.
        *
        * @return The total VAT of the sale.
        */
        public double getTotalVAT(){
            return totalVAT;
        }
        /**
        *  Retrieves the date and time of the sale.
        *
        * @return The date and time of the sale.
        */
        public LocalDateTime getTimeAndDate(){
            return timeAndDate;
        }
        /**
        * Retrieves the list of items in the sale.
        *
        * @return The list of items in the sale.
        */
        public List<ItemDTO> getItems() {
            return items;
        }
        /**
        * Retrieves the list of quantities corresponding to the items in the sale.
        *
        * @return The list of quantities.
        */
        public List<Integer> getQuantities() {
            return quantities;
        }
        /**
        * Sets the total amount of the sale.
        *
        * @param amountToSet The amount to set.
        */
        public void setTotalAmount(double amountToSet){
            this.totalAmount = amountToSet;
        }
        /**
        * Sets the total VAT of the sale.
        *
        * @param VATToSet The VAT to set.
        */
        public void setTotalVat(double VATToSet){
            this.totalVAT = VATToSet;
        }
    }
