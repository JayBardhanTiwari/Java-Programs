public class LinearSearch {

    public static int linearSearch(int numbers[], int key) {

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        int numbers[] = { 2, 5, 8, 11, 14, 16, 18, 20 };
        int key = 20;
        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("NOT FOUND");

        } else {
            System.out.println("Number is found on the index : " + index);
        }

    }

}
