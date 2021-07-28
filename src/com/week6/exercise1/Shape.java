/*
1. Create an abstract class Shape, then create classes for Square, Rectangle, Diamond, Hexagon, Triangle
and Circle, which inherit Shape.
Each shape needs to be able to calculate its perimeter and area. (use multiple levels of inheritance)
 */

package exercise1;

public abstract class Shape {

    public abstract void calculatePerimeter();

    public abstract void calculateArea();
}