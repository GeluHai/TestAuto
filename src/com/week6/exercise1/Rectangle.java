/*
1. Create an abstract class Shape, then create classes for Square, Rectangle, Diamond, Hexagon, Triangle
and Circle, which inherit Shape.
Each shape needs to be able to calculate its perimeter and area. (use multiple levels of inheritance)
 */

package exercise1;

public class Rectangle extends Shape {

    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("\nThe rectangle has a length of " + length + " and width of " + width);
    }

    public void calculatePerimeter() {
        System.out.println("The perimeter is -> " + 2 * (length + width));
    }

    public void calculateArea() {
        System.out.println("The area is -> " + length * width);
    }
}
