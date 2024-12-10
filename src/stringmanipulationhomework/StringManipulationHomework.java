/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringmanipulationhomework;
import inpututilities.InputUtilities;
/**
 *
 * @author alper
 */
public class StringManipulationHomework {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    //First imported inpututilities after that we put in a code to use it    
        InputUtilities myInput = new InputUtilities();
        
    //We are asking first name to user using InputUtilities  and same time all letters converted to upper case    
        String userName = myInput.askUserForText("Please enter your first name.").toUpperCase();
        
    //Doing same thing like first name but this time for last name    
        String lastName = myInput.askUserForText("Please enter your last name.").toUpperCase();
        
    //Getting together first and last name using with .concat    
        String fullName = userName.concat(" "+lastName);
        
    //I just used new string for seeing full name lower cased at first time    
        String fullName2 = userName.concat(" "+lastName).toLowerCase();
        
            System.out.println("Your full name is "+fullName2);
            System.out.println("Your name with all letters are upper cased like ("+fullName+ ") that.");
            
    // Used replaceAll for seeing user full name without vovel letters and replaced with "*"        
        String noVovel = fullName.replaceAll("[AEUIOaeuio]", "*");
        
            System.out.println("Your name is like ["+ noVovel +"] that without vovel letters");
            
    //Used substring to show first three letter of users first name        
        String firstThree = userName.substring(0, 3);
        
            System.out.println("First three letter of your name is [" + firstThree+"]");
            
    //Just a simple comparision using endsWith. That manipulations answer is yes or no so thats why I choosed boolean     
        boolean endsWithN = userName.endsWith("N");
        
            System.out.println("Does your name ends with `N` ?"+endsWithN);
            
    //.length() manipulation shows us users first name length and result will be integer number so I used int        
        int nameLength = userName.length();
        
            System.out.println("Your first name length is "+nameLength);

    }
    
}
