
public class test {
    public static int count(String sb[]) {
        int maxCount = 0;
        for (int i = 0; i < sb.length; i++) {
            String str [] = sb[i].split(" ");
            int count = str.length; // Start count at 1 for the first word in the sentence
            
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
