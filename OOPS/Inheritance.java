package OOPS;

public class Inheritance {
    public static void main(String[] args) {

        Dog max = new Dog();
        max.eat();
        max.legs = 4;
        System.out.println(max.legs);
        max.breed = "German sherpherd";
        System.out.println(max.breed);
        Bird peacock = new Bird();
        peacock.eat();
        peacock.fly();

    }
}

// Types of inheritance

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("Eat");
    }

    void breathe() {
        System.out.println("breathing");
    }
}

// Derived class / subclass
// This is single level inheritance

// class Fish extends Animal {
// int fins;
// void swim() {
// System.out.println("Swiming");
// }
// }

// This is actually multilevel inheritance
class Mammal extends Animal {

    int legs;

}

class Dog extends Mammal {
    String breed;

}

// This is Hierarchial inheritance
class Fish extends Animal {

    void swim() {
        System.out.println("Swim");
    }
}

class Bird extends Animal {

    void fly() {
        System.out.println("fly");
    }

}
