package Loops;

public class CodePointAtExample {
    public static void main(String[] args) {
        // String myStr = "abcdefghijklmnopqrstuvwxyz";
        String myStr = "ABCDEFGHIJKLMANO";
        for (int i = 0; i < myStr.length(); i++) {
            int result = myStr.codePointAt(i);
            System.out.println(result);
        }
        

    }
}
