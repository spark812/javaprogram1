/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example5;

/**
 *
 * @author sarahpark
 */
public class Example5 {

   public static void main(String[] args) {
        PrintSquares();
        
    }
    
   public static void SumFrom1to10() {
       int sum, i;
        sum = 0;
        
        for(i = 1; i <=10; i++) 
           sum = sum + i;
           System.out.println("The sum 1 + 2 + ... + 10 is " + sum);
   }
   
   public static void ConvertFtoC() {
       double fTemp, cTemp;
       
       fTemp = 62.0;
       cTemp = (fTemp - 32) * 5.0/9.0;
       System.out.println(fTemp + " degrees Fahrenheit is " 
               + cTemp + " degrees Celsius");
   }
 
   public static void PrintSquares() {
       int result, i;
       result = 1;
       
       for(i = 1; i <= 20; i++) {
           result = i * i;
           System.out.println(result);
       }
   } 
   
}

