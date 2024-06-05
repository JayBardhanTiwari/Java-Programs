package Functions_Methods.Patterns_Advanced;

public class FloydsTriangle {
    public static void Floyds_Triangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            // for number
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Floyds_Triangle(5);

    }
}
