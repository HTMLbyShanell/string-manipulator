/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmanipulator;

import java.util.Scanner;

/**
 *
 * @author Shanell Spann
 */
public class favorite {
    String city;
    Scanner keyboard = new Scanner(System.in);
    
    public void userInput()
    {
      System.out.println("What is your favorite city?");
      city = keyboard.nextLine();
    }
    
    public void manipulateText()
    {
        int stringSize = city.length();
        String upper = city.toUpperCase();
        String lower = city.toLowerCase();
        char letter = city.charAt(0);
    
        System.out.println("\nYour favorite city is : " + city);
        System.out.println("The number of characters in " + city + " = " + stringSize);
        System.out.println("Your favorite city in uppercase letters is: " + upper);
        System.out.println("Your favorite city in lowercase letters is: " + lower);
        System.out.println("The first letter in your favorite city name is: " + letter);
    }  
}

/*/** I struggled with running this program successfully because of a variable placement error.
* Originally, I housed all of my variables in my favorite class. I realized that the
* compiler was unable to run the program with my text manipulation variables before the
* variable was initialized by the user input. By reading page 76 of the book, I figured it out.
* /*/
