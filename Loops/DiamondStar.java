package Loops;

public class DiamondStar {
    public static void main(String[] args) {
        int maxstar = 7;

        for (int outer = 1; outer <= maxstar; outer++) {
            int value = outer % 2;
            if (value != 0) {
                int space = (maxstar - outer) / 2;
                for (int s = 0; s < space; s++) {
                    System.out.print(" ");
                }

                for (int inner = 1; inner <= outer; inner++) {

                    System.out.print("*");

                }
                System.out.println();
            }
        }

    }
}
