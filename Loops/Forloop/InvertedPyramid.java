package Loops.Forloop;

public class InvertedPyramid {
    public static void main(String[] args) {
        for (int outer = 5; outer >=0; outer--) {

            for (int inner = 0; inner <= outer; inner++) {
                System.out.print("*");

            }
            System.out.println("");
        }
    }
}
