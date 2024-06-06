public class CallbyReference {
    public static void update(int marks[], int notchange) {
        notchange = 15;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        // call by reference
        int marks[] = { 78, 87, 98 };

        // call by value
        int notchange = 10;
        update(marks, notchange);
        System.out.println(notchange);

        // to print our marks
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
