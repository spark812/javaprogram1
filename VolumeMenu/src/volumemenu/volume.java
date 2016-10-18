/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volumemenu;

abstract class Volume {
    private double volume, width, depth, height;
    

    Volume() {
        this.width = 0.0;
        this.depth = 0.0;
        this.height = 0.0;
        this.volume = 0.0;
    }
    
    Volume(double x) {
        this.width = this.depth = this.height = x;
    }

    Volume(double x, double z) {
        this.width = this.depth = x;
        this.height = z;
    }

    public Volume(double x, double y, double z) {
        this.width = x;
        this.depth = y;
        this.height = z;
    }


}
