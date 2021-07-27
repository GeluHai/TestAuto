/*
3. Create a base class called Car. It should have a few fields that would be appropriate for a generic Car class
(as engine, cylinders, wheels etc.). Constructor should initialize cylinders (number of) and name
and set wheels to 4 and engine to true. Cylinders and names will be passed parameters.
Create appropriate getters. Create some methods like start engine, accelerate and brake.
Show a message for each in the base class. Now create 3 subclasses for your favorite vehicles.
Overwrite the appropriate methods to demonstrate polymorphism in use.
 */

package exercise3;

public class Test {

    public static void main(String[] args) {

        Car genericCar = new Car(8, "Brand name", "manual");

        Ford mustang = new Ford();
        mustang.startEngine();
        mustang.accelerate(200);
        mustang.brake(true);
        mustang.accelerate(100);
        mustang.brake(false);

        Vw golf = new Vw();
        golf.startEngine(true);
        golf.accelerate();
        golf.brake();
        golf.startEngine(false);
    }
}
