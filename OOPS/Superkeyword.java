package OOPS;

public class Superkeyword {
    public static void main(String[] args) {

        Cricket ck = new Cricket();
        System.out.println(ck.name);
    }
}

class Sports {
    String name;

    Sports() {
        System.out.println("Sports constructor is calling...");
    }

}

class Cricket extends Sports {

    Cricket() {
        super();// calling animal class constructor
        super.name = " India";// accessing the immediate parent class properties
        System.out.println("Cricket constructor is calling...");
    }

}
