public class PrintPairsinArray {
    // Time complexcity -- O(n²)

    public static void printPairs(int number[]) {
        int tp = 0;
        // formula for calculating total pair = n(n-1)/2

        for (int i = 0; i < number.length; i++) {
            int count = number[i];
            // pairs
            for (int j = i + 1; j < number.length; j++) {
                System.out.print("(" + count + "," + number[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total count of pairs is : " + tp);

    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        printPairs(number);
    }

}
