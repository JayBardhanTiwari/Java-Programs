public class LaargestOfElementsinArray {
    public static void main(String[] args) {
        int largest[] = { 50, 7, 9, 12, 55, 78, 4, 0 };
        int temp = largest[0];

        for (int i = 0; i < largest.length; i++) {
            if (temp < largest[i]) {
                temp = largest[i];

            }

        }
        System.out.print("largest is ");
        System.out.print(temp);

    }
}
