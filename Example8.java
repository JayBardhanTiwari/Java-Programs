// import java.util.Scanner;

public class Example8 {
    public static boolean checkPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            //racecar
            // n - i- 1

            // i = 0
            //r == r
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }

        }
        return true;
        // pali.charAt(i) = pali.charAt(n-i-1);
    }

    public static void main(String[] args) {
        String str = "radecar";
        System.out.println(checkPalindrome(str));
        // Strings
        // "absc "
        // decalration
        // // 1.
        // String str = "yuvi";
        // //2.
        // String str1 = new String("abc");
        // // // immutable
        // // String name = "Yuraj";
        // name.concat("gamer");

        // System.out.println(name);

        // //input
        // System.out.println("enter your name");
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();

        // System.out.println("enter your age");
        // int age = sc.nextInt();
        // System.out.println("your name is "+ name );
        // System.out.println( "your age is " + age);
        // //1234xyz@#
        // String pali = "maam";
        // int n = pali.length();

        // System.out.println();

        // palindrome
        // 121 1441
        // maam
        // racecar/2
        // length = 7/2 = 3

    }
}
