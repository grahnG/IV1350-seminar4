/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seminarium3.integration;

/**
 * Custom exception for signaling issues related to invalid item identifiers.
 * This exception is thrown when an operation encounters an item identifier that does not exist or is not recognized in the system's database.
 */
public class InvalidItemIdentifierException extends Exception{
    
     /**
     * Constructs a new InvalidItemIdentifierException with a specified detail message.
     *
     * @param message the detail message that explains the reason for the exception.
     */
    public InvalidItemIdentifierException(String message){
        super(message);
    }
    
}
