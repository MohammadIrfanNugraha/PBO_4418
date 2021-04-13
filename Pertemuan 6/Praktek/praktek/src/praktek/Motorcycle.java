package praktek;

public class Motorcycle extends Motorvehicle{
    private int numGear = 0;

    public Motorcycle(){
    }

    public void setGearFoot(int numGear){
        this.numGear = numGear;
    }

    public int getGearFoot(){
        return numGear;
    }
}