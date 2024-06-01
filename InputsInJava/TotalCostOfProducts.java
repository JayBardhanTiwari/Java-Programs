package InputsInJava;

import java.util.Scanner;

public class TotalCostOfProducts {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float rubber = sc.nextFloat();

        float total = pen + pencil + rubber;
        System.out.println("Total cost of 3 items is : " + total);

        // with 18% Gst Tax

        float totalcost = total + (total * 0.18f);
        System.out.println("Total cost of 3 products with 18% GST is : " + totalcost);
    }
}
