// Create a Java program that demonstrates inheritance and interfaces.
// Requirements:
// 1. 2. 3. 4. Create an interface Drivable with a method void drive().
// Create a parent class Vehicle with brand and speed, a constructor, and a move() method.
// Create a child class Car that:
// ○ Inherits from Vehicle
// ○ Implements Drivable
// ○ Has a seats property, a constructor, and a display() method
// ○ Implements the drive() method
// In main, create a Car object and call move(), drive(), and display().

interface Drivable {
    void drive();
}

class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void move() {
        System.out.println(brand + " is moving at " + speed + " km/h.");
    }
}

class Car extends Vehicle implements Drivable {
    int seats;

    Car(String brand, int speed, int seats) {
        super(brand, speed);
        this.seats = seats;
    }

    public void drive() {
        System.out.println("The car is being driven safely.");
    }

    void display() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Seats: " + seats);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 120, 5);
        myCar.move();
        myCar.drive();
        myCar.display();
    }
}
