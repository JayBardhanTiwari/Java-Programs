package Loops;

public class DiamondStar {
    public static void main(String[] args) {

        for (int outer = 1; outer <= 7; outer++) {
            for (int inner = 1; inner <= outer; inner++) {
                
                System.out.print("*");
            }

            System.out.println();
        }
        for (int outer = 5; outer >= 0; outer--) {
            for (int inner = 1; inner <= outer; inner++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

