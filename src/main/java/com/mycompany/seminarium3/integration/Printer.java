/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seminarium3.integration;
import com.mycompany.seminarium3.model.*;

/**
 * Handles printing operations for the system.
 * Currently, this class simulates printing by outputting text to the console.
 */
public class Printer {


    /**
     * Constructs a Printer 
     */
    public Printer() {}

    /**
     * Prints the provided text.
     * In this simulation, it displays the text on the console.
     *
     * @param receipt The text (typically a receipt) to be printed.
     */
    public void print(String receipt){
     System.out.println(receipt);
    }

}
