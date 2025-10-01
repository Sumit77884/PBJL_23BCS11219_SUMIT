// Write a Java program to demonstrate method overriding and runtime polymorphism.
// Requirements:
// 1. Create a parent class Animal with a method void sound() that prints a generic message.
// 2. Create two child classes:
// ○ Dog – override sound() to print "Dog barks: Woof!"
// ○ Cat – override sound() to print "Cat meows: Meow!"
// 3. In the main method:
// ○ Create objects of Dog and Cat using Animal references
// ○ Call the sound() method for both

class Animal {
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks: Woof!");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows: Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();
        a2.sound();
    }
}


// output
// Dog barks: Woof!
// Cat meows: Meow!
