package If_Else;
public class Palindrome {

    public static void main(String[] args) {

        int palin = 121;
        int original = palin;
        int reverse = 0;

        while (palin > 0) {
            int rem = palin % 10;
            reverse = reverse * 10 + rem;
            palin = palin / 10;

        }
        System.out.println(palin);
        System.out.println(reverse);
        if (original == reverse) {
            System.out.println("is palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

}
