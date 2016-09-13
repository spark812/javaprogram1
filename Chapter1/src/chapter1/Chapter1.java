/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1;

/**
 *
 * @author sarahpark
 */
public class Chapter1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InchToMeterTable();
    }
    
    public static void Example() {
       System.out.println("Java drives the web");
   }
   
   public static void Example2() {
       int var1;
       int var2;
       
       var1 = 1024;
       
       System.out.println("var1 contains " + var1);
       
       var2 = var1 / 2;
       
       System.out.print("var2 contains var1/2: ");
       System.out.println(var2);
       
   }
   
   public static void Example3() {
       int w;
       double x;
       
       w = 10;
       x = 10.0;
       
       System.out.println("w is an int with value: " + w);
       System.out.println("x is a double with value: " + x);
       
       System.out.println("w/3: " + w/3);
       System.out.println("x/3: " + x/3);
   }
    
    public static void GalToLit() {
       double gallons;
       double liters;
       
       gallons = 10;
       liters = gallons * 3.7854;
       
       System.out.println(gallons + " gallons is " + liters +
               " liters.");
   }
   
   public static void WeightOnMoon() {
       double weightEarth = 120;
       double weightMoon = weightEarth * .17;
       
   }
    
   public static void SumFrom1to10() {
       int sum, i;
        sum = 0;
        
        for(i = 1; i <=10; i++) 
           sum = sum + i;
           System.out.println("The sum 1 + 2 + ... + 10 is " + sum);
   }
   
   public static void ForDemo() {
       int count;
       
       for(count = 0; count < 5; count++)
           System.out.println("This is count: " + count);
       
       System.out.println("Done!");
   }
   
   public static void GalToLitTable() {
       double gallons, liters;
       int counter;
       
       counter = 0;
       for(gallons = 1; gallons <=100; gallons++) {
           liters = gallons * 3.7854;
           System.out.println(gallons + " gallons is " + liters + 
                   " liters.");
           
           counter++;
           
           if(counter == 10) {
               System.out.println();
               counter = 0;
           }
       }
   }
   public static void InchToMeterTable() {
       double inch, meter;
       int counter;
       
       counter = 0;
       for(inch = 1; inch <=108; inch++) {
           meter = inch / 39.37;
           System.out.println(inch + " inch is " + meter + 
                   " meters.");
           
           counter++;
           
           if(counter == 12) {
               System.out.println();
               counter = 0;
           }
       }
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


    

