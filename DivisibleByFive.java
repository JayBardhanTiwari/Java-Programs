public class DivisibleByFive {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            int value = (i * 2 % 5);
            if (value == 0) {
                System.out.println(i * 2);
            }
        }
    }

}
