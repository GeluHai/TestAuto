/*
3. Create a base class called Car. It should have a few fields that would be appropriate for a generic Car class
(as engine, cylinders, wheels etc.). Constructor should initialize cylinders (number of) and name
and set wheels to 4 and engine to true. Cylinders and names will be passed parameters.
Create appropriate getters. Create some methods like start engine, accelerate and brake.
Show a message for each in the base class. Now create 3 subclasses for your favorite vehicles.
Overwrite the appropriate methods to demonstrate polymorphism in use.
 */

package exercise3;

public class Ford extends Car {

    private boolean engine;
    private int cylinders;
    private int power;
    private int wheels;
    private String wheelName;
    private int doors;
    private String transmission;


    public Ford() {
        this.cylinders = 16;
        this.wheelName = "Ford Brand Name Wheel";
        this.engine = true;
        this.wheels = 4;
        this.doors = 3;
        this.power = 200;
        this.transmission = "Automatic";

        System.out.println("\nA FORD car was created with:");
        System.out.println("Engine: " + this.engine);
        System.out.println("Cylinders: " + this.cylinders);
        System.out.println("Number of wheels: " + this.wheels);
        System.out.println("Wheel brand: " + this.wheelName);
        System.out.println("Number of doors: " + this.doors);
        System.out.println("Power: " + this.power + "HP");
        System.out.println("With a " + this.transmission + " transmission");
    }


    public void startEngine() {
        System.out.println("The Ford engine has started");
    }

    public void accelerate(int toAccelerateBy) {
        System.out.println("The Ford car accelerated to " + toAccelerateBy);
    }

    public void brake(boolean areYouSure) {
        if(areYouSure==true)
            System.out.println("The Ford car has stopped");
        else
            System.out.println("If you are not sure the car will keep going");
    }
}
