package OOPS.Constructor;

public class TypesofConstructor {
    public static void main(String[] args) {
        Collegestudent s1 = new Collegestudent();
        s1.name = "jay";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Collegestudent s2 = new Collegestudent("Jay bardhan");
        Collegestudent s3 = new Collegestudent(123);

        // Copy constructor
        Collegestudent s4 = new Collegestudent(s1);
        s4.password = "xyz";
        s4.name = "vijay";
        System.out.println(s4.name);
        s1.marks[2] = 100;

        for (int i = 0; i < 3; i++) {
            System.out.println(s4.marks[i]);
        }

    }
}

// Types of Constructor
/*
 * 1.Non parameter
 * 2.With parameter
 * 3.Copy parameter
 */

class Collegestudent {
    String name;
    int roll;
    String password;
    int marks[];

    // copy constructor consists actually two types of copying constructor

    // this is Shallow copy constructor
    // Collegestudent(Collegestudent s1) {
    // marks = new int[3];
    // this.name = s1.name;
    // this.roll = s1.roll;
    // this.marks = s1.marks;

    // }

    // this one is Deep copy constructor
    Collegestudent(Collegestudent s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    // Non parameter
    Collegestudent() {
        marks = new int[3];
        System.out.println("Constructor is calling....");
    }

    // With parameter
    Collegestudent(String name) {
        marks = new int[3];
        this.name = name;
    }

    Collegestudent(int roll) {
        marks = new int[3];
        this.roll = roll;
    }

}