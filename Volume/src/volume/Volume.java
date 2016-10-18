/*
 * CIS36A Introduction to Java
 * Sarah Park
 */
package volume;
import java.util.Scanner;
/**
 *
 * @author sarahpark
 */
abstract class Volume {
    private double volume;

    Volume() {
        volume = 0;
    }
    
    public double getVolume() {
    return volume;
    }
    
    public void setVolume(double v) {
        volume = v;
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice;
        Scanner in = new Scanner(System.in);
        
        do {
            System.out.print("\n\n**Choose a 3D Shape to Calculate Volume ** /n "
                    + "  1. Sphere\n  2. Cube \n  3. Cone\n  4. Exit\n");
            System.out.print("\nEnter your choice (1-4): ");
            choice = in.nextInt();
            
            switch(choice) {
                case 1:
                    System.out.print("\n    You chose sphere!");
                    //Sphere
                    break;
                case 2:
                    //Cube
                    break;
                case 3:
                    //cone
                    break;
                case 4:
                    System.out.println("see you later");
                    break;
                default:
                    System.out.println("Wrong option. Try again.");
                          
            }
            
        } while (choice != 4);
        
        
    }
    
}
