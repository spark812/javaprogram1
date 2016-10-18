/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloaddemo;

/**
 *
 * @author sarahpark
 */

class Overload {
    void ovlDemo() {
        System.out.println("no parameters");
    }
    
    void ovlDemo(int a) {
        System.out.println("One parameter: " + a);
    }
    
    int ovlDemo(int a, int b) {
        System.out.println("Two parameters: " + a + " " + b);
        return a + b;
    }
    
    double ovlDemo(double a, double b) {
        System.out.println("Two double paremeters: " + a + " " + b);
        return a + b;
    }
}
public class OverloadDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
