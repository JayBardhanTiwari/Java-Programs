package Functions_Methods.Patterns_Advanced;

public class InvertedndRotatedhalfPyramid {
    public static void Inverted_rotated_half_pyramid(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

    public static void main(String[] args) {
        Inverted_rotated_half_pyramid(7);

    }
}
