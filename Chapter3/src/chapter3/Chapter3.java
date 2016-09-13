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
     * 
     */
    public static void main(String[] args) { 
    
           
    }
    
    public static void SqrRoot() {
    double num, sroot; 
    
    for(num = 1.0; num < 100.0; num++) {
        sroot = Math.sqrt(num);
        System.out.println("Square root of " + num + " is " + sroot);
    }
}
    
    
}
