/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;

import java.io.IOException;

/**
 *
 * @author sarahpark
 */
public class Chapter3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    throws java.io.IOException {
        
        
        char ch;
        System.out.print("Press any key followed by ENTER: ");
        
        ch = (char)System.in.read();
        System.out.print("your character is: " + ch);
        
    }
    
    
}
