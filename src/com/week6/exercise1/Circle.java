package exercise1;

public class Circle extends Shape {

    public double radius;

    public Circle(double radius) {
        this.radius = radius;
        System.out.println("\nThe circle has the following radius " + radius);
    }

    public void calculatePerimeter() {
        System.out.println("The perimeter is -> " + 2 * Math.PI * radius);
    }

    public void calculateArea() {
        System.out.println("The area is -> " + Math.PI * Math.pow(radius, 2));
    }
}
