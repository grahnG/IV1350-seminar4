/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seminarium3.integration;

/**
 * Custom exception for handling scenarios where the database is unavailable.
 * This exception is used throughout the application to indicate issues related to database connectivity or accessibility.
 */
public class DatabaseUnavailableException extends Exception{
    
    /**
     * Constructs a new DatabaseUnavailableException with the specified detail message.
     *
     * @param message the detail message.
     */
    public DatabaseUnavailableException(String message){
        super(message);
    }
    
}
