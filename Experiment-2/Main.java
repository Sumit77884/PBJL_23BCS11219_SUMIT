// Create a Java program using abstraction to calculate the area of different shapes.
// Requirements:
// 1. Create an abstract class Shape with:
// ○ An abstract method double calculateArea()
// ○ A concrete method void display() that prints "This is a shape."
// 2. Create two concrete classes:
// ○ Circle with a radius and implementation for calculateArea()
// ○ Rectangle with length and width, and implementation for calculateArea()
// 3. In the main method:
// ○ Create one Circle and one Rectangle object using Shape reference
// ○ Call display() and calculateArea() for both


abstract class Shape {
    abstract double calculateArea();

    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        circle.display();
        System.out.println("Area of Circle: " + circle.calculateArea());

        Shape rectangle = new Rectangle(4, 6);
        rectangle.display();
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}


// Output:
// This is a shape.
// Area of Circle: 78.53981633974483
// This is a shape.
// Area of Rectangle: 24.0
