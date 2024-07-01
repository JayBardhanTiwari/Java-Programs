package Strings.Questions;

public class PermutationdiffbtwTwoString {
    public static int findPermutationDifference(String s, String t) {
        int sub = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    sub += Math.abs(i - j);

                }
            }
        }
        return sub;
    }

    public static int optimizedfunction(String s, String t) {
        int totaldiff = 0;
        // just do with a single loop with the help of index of func which return int
        // value of a char
        for (int i = 0; i < s.length(); i++) {
            totaldiff += Math.abs(i - t.indexOf(s.charAt(i)));

        }
        return totaldiff;
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "bac";
        System.out.println(findPermutationDifference(s, t));
        System.out.println(optimizedfunction(s, t));
    }
}
