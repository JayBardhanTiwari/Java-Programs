package RecursionBasics;

public class RemoveDuplicateinstring {
    public static void removeDuplicate(String str, StringBuilder sb, int idx, boolean map[]) {
        // base case
        if (idx == str.length()) {
            System.out.println(sb);
            return;

        }
        // kaam / computation
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {

            // inner func() call
            removeDuplicate(str, sb, idx + 1, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicate(str, sb.append(currChar), idx + 1, map);
        }
    }

    public static void main(String[] args) {
        String str = "appnacollege";
        removeDuplicate(str, new StringBuilder(""), 0, new boolean[26]);

    }
}
