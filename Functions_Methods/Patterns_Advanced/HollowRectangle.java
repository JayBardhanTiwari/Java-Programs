package Functions_Methods.Patterns_Advanced;

public class HollowRectangle {
    public static void Hollow_rectangle(int rows, int columns) {
        // outer loop
        for (int i = 1; i <= rows; i++) {
            // inner loop -columns
            for (int j = 1; j <= columns; j++) {
                // cells - (i,j)
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    // boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Hollow_rectangle(6, 7);

    }

}
