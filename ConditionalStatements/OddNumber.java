package ConditionalStatements;
public class OddNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int value = i % 2;
            if (value != 0) {

                System.out.println(i);
            }
        }
    }

}
