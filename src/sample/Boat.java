package sample;

public class Boat extends Vehicle implements Tracker {

    //Tracker methods
    @Override
    public double calculateFuelCost() {
        return 0;
    }

    @Override
    public double calculateMaintenanceCost() {
        return 0;
    }

    //field variables
    private String boatSlip;
    private int capacity;

    //getters and setters
    public String getBoatSlip() {
        return boatSlip;
    }

    public void setBoatSlip(String boatSlip) {
        this.boatSlip = boatSlip;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
