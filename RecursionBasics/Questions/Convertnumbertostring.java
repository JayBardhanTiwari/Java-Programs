package RecursionBasics.Questions;

public class Convertnumbertostring {
    public static void numbertoString(int n) {
        // base case

        if (n == 0) {
            return;

        }
        String words[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        int lastDigit = n % 10;
        numbertoString(n / 10);
        System.out.print(words[lastDigit] + " ");

    }

    public static void main(String[] args) {
        int n = 2014;
        numbertoString(n);
        System.out.println();
    }
}
