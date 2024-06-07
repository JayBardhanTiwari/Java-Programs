public class PrintSubArrays {
    public static void printSubarray(int number[]) {
        int tp = 0;
        
        for (int i = 0; i < number.length; i++) {
            int start = i;

            for (int j = i; j < number.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");// subarray
                }
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub pairs are : " + tp);
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        printSubarray(number);
    }
}
