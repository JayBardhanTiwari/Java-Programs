
public class test {
    public static int count(String sb[]) {
        int maxCount = 0;
        for (int i = 0; i < sb.length; i++) {
            String str = sb[i];
            int count = 1; // Start count at 1 for the first word in the sentence
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ' ') {
                    count++;
                }
            }
            if (maxCount < count) {
                maxCount = count;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        String sb[] = {"please wait", "continue to fight", "continue to win"};
        System.out.println(count(sb)); // This should output 4
    }
}
