/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmanipulator;


/**
 *
  * @author Shanell A Spann
 * Course: IT-DEV 140  Programming with JAVA
 * Assignment 2
 * Date:  09/26/2020
 * 
 * Description:  This assignment is to complete programming challenges in the
 * Chapter #2 book of "Starting with JAVA, From Control Structures through Objects".
 * ISBN-13 # 978-0-13-480221-3. This program is Programming Challenge # 12: String Manipulator. 
 * We are to ask a user to enter the name of their favorite city & display the following:
 * number of characters in city name, all uppercase, all lowercase, & first character of entry. 
 * 
 */
public class StringManipulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\t ♥ Chapter 2 - Programming Challenge #12: String Manipulator ♥ \n");
        
        favorite f = new favorite();
        f.userInput();
        f.manipulateText();
        
    }   
}
