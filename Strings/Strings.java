package Strings;

import java.util.Scanner;

public class Strings {

    public static void printallLetter(String name) {
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Strings declaration

        String str = "Coding";

        String item = new String("BOX");

        // Strings are IMMUTABLE

        // Input and Output

        Scanner sc = new Scanner(System.in);
        String firstname = sc.next(); // single line
        System.out.println(firstname);

        String fullname = sc.nextLine();// multi line
        System.out.println(fullname);

        sc.close();

        // String length

        String object = "table";
        System.out.println(object.length());// used to count the length of the String

        // String Concatenation

        String yourname = "Tony";
        String yourlastname = "Stark";

        String yourfullName = yourname + " " + yourlastname;
        System.out.println(yourfullName);

        // String charAt method used to any character in String

        System.out.println(yourfullName.charAt(0));

        String name = "Jay Bardhan Tiwari";
        printallLetter(name);
    }
}
