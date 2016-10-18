/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6;

/**
 *
 * @author sarahpark
 */
public class Chapter6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [][] numbers = {
            { "Tom", "555-1234"},
            { "Mary", "555-1235"},
            { "Jon", "555-1037"},
            { "Rachel", "555-1400"}
        };
        int i;
        
        if(args.length != 1) 
            System.out.println("Usage: java Phone <name>");
        else {
            for(i=0; i<numbers.length; i++) {
                if(numbers[i][0].equals(args[0])){
                    System.out.println(numbers[i][0] + ": " +
                            numbers[i][1]);
                    break;
                }
            }
            if (i==numbers.length)
                System.out.println("Name not found");
        }
    }
    
}
