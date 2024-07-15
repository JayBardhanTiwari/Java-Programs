package OOPS;

public class Classandobjects {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setColor("blue"); // created a pen object called p1
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        p1.setColor("black");
        System.out.println(p1.color);
    }
}

// class
class pen {
    // properties
    String color;
    int tip;

    // functions
    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}
