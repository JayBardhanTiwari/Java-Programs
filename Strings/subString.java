package Strings;

public class subString {
    public static String substring(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);

        }
        return substr;
    }

    public static void main(String[] args) {
        // Substring means consecutive parts of letters and adjacent letters

        String str = "hellowolrd";
        System.out.println(substring(str, 0, 4));

        // we have a inbuilt function for subString
        System.out.println(substring(str, 0, 5));
    }
}
