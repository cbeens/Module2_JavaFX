package sample;

import java.util.Random;

public class Vehicle {

    //field variables
    private String name;
    private int builtYear;
    private String owner;

    //private array variable that can hold 4 integers
    private int[] arr = new int[4];

    //Constructors
    public Vehicle() {
    }

    public Vehicle(String name, int builtYear) {
        this.name = name;
        this.builtYear = builtYear;
    }

    public Vehicle(String name, int builtYear,String owner) {
        this.name = name;
        this.builtYear = builtYear;
        this.owner = owner;
    }


    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBuiltYear() {
        return builtYear;
    }

    public void setBuiltYear(int builtYear) {
        this.builtYear = builtYear;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


    //methods
    public void changeVehicle(String newName, int newYear) {
        this.name = newName;
        this.builtYear = newYear;
    }

    public void arrayMethod() {
        //fill the array
        for (int i = 0; i < 4; i++){
            Random rand = new Random();
            arr[i] = rand.nextInt();
        }
        //print the array
        for (int i = 0; i < 4; i++){
            System.out.println(arr[i]);
        }

    }
}
