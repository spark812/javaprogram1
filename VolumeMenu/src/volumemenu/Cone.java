/*
 * sarah Park
 */
package volumemenu;


public class Cone extends Volume {
    private double radius;
    private double volumeCone;
  
    
    Cone(double d, double h){
        super(d, h);
        this.radius = 0.5 * d;
        this.volumeCone = 1.0/3.0 * Math.PI * h * Math.pow(radius, 2);
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public void setRadius(double r) {
        this.radius = r;
    }
    public double getConeVolume(){
        return this.volumeCone;
    }
    
    public void setConeVolume(double r, double h) {
        this.volumeCone = 1/3 * Math.PI * h * Math.pow(r, 2);
    }
    
}
