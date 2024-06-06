public class Largest_Smallestvalues {

    public static int getLargest(int number[]) {
        int largest = Integer.MIN_VALUE;// -infinity
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
        System.out.println("Smallest value is : " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        System.out.println("Largest value is :  " + getLargest(number));

    }
}
