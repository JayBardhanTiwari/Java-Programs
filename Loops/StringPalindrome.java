package Loops;

// Main class
public class StringPalindrome {

    // Main driver method
    public static void main(String args[]) {
        // 012345
        String name = "frank";
        String str = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            char a = name.charAt(i);
       
            str = str + a;

        }
        //System.out.println(str);
        //System.out.println(name);
        if (name.equals(str)) {
            System.out.println("its palindrome");
        } else {
            System.out.println("not");
        }
    }

}
