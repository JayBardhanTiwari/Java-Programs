package Functions_Methods.Patterns_Advanced;

public class HollowRhombus {
    public static void Hollow_Rhombus(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            // spaces
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= columns; j++) {
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Hollow_Rhombus(10, 10);
    }
}
