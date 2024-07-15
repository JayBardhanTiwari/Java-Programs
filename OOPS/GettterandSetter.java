package OOPS;

public class GettterandSetter {
    public static void main(String[] args) {
        Bike p1 = new Bike();
        p1.setName("Honda");
        System.out.println(p1.getName());

        p1.setSpeed(120);
        System.out.println(p1.getSpeed());

        p1.setName("Ninja");
        System.out.println(p1.getName());
    }
}

// class
class Bike {
    // properties
    private String name;
    private int speed;

    // functions

    String getName() {
        return this.name;
    }

    int getSpeed() {
        return this.speed;

    }

    void setName(String newName) {
        name = newName;
    }

    void setSpeed(int speed) {
        this.speed = speed;

        // this.speed is refering the original speed and speed is actually is external
        // speed tht we are passing as argument outside
        // this keyword used mostly when we have same name of variables
    }
}
