package OOPS;

public class Inheritance {
    public static void main(String[] args) {

        Fish whale = new Fish();
        whale.eat();
        whale.breathe();

    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("Eat");
    }

    void breathe() {
        System.out.println("breathing");
    }
}

class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swiming");
    }

}
