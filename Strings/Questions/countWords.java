package Strings.Questions;

public class countWords {
    public static int count(String sb[]) {
        int max = 0;
        for (int i = 0; i < sb.length; i++) {
            String str = sb[i];
            int count = 1;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ' ') {
                    count++;
                }

            }
            if (max < count) {
                max = count;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        String sb[] = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };
        System.out.println(count(sb));
    }
}
