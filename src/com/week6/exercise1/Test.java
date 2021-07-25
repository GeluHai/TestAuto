/*
1. Create an abstract class Shape, then create classes for Square, Rectangle, Diamond, Hexagon, Triangle
and Circle, which inherit Shape.
Each shape needs to be able to calculate its perimeter and area. (use multiple levels of inheritance)
 */

package exercise1;

public class Test {
    public static void main(String[] args) {

        double length = 5;
        double width = 7;

        double sideA = 3;
        double sideB = 3;
        double sideC = 5;

        double radius = 5;



        //square
        Shape square = new Square(length);
        square.calculatePerimeter();
        square.calculateArea();

        //rectangle
        Shape rectangle = new Rectangle(length, width);
        rectangle.calculatePerimeter();
        rectangle.calculateArea();

        //diamond
        Shape diamond = new Diamond(length);
        diamond.calculatePerimeter();
        diamond.calculateArea();

        //hexagon
        Shape hexagon = new Hexagon(length);
        hexagon.calculatePerimeter();
        hexagon.calculateArea();

        //triangle
        Shape triangle = new Triangle(sideA, sideB, sideC);
        triangle.calculatePerimeter();
        triangle.calculateArea();

        //circle
        Shape circle = new Circle(radius);
        circle.calculatePerimeter();
        circle.calculateArea();
    }
}