
package volumemenu;

/**
 *
 * @author sarahpark
 */
public class Cube extends Volume {
    private double volumeCube;

    public Cube(double side) {
        super(side);
        this.volumeCube = side * side * side;
    }
    
    public double getVolumeCube() {
        return this.volumeCube;
    }
    
    public void setVolumeCube(double side) {
        this.volumeCube = side * side * side;
    }
    
    
}
