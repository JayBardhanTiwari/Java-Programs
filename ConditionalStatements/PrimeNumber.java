package ConditionalStatements;

public class PrimeNumber {
    public static void main(String[] args) {

        for (int number = 1; number < 100; number++) {
            if (number == 1) {
                System.out.println(number);
                continue;
            }
            boolean isprime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isprime = false;

                }
            }
            if (isprime) {
                System.out.print(number);
                System.out.print(" ");
            }
        }
    }
}
