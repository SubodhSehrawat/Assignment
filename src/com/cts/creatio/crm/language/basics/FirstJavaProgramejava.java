package com.cts.creatio.crm.language.basics;

import java.util.logging.Logger;

public class FirstJavaProgramejava {
	
   /**********Advantage of Print Statements*******************/
	
	//Debugging the Error Detection
	//Monitoring Program Execution 
	//Testing and Validation 
	//Education and Learning 
	//Logging System 
	
	public static void main(String[] args) {
		// Print the content and then go to next line 
        System.out.println("Hello World!");
        System.out.println();
      //Print the content and stay on same line
        System.out.print("Hello");
        System.out.print(" World!");
        System.out.println();
        //Print the formatted content and stay on same line 
        System.out.printf("Hello");
        System.out.println();
        
        //Format the digit and print the formated content then stay on same line
        System.out.format("Total Bill is %.3f", 100.87654566);
        System.out.println();
        
        //Join  multiple print statement together 
        System.out.append("My name is subodh").append(",my birth place is Delhi");
        System.out.println();
        
        //Print based on char on ASIIC value 
        System.out.write(65);
        System.out.println();
        
        //Print logs of program 
        Logger log = Logger.getLogger("My Log");
        log.info("Current line is 41");
        log.warning("There is some warning in line number 41");
        
        //Print the error in print statement 
        System.err.println("Error: There is a error expected result is not matching");
        
        
	}

}
