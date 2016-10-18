/*
 * Sarah Park
 */
package volumemenu;

public class Sphere extends Volume {
    private double radius;
    private double volumeSphere;

    Sphere(double d) {
        super(d);
        this.radius = .5 * d;
        
        volumeSphere = 4.0/3.0 * Math.PI * Math.pow(this.radius, 3.0);
    }
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double r) {
        this.radius = r;
    }
     
     public double getVolumeSphere() {
         return volumeSphere;
     }
     
     public void setVolumeSphere(double r) {
         volumeSphere = 4/3 * Math.PI * Math.pow(r, 3.0);
     }
}
