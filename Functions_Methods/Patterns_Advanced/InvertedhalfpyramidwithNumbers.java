package Functions_Methods.Patterns_Advanced;

public class InvertedhalfpyramidwithNumbers {
    public static void Inverted_half_Pyramid_withNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            // inverted numbers
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Inverted_half_Pyramid_withNumbers(8);

    }
}
