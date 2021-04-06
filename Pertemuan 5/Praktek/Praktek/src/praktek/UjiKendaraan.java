/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek;

public class UjiKendaraan {
    public static void main(String[] args) {
        vehicle vehicle1 = new vehicle();
        vehicle1.goStraight();
        vehicle1.turnLeft();
        vehicle1.turnRight();

        System.out.println();
        
        Bicycle bicycle1 = new Bicycle();
        bicycle1.goStraight();
        bicycle1.ringBell();
        
        System.out.println();
        
        Motorvehicle motor1 = new Motorvehicle();
        motor1.goStraight();
        System.out.println("Size of engine: " + motor1.getSizeOfEngine());
        System.out.println("Licence plate: " + motor1.getLicencePlate());
        
        System.out.println();

        Motorvehicle motor2 = new Motorvehicle(7,"E 1085 IF");
        motor2.goStraight();
        System.out.println("Size of engine: " + motor2.getSizeOfEngine());
        System.out.println("Licence plate: " + motor2.getLicencePlate());


    }
}