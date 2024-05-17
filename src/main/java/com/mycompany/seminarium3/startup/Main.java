/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seminarium3.startup;

import com.mycompany.seminarium3.controller.Controller;
import com.mycompany.seminarium3.integration.*;
import com.mycompany.seminarium3.view.View;




/**
 * Starts the entire application, contains the main method used to start the application.
 */
public class Main {
    /**
     * The main method used to start the entire application.
     * 
     * @param args The application does not take any command line parameters.
     */
    public static void main(String[] args){
        SystemCreator systemCreator = new SystemCreator(); 
        Controller contr = new Controller(systemCreator); 
        View view = new View(contr);
        view.runFakeExecution();
        view.genReceipt(); 
    } 
}
    
