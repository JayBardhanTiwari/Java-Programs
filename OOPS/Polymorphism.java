package OOPS;

public class Polymorphism {
    public static void main(String[] args) {

        // polymorphism
        //It consists two types 
        // 1. Complie time polymorphism 
        // which is method overloading

        //2. Run time polymorphism
        // which is method overriding

        Calculator calc = new Calculator();
        System.out.println(calc.sum(4, 6));
        System.out.println(calc.sum(2.1f, 3.5f));
        System.out.println(calc.sum(4, 6, 8));

    }
}

// This is Compile Time polymorphism
//Method overloading

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
