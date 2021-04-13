import praktek.*;

public class ujikendaraan {
    public static void kendaraanMelaju(vehicle vehicle){
        vehicle.goStraight();
    }

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


        Motorcycle motor3 = new Motorcycle();
        motor3.setGearFoot(7);
        System.out.println("Gear of motor3: " + motor3.getGearFoot());
        
        System.out.println();

        car motor4 = new car();
        motor4.setSeatBelt(0);
        System.out.println("Use sealbelt: " + motor4.getSeatBelt());
        motor4.setSeatBelt(1);
        System.out.println("Use sealbelt: " + motor4.getSeatBelt());
        
        System.out.println();
        kendaraanMelaju(new vehicle());
        kendaraanMelaju(new Bicycle());
        kendaraanMelaju(new Motorvehicle());
    }
}