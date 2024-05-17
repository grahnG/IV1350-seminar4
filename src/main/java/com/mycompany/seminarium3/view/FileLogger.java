/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seminarium3.view;
import java.io.*;

/**
 * Logs messages to a file named "log.txt".
 * This class handles the creation and writing of log messages to the specified file.
 * If the file already exists, new messages are appended.
 */
public class FileLogger {
    private PrintWriter logStream;
    
    /**
     * Creates a new instance of FileLogger.
     * Initializes the PrintWriter to write to "log.txt" and appends messages.
     * If the file cannot be accessed, an error message is printed to the console.
     */
    public FileLogger() {
        try {
            this.logStream = new PrintWriter(new FileWriter("log.txt"), true);
        } catch(IOException exception) {
            System.out.println("Could not log.");
            exception.printStackTrace(); 
        }
    }
    
    /**
     * Logs a message to the log file.
     * 
     * @param message The message to log.
     */
    public void log(String message){
        logStream.println(message);
    }
}