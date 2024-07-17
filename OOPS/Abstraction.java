package OOPS;

public class Abstraction {

    // Abstraction
    // To implement abstraction it consists two ways
    // 1.Abstract classes
    // 2.Interfaces
    public static void main(String[] args) {
        Horse h = new Horse();

        h.changeColor();
        System.out.println(h.color);
        // h.eat();
        // h.walk();

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

        Mustang myHorse = new Mustang();
        // this is the hierarchical way the constructor is
        // called when Mustang object is create
        // Animal -> Horse -> Mustang

    }
}

// Abstract class
abstract class Animals {

    String color;

    void eat() {
        System.out.println("animal is eating");
    }

    // Abstract method
    abstract void walk();

    // Abstract class have Constructor even though
    // we cant make objects in abstract classes

    Animals() {
        // color = " browmn";
        System.out.println("Animals constructor is calling...");
    }
}

class Horse extends Animals {

    Horse() {
        System.out.println("Horse constructor is calling...");
    }

    void changeColor() {
        color = " dark browmn";

    }

    void walk() {
        System.out.println("Walking with 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor is calling...");
    }
}

class Chicken extends Animals {

    void changeColor() {
        color = " yellow";
    }

    void walk() {
        System.out.println("Walking with 2 legs ");
    }

}
