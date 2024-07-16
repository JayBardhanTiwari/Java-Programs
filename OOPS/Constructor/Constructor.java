package OOPS.Constructor;

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Jay Bardhan");
        System.out.println(s1.name);
        Car c1 = new Car();

    }
}

class Student {
    String name;
    int age;

    Student(String name) {
        this.name = name;

    }

}

// if you dont want to pass the value in constructor then

class Car {
    String name;
    int modelnumber;

    Car() {
        System.out.println("Constructor is called....");
    }
}
