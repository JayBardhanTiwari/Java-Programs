package Multidimensions_arrays;

class SearchinSortedMatrix {
    public static boolean searchinMatrix(int matrix[][], int key) {
        int rows = 0;
        int columns = matrix[0].length - 1;
        while (rows < matrix.length && columns >= 0) {
            if (matrix[rows][columns] == key) {
                System.out.println("your key is found at " + rows + "," + columns);
                return true;
            } else if (key < matrix[rows][columns]) {
                columns--;

            } else {
                rows++;
            }
        }
        System.out.println("not found");
        return false;

    }

    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        int key = 33;
        searchinMatrix(matrix, key);

    }
}