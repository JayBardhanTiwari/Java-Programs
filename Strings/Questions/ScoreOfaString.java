package Strings.Questions;

public class ScoreOfaString {
    public static int asciiValue(String sc) {
        int asciivalue = 0;
        int total = 0;
        for (int i = 0; i < sc.length() - 1; i++) {
            // here we r doing casting to get a ascii value of char
            asciivalue = (int) sc.charAt(i) - (int) sc.charAt(i + 1);
            // math.abs convert negative sign to positve like a mod of number
            total += Math.abs(asciivalue);

        }

        return total;
    }

    public static void main(String[] args) {
        String sc = "hello";
        System.out.println(asciiValue(sc));
    }
}
