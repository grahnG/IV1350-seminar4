/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seminarium3.model;
import com.mycompany.seminarium3.integration.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

/**
* Represents a receipt generator for sale transactions.
*/
public class Receipt {
    /**
    * Constructs a new Receipt object.
    */
    public Receipt() {}

    /**
    * Generates a receipt string based on the provided SaleDTO object.
    *
    * @param saleDTO The SaleDTO object containing sale information.
    * @return A string representing the generated receipt.
    */
    public String generateReceipt(SaleDTO saleDTO) {
        StringBuilder builder = new StringBuilder();
        double totalCost = 0.0;
        double totalVAT = 0.0;
        double staticPaymentAmount = 200.0;  
    
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String saleTime = LocalDateTime.now().format(dtf);
    
        List<ItemDTO> items = saleDTO.getItems();
        List<Integer> quantities = saleDTO.getQuantities();
    
        builder.append("------------------ RECEIPT ------------------\n");
    
        for (int i = 0; i < items.size(); i++) {
            ItemDTO item = items.get(i);
            double itemPrice = item.getPrice();
            double vatAmount = itemPrice * item.getVAT() / 100.0;
            int quantity = quantities.get(i);
    
            totalCost += itemPrice * quantity;
            totalVAT += vatAmount * quantity;
    
            builder.append(String.format(Locale.US, "Item quantity: %d\n", quantity));
            builder.append(String.format(Locale.US, "Item: %s\n", item.getName()));
            builder.append(String.format(Locale.US, "Description: %s\n", item.getItemDescription()));
            builder.append(String.format(Locale.US, "Price: %.2f SEK\n", itemPrice));
            builder.append(String.format(Locale.US, "VAT: %d%% (%.2f SEK)\n", item.getVAT(), vatAmount));
            builder.append(String.format(Locale.US, "Barcode: %d\n", item.getItemIdentifier()));
            builder.append("\n");
        }
    
        double totalInclVAT = saleDTO.getTotalAmount();
        Register register = new Register();
        register.registerAmount(new Payment(totalInclVAT)); 
        Payment change = register.calculateChange(staticPaymentAmount, totalInclVAT); 
    
        builder.append("Time of Sale : ").append(saleTime).append("\n\n");
        builder.append(String.format(Locale.US, "Customer pays: %.2f SEK\n", staticPaymentAmount));
        builder.append(String.format(Locale.US, "Total cost (incl VAT): %.2f SEK\n", totalInclVAT));
        builder.append(String.format(Locale.US, "Total change: %.2f SEK\n", change.getAmount()));
        builder.append("------------------ END OF RECEIPT ------------------\n");
    
        return builder.toString();
    }
    
}

