/*
1. Create an abstract class Shape, then create classes for Square, Rectangle, Diamond, Hexagon, Triangle
and Circle, which inherit Shape.
Each shape needs to be able to calculate its perimeter and area. (use multiple levels of inheritance)
 */

package exercise1;

public class Diamond extends Shape {

    public double length;

    public Diamond(double length) {
        this.length = length;
        System.out.println("\nThe diamond has a length of " + length);
    }

    public void calculatePerimeter() {
        System.out.println("The perimeter is -> " + 4 * length);
    }

    public void calculateArea() {
        System.out.println("The area is -> " + length * length);
    }
}
