/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volumemenu;

import java.util.Scanner;


/**
 *
 * @author sarahpark
 */
public class VolumeMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int choice;
        double diameter, side;
        
        
        do {
            System.out.print("\n\n**Choose a 3D Shape to Calculate Volume **\n "
                    + " 1. Sphere\n  2. Cube \n  3. Cone\n  4. Exit\n");
            System.out.print("\nEnter your choice (1-4): ");
            choice = in.nextInt();
            
            switch(choice) {
                case 1:
                    System.out.print("\n    You chose sphere!");
                    System.out.print("\n    Please enter the diameter of your "
                            + "sphere: ");
                    diameter = in.nextDouble();
                    System.out.print("\n    The sphere with radius " +
                            diameter / 2 + " has a volume of " +
                            sphereVolume(diameter));
                    break;
                case 2:
                    System.out.print("\n    You chose cube!");
                    System.out.print("\n    Please enter the side of your "
                            + "cube: ");
                    side = in.nextDouble();
                    System.out.print("\n    The cube with radius " + side 
                            + " has a volume of " + cubeVolume(side));
                    break;
                case 3:
                    System.out.print("\n    You chose cone!");
                    System.out.print("\n    Please enter the diameter of your "
                            + "cone: ");
                    diameter = in.nextDouble();
                    System.out.print("\n    Please enter the height of your "
                            + "cone: ");
                    side = in.nextDouble();
                    System.out.print("\n    The cone with radius " + 
                            diameter / 2 + " and height of " + side
                            + " has a volume of " + coneVolume(diameter, side));
                    break;
                case 4:
                    System.out.println("see you later");
                    break;
                default:
                    System.out.println("Wrong option. Try again.");         
            }
            
        } while (choice != 4);
        
    }

    public static double sphereVolume(double diameter) {
        Sphere s = new Sphere(diameter);
        return s.getVolumeSphere();
    }
    
    public static double cubeVolume(double side) {
        Cube c = new Cube(side);
        return c.getVolumeCube();
    }
    
    public static double coneVolume(double diameter, double side) {
        Cone c = new Cone(diameter, side);
        return c.getConeVolume();
    }
}
