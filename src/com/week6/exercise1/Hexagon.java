/*
1. Create an abstract class Shape, then create classes for Square, Rectangle, Diamond, Hexagon, Triangle
and Circle, which inherit Shape.
Each shape needs to be able to calculate its perimeter and area. (use multiple levels of inheritance)
 */

package exercise1;

public class Hexagon extends Shape {

    public double length;

    public Hexagon(double length) {
        this.length = length;
        System.out.println("\nThe hexagon has a length of " + length);
    }

    public void calculatePerimeter() {
        System.out.println("The perimeter is -> " + 6 * length);
    }

    public void calculateArea() {
        System.out.println("The area is -> " + (3 * Math.sqrt(3) * (length * length)) / 2);
    }
}
