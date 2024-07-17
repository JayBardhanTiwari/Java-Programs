public class Test {
    public static void main(String[] args) {

        Human hm = new Human();
        hm.walk();
        hm.selfish();
        hm.eat();

    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eating");
    }

    void breath() {
        System.out.println("breathing");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swiming");
    }

}

class Bird extends Animal {
    void fly() {
        System.out.println("flying");
    }

}

class Mammals extends Animal {
    void walk() {
        System.out.println("walking");
    }

}

class Tuna extends Fish {

}

class Shark extends Fish {

}

class Peacock extends Bird {
    void dance() {
        System.out.println("dancing in rain");
    }
}

class Dog extends Mammals {
    void bark() {
        System.out.println("barking");
    }
}

class Cat extends Mammals {
    void meow() {
        System.out.println("mewoing");
    }
}

class Human extends Mammals {
    void selfish() {
        System.out.println("selfish as fuck");
    }
}