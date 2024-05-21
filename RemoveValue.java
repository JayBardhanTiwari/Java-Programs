public class RemoveValue {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            int value = 0;
            value = 30 * i;
            if (value == 180) {
                continue;
            }
            System.out.println(value);
        }
    }
}
