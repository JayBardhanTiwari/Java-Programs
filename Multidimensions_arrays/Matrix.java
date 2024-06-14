
package Multidimensions_arrays;

import java.util.Scanner;

public class Matrix {
    // search
    public static boolean search(int matrix[][], int key) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("found at index " + "( " + i + "," + j + " )");
                    return true;
                }

            }
        }
        return false;

    }

    // get largest cell
    public static int getLargest(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (largest < matrix[i][j]) {
                    largest = matrix[i][j];
                }
            }
        }
        return largest;

    }

    // get smallest cell
    public static int getSmallest(int matrix[][]) {
        int smallest = Integer.MAX_VALUE;
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (smallest > matrix[i][j]) {
                    smallest = matrix[i][j];
                }
            }
        }
        return smallest;

    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        int key = 8;
        // input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cell values");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                matrix[i][j] = sc.nextInt();

            }
        }
        // output
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
        sc.close();
        search(matrix, key);
        System.out.println("Largest is " + getLargest(matrix));
        System.out.println("Smallest is " + getSmallest(matrix));

    }
}
