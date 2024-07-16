package OOPS;

public class Inheritance {
    public static void main(String[] args) {

        Dog max = new Dog();
        max.eat();
        max.legs = 4;
        System.out.println(max.legs);
        max.breed = "German sherpherd";
        System.out.println(max.breed);

    }
}

// Types of inheritance

// This is single level inheritance

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

// This is actually multilevel inheritance
class Mammal extends Animal {

    int legs;

}

class Dog extends Mammal {
    String breed;

}

// Derived class / subclass
// class Fish extends Animal {
// int fins;

// void swim() {
// System.out.println("Swiming");
// }

// }
