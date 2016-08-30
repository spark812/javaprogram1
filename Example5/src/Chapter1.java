/*
 * Chapter 1 demo
 * Pages 18, 23, 25, 27, 29(if demo), 31 (for loop), 35
 */


/**
 *
 * @author sarahpark
 */
public class Chapter1 {

   public static void main(String[] args) {
       Example1();
       Example2();
        
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

