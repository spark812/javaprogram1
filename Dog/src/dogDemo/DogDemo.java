/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogDemo;

/**
 *
 * @author sarahpark
 */
class Dog {
    double weight; // weight in pounds
    double height; // height in inches
    double longevity; // lifespan in years
    String name;
    
    void calcBMI(String name) {
        System.out.println(name +  " has a bmi of " + weight / height);
    }
}



public class DogDemo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog dalmation = new Dog();
        Dog bostonTerrier = new Dog();
        Dog goldenRetriever = new Dog();
                
        bostonTerrier.weight = 10;
        bostonTerrier.height = 12;
        bostonTerrier.longevity = 10.4;
        bostonTerrier.name = "Bean";
        
        dalmation.weight = 60;
        dalmation.height = 60.5;
        dalmation.longevity = 5.7;
        dalmation.name = "Spot";
        
        goldenRetriever.weight = 86.9;
        goldenRetriever.height = 37;
        goldenRetriever.longevity = 78/12.;
        goldenRetriever.name = "Buddy";
        
        bostonTerrier.calcBMI(bostonTerrier.name);
        
        dalmation.calcBMI(dalmation.name);
        
        goldenRetriever.calcBMI(goldenRetriever.name);
        
        
    }
}


