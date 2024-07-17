package OOPS;

public class Polymorphism {
    public static void main(String[] args) {

        // Polymorphism
        // It consists two types

        // 1. Complie time polymorphism
        // which is method overloading

        Calculator calc = new Calculator();
        System.out.println(calc.sum(4, 6));
        System.out.println(calc.sum(2.1f, 3.5f));
        System.out.println(calc.sum(4, 6, 8));

        // 2. Run time polymorphism
        // which is method overriding

        Fps f = new Fps();
        f.shoot();

    }
}

// This is Compile Time polymorphism
// Method overloading

class Calculator {

    int sum(int a, int b) {
        return a + b;

    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

// This is Run time polymorphism
// Method overriding

class Games {
    void shoot() {
        System.out.println("Shooting in games");
    }
}

class Fps extends Games {
    void shoot() {
        System.out.println("Shooting in Fps mode");
    }
}