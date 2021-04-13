package praktek;

public class car extends Motorvehicle {
    private boolean setBelt = false;
    
    public car(){}

    public void setSeatBelt(int seatBelt) {
        if(seatBelt == 1){
            this.setBelt = true;
        } else if(seatBelt == 0){
            this.setBelt = false;
        }
    }

    public boolean getSeatBelt() {
        return setBelt;
    }
}