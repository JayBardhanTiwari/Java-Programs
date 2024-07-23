package RecursionBasics.Questions;

public class Lengthofstring {
    public static int printlengthofString(String str, int i) {
        // better approach  O(n)
        // base case
        if (str.length() == i) {
            return i;
        }
        return printlengthofString(str, i + 1);

        // base case 0(n^2) because it is making a new string when
        // recursive fun call
        // if (str.length() == 0) {
        // return 0;
        // }
        // return printlengthofString(str.substring(1)) +1;
    }

    public static void main(String[] args) {
        String str = "jay";
        // System.out.println(printlengthofString(str, 0));
        System.out.println(printlengthofString(str, 1));
    }
}
