/*
3. Create a base class called Car. It should have a few fields that would be appropriate for a generic Car class
(as engine, cylinders, wheels etc.). Constructor should initialize cylinders (number of) and name
and set wheels to 4 and engine to true. Cylinders and names will be passed parameters.
Create appropriate getters. Create some methods like start engine, accelerate and brake.
Show a message for each in the base class. Now create 3 subclasses for your favorite vehicles.
Overwrite the appropriate methods to demonstrate polymorphism in use.
 */

package exercise3;

public class Car {

    private boolean engine;
    private int cylinders;
    private int power;
    private int wheels;
    private String wheelName;
    private int doors;
    private String transmission;

    public Car(int cylinders, String wheelName, String transmission) {
        this.cylinders = cylinders;
        this.wheelName = wheelName;
        this.engine = true;
        this.wheels = 4;
        this.doors = 5;
        this.power = 200;
        this.transmission = transmission;

        System.out.println("\nA generic car was created with:");
        System.out.println("Engine: " + this.engine);
        System.out.println("Cylinders: " + this.cylinders);
        System.out.println("Number of wheels: " + this.wheels);
        System.out.println("Wheel brand: " + this.wheelName);
        System.out.println("Number of doors: " + this.doors);
        System.out.println("Power: " + this.power + "HP");
        System.out.println("With a " + this.transmission + " transmission");
    }

    public Car() {
    }


    public boolean getEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getPower() {
        return power;
    }

    public int getWheels() {
        return wheels;
    }

    public String getWheelName() {
        return wheelName;
    }

    public int getDoors() {
        return doors;
    }

    public String getTransmission() {
        return transmission;
    }


    public void setEngine(boolean newEngine) {
        engine = newEngine;
    }

    public void setCylinders(int newCylinders) {
        cylinders = newCylinders;
    }

    public void setPower(int newPower) {
        power = newPower;
    }

    public void setWheels(int newWheels) {
        wheels = newWheels;
    }

    public void setWheelName(String newWheelName) {
        wheelName = newWheelName;
    }

    public void setDoors(int newDoors) {
        doors = newDoors;
    }

    public void setTransmission(String newTransmission) {
        transmission = newTransmission;
    }


    public void startEngine() {
        System.out.println("\nThe engine has started");
        System.out.println("\n");
    }

    public void accelerate() {
        System.out.println("\nThe car accelerated to light speed");
        System.out.println("\n");
    }

    public void brake() {
        System.out.println("\nThe car has stopped");
        System.out.println("\n");
    }
}
