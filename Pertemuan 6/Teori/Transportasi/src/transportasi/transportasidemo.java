/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import transportasi.bicycle;
import transportasi.mobil;
/**
 *
 * @author Mohammad Irfan Nugraha
 */
public class transportasidemo {
    public static void main(String[] args){
        bicycle bike1 = new bicycle();
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates(); 
        
        mobil car1 = new mobil("Hitam", 2001);
        car1.getwarna();
        car1.gettahun();
        
        System.out.println("Warna Mobil : "+car1.getwarna());
        System.out.println("Thun Mobil : "+car1.gettahun());
        
    }


}