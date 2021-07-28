/*
1. Create an abstract class Shape, then create classes for Square, Rectangle, Diamond, Hexagon, Triangle
and Circle, which inherit Shape.
Each shape needs to be able to calculate its perimeter and area. (use multiple levels of inheritance)
 */

package exercise1;

public class Triangle extends Shape {

    public double sideA;
    public double sideB;
    public double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        System.out.println("\nThe triangle has the following sides " + sideA + ", " + sideB + ", " + sideC);
    }

    public void calculatePerimeter() {
        System.out.println("The perimeter is -> " + (sideA+sideB+sideC));
    }

    public void calculateArea() {
        double s = (sideA + sideB + sideC) / 2;
        System.out.println("The area is -> " + Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)));
    }
}

