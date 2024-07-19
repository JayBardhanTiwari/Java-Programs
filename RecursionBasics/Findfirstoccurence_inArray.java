package RecursionBasics;

public class Findfirstoccurence_inArray {

    public static int findOccurence(int array[], int key, int i) {
        if (i == array.length) {
            return -1;
        }

        if (array[i] == key) {
            return i;
        }

        return findOccurence(array, key, i + 1);
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 4, 5, 7 };
        System.out.println(findOccurence(array, 7, 0));
    }

}
