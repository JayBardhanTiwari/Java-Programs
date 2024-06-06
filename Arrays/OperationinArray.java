import java.util.Scanner;

public class OperationinArray {
    public static void main(String[] args) {

        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        // int phys;
        // phys = sc.nextInt();
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Physics : " + marks[0]);
        System.out.println("Chemistry : " + marks[1]);
        System.out.println("Math : " + marks[2]);

        // updation
        marks[2] = marks[2] + 1;
        System.out.println("Updation in Math marks : " + marks[2]);

        // percentage
        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage of these marks are : " + percentage + "%");
        // Calculating length
        System.out.println("Length of this array is : " + marks.length);
    }

}
