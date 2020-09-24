package sample;

public class Car extends Vehicle implements Tracker{

    //constructors


    //field variables
    private String carDealership;
    private double mileage;


    //getters and setters
    public String getCarDealership() {
        return carDealership;
    }

    public void setCarDealership(String carDealership) {
        this.carDealership = carDealership;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }


    //implementing interface Tracker methods
    @Override
    public double calculateFuelCost() {
        return 0;
    }

    @Override
    public double calculateMaintenanceCost() {
        return 0;
    }
}
