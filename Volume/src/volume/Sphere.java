/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volume;

/**
 *
 * @author sarahpark
 */
public class Sphere {
    private double radius;
    private double volumeSphere;
    
    
    
    
     public double getRadius() {
        return radius;
     }
     
     public void setRadius(double r) {
         if (radius < 0) {
             System.out.print(r + " is not allowed. Enter again");
         }
         radius = r;
     }
     
     public double getVolumeSphere() {
         return volumeSphere;
     }
     
     public void setVolumeSphere(double r) {
         
     }
}
