/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek;

public class Motorvehicle extends vehicle {
    int sizeOfEngine = 1;
    String licencePlate = "F 4 ND";

    public Motorvehicle(){}
    
    public Motorvehicle(int sizeEng, String lcPlate){
        this.sizeOfEngine = sizeEng;
        this.licencePlate = lcPlate;
    }

    public int getSizeOfEngine(){
        return this.sizeOfEngine;
    }

    public String getLicencePlate(){
        return this.licencePlate;
    }

}